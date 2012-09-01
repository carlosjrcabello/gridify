package br.inf.carlos.swing.grid;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Collection;

import javax.swing.JComponent;

public class GridifyHandler implements Gridify{

	private GridBagConstraints constraints;
	
	public GridifyHandler(){
		if(this.constraints == null){
			this.constraints = new GridBagConstraints();
		}
	}
	
	/**
	 * Uggly link between interface Handlers. Think an another way.
	 * 
	 * @return
	 */
	public GridBagConstraints getGridBagConstraints(){
		return this.constraints;
	}
	
	/**
	 * Uggly link between interface Handlers. Think an another way.
	 * 
	 * @param c
	 */
	public void setGridBagConstraints(GridBagConstraints c){
		
		if(c == null){
			throw new NullPointerException("GridBagConstraints cannot be null.");
		}
		this.constraints = c;
	}

	private GridifyHandler(GridBagConstraints constraints) {
		super();
		this.constraints = constraints;
		
		if(this.constraints == null){
			throw new NullPointerException("You must inform an GridBagConstraints object when use private constructors.");
		}
	}

	@Override
	public Gridify atLine(int line) {
		
		this.constraints.gridy = line;
		
		GridifyHandler g = new GridifyHandler(constraints);
		
		return g;
	}

	@Override
	public Gridify atColumn(int column) {
		this.constraints.gridx = column;
		
		GridifyHandler g = new GridifyHandler(constraints);
		
		return g;
	}

	@Override
	public Gridify colspan(int cols) {
		this.constraints.gridwidth = cols;
		
		GridifyHandler g = new GridifyHandler(constraints);
		
		return g;
	}

	@Override
	public Gridify rowspan() {
		this.constraints.gridheight = 3;//GridBagConstraints.RELATIVE;
		
		GridifyHandler g = new GridifyHandler(constraints);
		
		return g;
	}

	@Override
	public Gridify alignment(int alignment) {
		this.constraints.anchor = alignment;
		
		GridifyHandler g = new GridifyHandler(constraints);
		
		return g;
	}

	@Override
	public GridBagConstraints gridify() {
		return this.constraints;
	}

	@Override
	public void add(JComponent element, JComponent panel) {
		if(!panel.getLayout().getClass().equals(GridBagLayout.class)){
			throw new IllegalArgumentException("The panel component must use GridBagLayout as layout manager. Use panel.setLayout(new GridBagLayout()) to set.");
		}
		
		if(element == null){
			throw new NullPointerException("The element component could not be null.");
		}
		
		if(element.equals(panel)){
			throw new NullPointerException("The element could not be inserted at itself.");
		}
		
		panel.add(element, this.constraints);
		
		this.constraints = new GridBagConstraints();
	}

	@Override
	public void add(Collection<JComponent> elements, JComponent panel) {
		System.out.println("column: " + this.constraints.gridx);
		
		int i = this.constraints.gridx;
		for (JComponent element : elements) {
			panel.add(element, this.constraints);
			i++;
			this.constraints.gridx = i;
		}
	}

	@Override
	public Gridify fill() {
		this.constraints.fill = GridBagConstraints.BOTH;
		
		GridifyHandler g = new GridifyHandler(constraints);
		
		return g;
	}

	@Override
	public Align align() {
		
		Align aligner = new AlignHandler(this);
		
		return aligner;
	}

	@Override
	public Margin margin() {
		
		Margin margin = new MarginHandler(this);
		
		return margin;
	}
}

package br.inf.carlos.gridify;

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
		this.dumpConstraints(this.constraints);
		panel.add(element, this.constraints);
		
		this.constraints = new GridBagConstraints();
	}
	
	private void dumpConstraints(GridBagConstraints c){
		System.out.println("c.gridx = " + c.gridx);
		System.out.println("c.gridy = " + c.gridy);
		System.out.println("c.fill = " + c.fill);
		System.out.println("c.anchor = " + c.anchor);
		System.out.println("\n");
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
	public Align align() {
		
		Align aligner = new AlignHandler(this);
		
		return aligner;
	}

	@Override
	public Margin margin() {
		
		Margin margin = new MarginHandler(this);
		
		return margin;
	}

	@Override
	public Grid grid() {
		Grid grid = new GridHandler(this);
		
		return grid;
	}

	@Override
	public Fill fill() {
		Fill fill = new FillHandler(this);
		
		return fill;
	}
}

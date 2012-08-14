package br.inf.carlos.swing.grid;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Collection;

import javax.swing.JComponent;

public class Grid implements GridBag{

	private GridBagConstraints constraints;
	
	public Grid(){
		if(this.constraints == null){
			this.constraints = new GridBagConstraints();
		}
	}

	private Grid(GridBagConstraints constraints) {
		super();
		this.constraints = constraints;
		
		if(this.constraints == null){
			throw new NullPointerException("You must inform an GridBagConstraints object when use private constructors.");
		}
	}

	@Override
	public GridBag atLine(int line) {
		
		this.constraints.gridy = line;
		
		Grid g = new Grid(constraints);
		
		return g;
	}

	@Override
	public GridBag atColumn(int column) {
		this.constraints.gridx = column;
		
		Grid g = new Grid(constraints);
		
		return g;
	}

	@Override
	public GridBag colspan(int cols) {
		this.constraints.gridwidth = cols;
		
		Grid g = new Grid(constraints);
		
		return g;
	}

	@Override
	public GridBag rowspan(int rows) {
		this.constraints.gridheight = rows;
		
		Grid g = new Grid(constraints);
		
		return g;
	}

	@Override
	public GridBag alignment(int alignment) {
		this.constraints.anchor = alignment;
		
		Grid g = new Grid(constraints);
		
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
	public GridBag withMargins(int top, int left, int bottom, int right) {
		this.constraints.insets = new Insets(top, left, bottom, right);
		
		Grid g = new Grid(constraints);
		
		return g;
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
	
}

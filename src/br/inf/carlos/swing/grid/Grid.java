package br.inf.carlos.swing.grid;

import java.awt.GridBagConstraints;

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
			throw new NullPointerException("You must inform an GridBagConstraints object when use private constructors.d");
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GridBag rowspan(int rows) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GridBag alignment(int alignment) {
		this.constraints.anchor = alignment;
		
		Grid g = new Grid(constraints);
		
		return g;
	}

	@Override
	public GridBagConstraints gridify() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(JComponent element, JComponent panel) {
		panel.add(element, this.constraints);
	}
	
}

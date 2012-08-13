package br.inf.carlos.swing.grid;

import java.awt.GridBagConstraints;

import javax.swing.JComponent;

public class Grid implements GridBag{

	private GridBagConstraints constraints;
	
	public Grid(){
		
	}

	private Grid(GridBagConstraints constraints) {
		super();
		this.constraints = constraints;
	}

	@Override
	public GridBag atLine(int line) {
		
		Grid g = new Grid(constraints);
		
		return g;
	}

	@Override
	public GridBag atColumn(int column) {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
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

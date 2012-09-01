package br.inf.carlos.swing.grid;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class MarginHandler implements Margin{

	private final GridifyHandler gridify;
	
	private final GridBagConstraints constraints;
	
	public MarginHandler(Gridify gridify) {
		super();
		this.gridify = (GridifyHandler) gridify;
		
		this.constraints = this.gridify.getGridBagConstraints();
	}

	@Override
	public Gridify margin(int top, int left, int bottom, int right) {
		
		this.constraints.insets = new Insets(top, left, bottom, right);
		
		this.gridify.setGridBagConstraints(constraints);
		
		return this.gridify;
	}

	@Override
	public Gridify top(int top) {
		return this.margin(top, 0, 0, 0);
	}

	@Override
	public Gridify bottom(int bottom) {
		return this.margin(0, 0, bottom, 0);
	}

	@Override
	public Gridify left(int left) {
		return this.margin(0, left, 0, 0);
	}

	@Override
	public Gridify right(int right) {
		return this.margin(0, 0, 0, right);
	}
}

package br.inf.carlos.gridify;

import java.awt.GridBagConstraints;

public class FillHandler implements Fill{

	private final GridifyHandler gridify;
	
	private final GridBagConstraints constraints;
	
	public FillHandler(Gridify gridify) {
		super();
		this.gridify = (GridifyHandler) gridify;
		
		this.constraints = this.gridify.getGridBagConstraints();
	}

	@Override
	public Gridify horizontal() {
		this.constraints.fill = GridBagConstraints.HORIZONTAL;
		this.gridify.setGridBagConstraints(constraints);
		
		return this.gridify;
	}

	@Override
	public Gridify vertical() {
		this.constraints.fill = GridBagConstraints.VERTICAL;
		this.gridify.setGridBagConstraints(constraints);
		
		return this.gridify;
	}

	@Override
	public Gridify both() {
		this.constraints.fill = GridBagConstraints.BOTH;
		this.constraints.gridwidth 	= GridBagConstraints.RELATIVE;
		this.constraints.weightx = 1.0;
		this.constraints.weighty = 1.0;
		this.gridify.setGridBagConstraints(constraints);
		
		return this.gridify;
	}
}

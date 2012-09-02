package br.inf.carlos.gridify;

import java.awt.GridBagConstraints;

public class AlignHandler implements Align{
	
	private static final int LEFT 			= GridBagConstraints.WEST;
	
	private static final int RIGHT 			= GridBagConstraints.EAST;
	
	private static final int CENTER 			= GridBagConstraints.BOTH;
	
	private static final int NORTH 			= GridBagConstraints.NORTH;
	
	private static final int NORTH_RIGHT 	= GridBagConstraints.NORTHEAST;
	
	private static final int NORTH_LEFT 		= GridBagConstraints.NORTHWEST;

	private static final int SOUTH 			= GridBagConstraints.SOUTH;
	
	private static final int SOUTH_RIGHT 	= GridBagConstraints.SOUTHEAST;
	
	private static final int SOUTH_LEFT 		= GridBagConstraints.SOUTHWEST;
	
	private final GridifyHandler gridify;
	
	private final GridBagConstraints constraints;
	
	public AlignHandler(Gridify gridify) {
		super();
		this.gridify = (GridifyHandler) gridify;
		
		this.constraints = this.gridify.getGridBagConstraints();
	}

	@Override
	public Gridify top() {
		this.constraints.anchor = NORTH;
		
		this.gridify.setGridBagConstraints(constraints);
		
		return this.gridify;
	}

	@Override
	public Gridify topRight() {
		this.constraints.anchor = NORTH_RIGHT;
		
		this.gridify.setGridBagConstraints(constraints);
		
		return this.gridify;
	}

	@Override
	public Gridify topLeft() {
		this.constraints.anchor = NORTH_LEFT;
		
		this.gridify.setGridBagConstraints(constraints);
		
		return this.gridify;
	}

	@Override
	public Gridify bottom() {
		this.constraints.anchor = SOUTH;
		
		this.gridify.setGridBagConstraints(constraints);
		
		return this.gridify;
	}

	@Override
	public Gridify bottomRight() {
		this.constraints.anchor = SOUTH_RIGHT;
		
		this.gridify.setGridBagConstraints(constraints);
		
		return this.gridify;
	}

	@Override
	public Gridify bottomLeft() {
		this.constraints.anchor = SOUTH_LEFT;
		
		this.gridify.setGridBagConstraints(constraints);
		
		return this.gridify;
	}

	@Override
	public Gridify centered() {
		this.constraints.anchor = CENTER;
		
		this.gridify.setGridBagConstraints(constraints);
		
		return this.gridify;
	}

	@Override
	public Gridify left() {
		this.constraints.anchor = LEFT;
		
		this.gridify.setGridBagConstraints(constraints);
		
		return this.gridify;
	}

	@Override
	public Gridify right() {
		this.constraints.anchor = RIGHT;
		
		this.gridify.setGridBagConstraints(constraints);
		
		return this.gridify;
	}
}

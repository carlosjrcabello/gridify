package br.inf.carlos.swing.grid;

import java.awt.GridBagConstraints;

import javax.swing.JComponent;

public interface GridBag {

	static final int LEFT 	= GridBagConstraints.WEST;
	
	static final int RIGHT 	= GridBagConstraints.EAST;
	
	static final int CENTER 	= GridBagConstraints.BOTH;

	/**
	 * Set line position on {@code GridBagConstraints} object.
	 * 
	 * @param line
	 * 
	 * @return
	 */
	GridBag atLine(int line);
	
	/**
	 * Set column position on {@code GridBagConstraints} object.
	 * 
	 * @param column
	 * 
	 * @return
	 */
	GridBag atColumn(int column);
	
	GridBag colspan(int cols);
	
	GridBag rowspan(int rows);
	
	GridBag alignment(int alignment);
	
	void add(JComponent element, JComponent panel);
	
	GridBagConstraints gridify();
}

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
	
	/**
	 * Automatizes the {@code JComponent#add(java.awt.Component, Object)} using
	 * configured {@code GridBagConstraints} object.
	 * 
	 * @param element
	 * 
	 * @param panel
	 * 
	 * @see JComponent#add(java.awt.Component, Object)
	 */
	void add(JComponent element, JComponent panel);
	
	/**
	 * Returns an configured instance of {@code GridBagConstraints}.
	 * 
	 * @return
	 */
	GridBagConstraints gridify();
}

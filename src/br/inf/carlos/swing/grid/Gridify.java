package br.inf.carlos.swing.grid;

import java.awt.GridBagConstraints;
import java.util.Collection;

import javax.swing.JComponent;

public interface Gridify {
	
	Align align();
	
	Margin margin();

	@Deprecated
	Gridify fill();

	/**
	 * Set line position on {@code GridBagConstraints} object.
	 * 
	 * @param line
	 * 
	 * @return
	 */
	Gridify atLine(int line);
	
	/**
	 * Set column position on {@code GridBagConstraints} object.
	 * 
	 * @param column
	 * 
	 * @return
	 */
	Gridify atColumn(int column);
	
	Gridify colspan(int cols);
	
	Gridify rowspan();
	
	@Deprecated
	Gridify alignment(int alignment);
	
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
	
	void add(Collection<JComponent> elements, JComponent panel);
	
	/**
	 * Returns an configured instance of {@code GridBagConstraints}.
	 * 
	 * @return
	 */
	GridBagConstraints gridify();
}

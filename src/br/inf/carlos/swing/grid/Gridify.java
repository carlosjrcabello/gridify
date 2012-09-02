package br.inf.carlos.swing.grid;

import java.awt.GridBagConstraints;
import java.util.Collection;

import javax.swing.JComponent;

public interface Gridify {
	
	Fill fill();
	
	Grid grid();
	
	Align align();
	
	Margin margin();

	@Deprecated
	Gridify colspan(int cols);
	
	@Deprecated
	Gridify rowspan();
	
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
	
	@Deprecated
	void add(Collection<JComponent> elements, JComponent panel);
	
	/**
	 * Returns an configured instance of {@code GridBagConstraints}.
	 * 
	 * @return
	 */
	GridBagConstraints gridify();
}

package br.inf.carlos.swing.grid;

import java.awt.GridBagConstraints;

import javax.swing.JComponent;

public interface GridBag {

	int LEFT 	= 0;
	
	int RIGHT 	= 1;
	
	int CENTER = 2;

	GridBag atLine(int line);
	
	GridBag atColumn(int column);
	
	GridBag colspan(int cols);
	
	GridBag rowspan(int rows);
	
	GridBag alignment(int alignment);
	
	void add(JComponent element, JComponent panel);
	
	GridBagConstraints gridify();
}

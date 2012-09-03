package br.inf.carlos.gridify;

import java.awt.event.ActionListener;

import javax.swing.JPanel;

public interface Selector {
	
	Selector in(JPanel panel);
	
	Selector bind(String action, ActionListener actionListener);

	Gridify select();
	
	Gridify buttons();
}

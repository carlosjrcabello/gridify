package br.inf.carlos.gridify;

import java.awt.Component;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SelectorHandler implements Selector{

	private final GridifyHandler gridify;
	
	private JPanel panel;
	
	public SelectorHandler(Gridify gridify) {
		super();
		this.gridify = (GridifyHandler) gridify;
	}
	
	@Override
	public Gridify buttons() {
		
		if(this.panel == null){
			throw new NullPointerException("You must pass an instance of JPanel.");
		}
		
		Component[] components = this.panel.getComponents();
		
		for (Component component : components) {
			if(component instanceof JButton){
				
			}
		}
		
		return null;
	}

	@Override
	public Selector in(JPanel panel) {
		this.panel = panel;
		
		return this;
	}

	@Override
	public Gridify select() {
		return null;
	}

	@Override
	public Selector bind(String action, ActionListener actionListener) {
		// TODO Auto-generated method stub
		return null;
	}
}

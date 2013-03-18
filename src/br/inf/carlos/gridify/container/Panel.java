package br.inf.carlos.gridify.container;

import java.awt.GridBagLayout;

import javax.annotation.PostConstruct;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Panel extends JPanel implements IPanel{

	private static final long serialVersionUID = 1L;
	
	private String title;
	
	public Panel(String title){
		this.title = title;
		
		this.afterInit();
	}
	
	public Panel(){
		this.afterInit();
	}
	
	@PostConstruct
	private void afterInit(){
		if(title != null){
			this.setBorder(BorderFactory.createTitledBorder(title));
		}
		this.setLayout(new GridBagLayout());
	}
}

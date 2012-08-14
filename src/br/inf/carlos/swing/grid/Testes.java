package br.inf.carlos.swing.grid;

import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Testes {

	public static void main(String[] args) {
		GridBag grid = new Grid();
		
		JPanel panel =  new JPanel(new GridBagLayout());
		JButton bu = new JButton("champz");
		
		grid.atLine(0).atColumn(0).alignment(GridBag.LEFT).add(bu, panel);
	}
}

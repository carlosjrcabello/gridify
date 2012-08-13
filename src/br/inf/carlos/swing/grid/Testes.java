package br.inf.carlos.swing.grid;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Testes {

	public static void main(String[] args) {
		GridBag grid = new Grid();
		
		grid.atLine(0).atColumn(0).alignment(GridBag.LEFT);
		
		JPanel panel;
		JButton bu;
	}
}

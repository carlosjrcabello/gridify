package br.inf.carlos.swing.grid;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Testes {

	public static void main(String[] args) {
		GridBag grid = new Grid();
		
		JPanel panel =  new JPanel(new GridBagLayout());
		JButton bu = new JButton("champz");
		JButton bu2 = new JButton("champz 2");
		
		grid.atLine(1).atColumn(1).alignment(GridBag.LEFT).withMargins(50, 10, -10, 10).add(bu2, panel);
		
		grid.atLine(0).atColumn(0).alignment(GridBag.LEFT).withMargins(10, 10, 10, 10).add(bu, panel);
		
		Collection<JComponent> buttons = new ArrayList<JComponent>(0);
		
		for (int i = 0; i < 10; i++) {
			JButton b = new JButton("bt: " + i);
			buttons.add(b);
		}
		
		grid.atLine(2).atColumn(0).withMargins(10, 10, 10, 10).alignment(GridBag.LEFT).add(buttons, panel);
		
		JFrame frame = new JFrame();

		frame.getContentPane().add(panel);
		frame.setSize(new Dimension(900, 300));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Teste");
	}
}

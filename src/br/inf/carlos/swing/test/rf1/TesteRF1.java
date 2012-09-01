package br.inf.carlos.swing.test.rf1;

import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.inf.carlos.swing.grid.GridifyHandler;
import br.inf.carlos.swing.grid.Gridify;

public class TesteRF1 {

	public static void main(String[] args) {
		
		JPanel panel = new JPanel(new GridBagLayout());
		
		Gridify gridify = new GridifyHandler();
		
		gridify.align().left().margin().left(10).add(new JLabel("Foo: "), panel);
	}
}

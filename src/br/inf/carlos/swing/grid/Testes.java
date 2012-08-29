package br.inf.carlos.swing.grid;

import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Testes {

	public static void main(String[] args) {
		Gridify gridify = new GridBagConstraintsImpl();
		
		JPanel panel =  new JPanel(new GridBagLayout());
		
		// Login icon.
		Icon icon = new ImageIcon("./preferences_system_login.png");
		gridify.atLine(0).atColumn(0).rowspan().add(new JLabel(icon), panel);
		
		// Username line.
		gridify.atLine(1).atColumn(1).margins(5).add(new JLabel("Username:"), panel);
//		JTextField username = new JTextField();
//		username.setPreferredSize(new Dimension(150, 21));
//		gridify.atLine(1).atColumn(2).add(username, panel);
//		
//		
//		// Password line.
		gridify.atLine(2).atColumn(1).margins(5).add(new JLabel("Password:"), panel);
//		JPasswordField password = new JPasswordField();
//		gridify.atLine(2).atColumn(2).fill().top(5).add(password, panel);
		
		// Kill session. (this uses two lines)
		JCheckBox killSession = new JCheckBox("OMG, don't kill my session through ignorance");
		
		gridify.atLine(3).atColumn(0).colspan(3).top(5).add(killSession, panel);
		
		
		JFrame frame = new JFrame();

		frame.getContentPane().add(panel);
		frame.setSize(new Dimension(600, 300));//
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Teste");
		frame.pack();
	}
}

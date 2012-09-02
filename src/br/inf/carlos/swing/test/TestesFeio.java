package br.inf.carlos.swing.test;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TestesFeio {

	public static void main(String[] args) {
		JPanel panel =  new JPanel(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		
		
		c.gridy 		= 0;
		c.gridx 		= 0;
		c.gridheight 	= 3;
		c.insets		= new Insets(10, 0, 0, 10);
		// Login icon.
		Icon icon = new ImageIcon("./preferences_system_login.png");
		panel.add(new JLabel(icon), c);
		
		c = new GridBagConstraints();
		c.gridy 		= 1;
		c.gridx 		= 1;
		c.insets		= new Insets(2, 2, 0, 0);
		panel.add(new JLabel("Username: "), c);
		
		c = new GridBagConstraints();
		c.gridy 		= 1;
		c.gridx 		= 2;
		c.insets		= new Insets(10, 0, 0, 0);
		c.fill 			= GridBagConstraints.HORIZONTAL;
		JTextField username = new JTextField();
		username.setPreferredSize(new Dimension(150, 21));
		panel.add(username, c);
		
		c = new GridBagConstraints();
		c.gridy 		= 2;
		c.gridx 		= 1;
		panel.add(new JLabel("Password: "), c);
		
		c = new GridBagConstraints();
		c.gridy 		= 2;
		c.gridx 		= 2;
		c.fill 			= GridBagConstraints.HORIZONTAL;
		JPasswordField password = new JPasswordField();
		panel.add(password, c);
		
		c = new GridBagConstraints();
		c.gridy 		= 3;
		c.gridx 		= 1;
		c.fill 			= GridBagConstraints.HORIZONTAL;
		c.gridwidth		= 4;
		c.anchor		= GridBagConstraints.WEST;
		JCheckBox help = new JCheckBox("OMG, help me!");
		panel.add(help, c);
		
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JFrame frame = new JFrame();

		frame.getContentPane().add(panel);
		frame.setSize(new Dimension(600, 300));//
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Teste Feio");
		frame.pack();
	}
}

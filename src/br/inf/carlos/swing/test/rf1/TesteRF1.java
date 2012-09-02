package br.inf.carlos.swing.test.rf1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import br.inf.carlos.swing.grid.Gridify;
import br.inf.carlos.swing.grid.GridifyHandler;

public class TesteRF1 {

	public static void main(String[] args) {
		
		JPanel panel = new JPanel(new GridBagLayout());
		panel.setBorder(BorderFactory.createTitledBorder("Sample:"));
		
		Gridify gridify = new GridifyHandler();
		
		gridify
			.grid().line(0)
			.grid().column(0)
			.align().left()
			.margin().left(10)
			.add(new JLabel("Line 0 - Column 0: "), panel);
		
		gridify
		.grid().line(0)
		.grid().column(1)
		.align().left()
		.margin().left(10)
		.add(new JLabel("Line 0 - Column 1: "), panel);
		
		final JTextArea text = new JTextArea(5, 20);
		final JScrollPane pane = new JScrollPane(text);
		
		gridify
		.grid().line(1)
		.grid().column(0)
		.align().left()
		.fill().both()
		.margin().same(5)
		.add(pane, panel);
		
		final JTextField field = new JTextField(25);
		
		gridify
		.grid().line(2)
		.grid().column(0)
		.align().left()
		.fill().horizontal()
		.margin().same(5)
		.add(field, panel);
		
		gridify
			.grid().line(3)
			.grid().column(0)
			.align().left()
			.add(new JLabel("User: "), panel);
		
		gridify
		.grid().line(3)
		.grid().column(1)
		.align().right()
		.add(new JLabel("Password: "), panel);
		
		gridify
		.grid().line(4)
		.grid().column(0)
		.fill().horizontal()
		.add(new JTextField(), panel);
		
		gridify
		.grid().line(4)
		.grid().column(1)
		.fill().horizontal()
		.add(new JPasswordField(), panel);
		
		
		gridify
		.grid().line(0)
		.grid().column(0)
		.align().right()
		.margin().same(2)
		.add(new JLabel("Username: "), panel);
		
		runFrame(panel);
	}
	
	static void runFrame(JPanel panel){
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
		frame.getContentPane().setLayout(new BorderLayout());
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.setSize(new Dimension(600, 300));//
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Gridify(..)");
		frame.setLocation(300, 300);
		// frame.pack();
	}
}

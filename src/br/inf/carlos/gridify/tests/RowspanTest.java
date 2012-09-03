package br.inf.carlos.gridify.tests;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import br.inf.carlos.gridify.Gridify;
import br.inf.carlos.gridify.GridifyHandler;

public class RowspanTest {

	public static void main(String[] args) {
		
		JPanel panel = new JPanel(new GridBagLayout());
		panel.setBorder(BorderFactory.createTitledBorder("Panel 1:"));
		panel.setPreferredSize(new Dimension(200, 100));
		
		Gridify gridify = new GridifyHandler();
		
		gridify
			.grid().line(0)
			.grid().column(0)
			.align().right()
			
			.add(new JLabel("XY: 0,0"), panel);
		
		gridify
			.grid().line(0)
			.grid().column(1)
			.align().right()
			
			.add(new JLabel("XY: 1,0"), panel);
		
		final JPanel panel2 = new JPanel(new GridBagLayout());
		panel2.setBorder(BorderFactory.createTitledBorder("Panel 2:"));
		
		
		JPanel container = new JPanel(new GridBagLayout());
		
		gridify.grid().line(0).grid().column(0).grid().width(.5)
			.add(panel, container);
		gridify.grid().line(0).grid().column(1).fill().both().add(panel2, container);
		
		runFrame(container);
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

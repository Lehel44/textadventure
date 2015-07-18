package com.game.main;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class View {

	private JFrame f;
	JTextArea textArea;
	private JButton button1, button2, button3;

	public void init() {

		f = new JFrame("Hello, !");
		// Sets the behavior for when the window is closed
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Add a layout manager so that the button is not placed on top of the
		// label
		f.setLayout(new GridBagLayout());
		GridBagConstraints gBC = new GridBagConstraints();
		gBC.fill = GridBagConstraints.HORIZONTAL;
		// Add a label and a button
		gBC.weightx = 0.5;
		gBC.gridx = 0;
		gBC.gridy = 0;
		f.add(new JTextArea("Inventory"), gBC);
		gBC.weightx = 0.5;
		// gBC.gridheight = 10;
		gBC.gridwidth = 4;
		gBC.gridx = 1;
		gBC.fill = GridBagConstraints.EAST;
		gBC.gridy = 0;
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		// textArea.setWrapStyleWord(true);
		f.add(textArea, gBC);
		gBC.fill = GridBagConstraints.HORIZONTAL;
		// gBC.gridheight = 11;
		gBC.weightx = 0.5;
		gBC.gridwidth = 1;
		gBC.gridx = 4;
		gBC.gridy = 0;
		f.add(new JTextArea("Skills"), gBC);
		// gBC.gridheight = 1;
		gBC.weightx = 0.5;
		gBC.gridx = 1;
		gBC.gridy = 1;
		button1 = new JButton();
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.stationName = Main.station.getExits().get(button1.getText()) + ".txt";
				// display/center the jdialog when the button is pressed
				JDialog d = new JDialog(f, "Hello", true);
				System.out.println(Main.station.getExits().get(button1.getText()) + ".txt");
			}
		});
		f.add(button1, gBC);
		gBC.weightx = 0.5;
		gBC.gridx = 2;
		gBC.gridy = 1;
		button2 = new JButton();
		f.add(button2 = new JButton(), gBC);
		gBC.weightx = 0.5;
		gBC.gridx = 3;
		gBC.gridy = 1;
		button3 = new JButton();
		f.add(button3, gBC);
		// Arrange the components inside the window
		f.pack();
		// By default, the window is not visible. Make it visible.
		f.setVisible(true);
	}

	public JFrame getF() {
		return f;
	}

	public void setF(JFrame f) {
		this.f = f;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public JButton getButton1() {
		return button1;
	}

	public void setButton1(JButton button1) {
		this.button1 = button1;
	}

	public JButton getButton2() {
		return button2;
	}

	public void setButton2(JButton button2) {
		this.button2 = button2;
	}

	public JButton getButton3() {
		return button3;
	}

	public void setButton3(JButton button3) {
		this.button3 = button3;
	}

}

package com.game.main;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.print.attribute.TextSyntax;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class View {
	int init() {
		JFrame f = new JFrame("Hello, !");
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
		JTextArea textArea = new JTextArea("Shamok területén élõ shadoniak és nomádok életét.");
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		//textArea.setWrapStyleWord(true);
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
		f.add(new JButton("1"), gBC);
		gBC.weightx = 0.5;
		gBC.gridx = 2;
		gBC.gridy = 1;
		f.add(new JButton("2"), gBC);
		gBC.weightx = 0.5;
		gBC.gridx = 3;
		gBC.gridy = 1;
		f.add(new JButton("3"), gBC);
		// Arrange the components inside the window
		f.pack();
		// By default, the window is not visible. Make it visible.
		f.setVisible(true);
		return 0;
	}
}

package edu.nvcc.csc201.salesreport.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SalesReportGUI extends JFrame {
	Faculty aFaculty = new Faculty();
	JLabel jlblDisplay = new JLabel("output", JLabel.CENTER);
	JTextArea jtxtADisplay = new JTextArea("output area", 5, 10);
	JButton jbtnClear = new JButton("Clear!");
	JButton jbtnExit = new JButton("Exit!");
	JPanel btnPanel = new JPanel();

	public SalesReportGUI() {
		super("Sale Report");
		String test = "Hello" + "\n" + "test";
		jlblDisplay.setText(test);

		jtxtADisplay.setText(aFaculty.toString());
		jtxtADisplay.setEditable(true);
		btnPanel.setBackground(Color.DARK_GRAY);

		jbtnClear.addActionListener(new ClearAction());
		jbtnExit.addActionListener(new ExitAction());
		btnPanel.add(jbtnClear, new BorderLayout().WEST);
		btnPanel.add(jbtnExit, new BorderLayout().EAST);

		add(jtxtADisplay, new BorderLayout().CENTER);
		add(jlblDisplay, new BorderLayout().NORTH);
		add(btnPanel, new BorderLayout().SOUTH);

		pack();
	}

	public class ClearAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			jtxtADisplay.setText("");
		}
	}

	public class ExitAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
}

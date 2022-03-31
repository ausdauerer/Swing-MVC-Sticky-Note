package com.jcg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;


public class Controller implements ActionListener {
	
	private JTextArea messageField;
	private Model model;
	private JTextField header;

	public Controller(JTextField header,JTextArea searchTermTextField,Model model) {
		super();
		this.messageField = searchTermTextField;
		this.model=model;
		this.messageField.setText(model.getText());
		this.header=header;
		this.header.setText("Version : "+model.getVersion());
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println(e.getActionCommand());
		if((e.getActionCommand()).compareTo("Clear")==0){
			this.messageField.setText("");
			System.out.println("Successfully cleared the text");
		}
		else if((e.getActionCommand()).compareTo("Save")==0){
			model.setText(messageField.getText());
			model.db.saveNote(model);
		}
		else if((e.getActionCommand()).compareTo("font++")==0){
			this.messageField.setFont(new Font("Verdana", Font.BOLD, 15));
		}
		else if((e.getActionCommand()).compareTo("font--")==0){
			this.messageField.setFont(new Font("Verdana", Font.BOLD, 9));
		}
		else{
			System.out.println("Hello");
		}
	}

}

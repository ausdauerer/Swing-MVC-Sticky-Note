package com.jcg;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;

/**
 * @author ashraf
 *
 */
public class View {

	public View() {
		
		Model model=new Model();
		

		JTextField textfield=new JTextField();
		JTextArea text=new JTextArea();
		text.setBounds(10,50,580,380);  
		JButton button = new JButton("Save");
		JButton erasebutton=new JButton("Clear");
		button.setBounds(150,450,100,50);
		textfield.setBounds(10,10,580,30);
		textfield.setEditable(false);

		Controller controller = new Controller(textfield,text,model);
		button.addActionListener(controller);
		erasebutton.addActionListener(controller);
		erasebutton.setBounds(300,450,100,50);

		JFrame frame = new JFrame("Sticky Note");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.add(text);
		frame.add(button);
		frame.add(erasebutton);
		frame.add(textfield);
		frame.setSize(600,550);
        frame.show();
	}

}

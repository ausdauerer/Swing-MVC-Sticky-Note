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
		

		JTextArea text=new JTextArea();
		text.setBounds(10,10,580,380);  
		JButton button = new JButton("Save");
		JButton erasebutton=new JButton("Clear");
		erasebutton.setBounds(350,400,100,50);
		button.setBounds(150,400,100,50);

		Controller controller = new Controller(text,model);
		button.addActionListener(controller);
		erasebutton.addActionListener(controller);
		erasebutton.setBounds(300,400,100,50);

		JFrame frame = new JFrame("Swing MVC Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.add(text);
		frame.add(button);
		frame.add(erasebutton);
		frame.setSize(600,500);
        frame.show();
	}

}

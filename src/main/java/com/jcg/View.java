package com.jcg;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
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
		
		Font font = new Font("Verdana", Font.BOLD, 12);
		JTextField textfield=new JTextField();
		JTextArea text=new JTextArea();
		text.setFont(font);
		text.setBounds(10,50,580,380);  
		JButton button = new JButton("Save");
		JButton erasebutton=new JButton("Clear");
		button.setBounds(50,450,100,50);
		textfield.setBounds(10,10,580,30);
		textfield.setEditable(false);
		JButton inc=new JButton("font++");
		inc.setBounds(440,450,100,50);
		JButton dec=new JButton("font--");
		dec.setBounds(310,450,100,50);

		Controller controller = new Controller(textfield,text,model);
		button.addActionListener(controller);
		erasebutton.addActionListener(controller);
		erasebutton.setBounds(180,450,100,50);
		inc.addActionListener(controller);
		dec.addActionListener(controller);

		JFrame frame = new JFrame("Sticky Note");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.add(text);
		frame.add(button);
		frame.add(erasebutton);
		frame.add(textfield);
		frame.add(inc);
		frame.add(dec);
		frame.setSize(600,550);
        frame.show();
	}

}

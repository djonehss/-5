package syfour;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import syfour.SyfiveFrame;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JToggleButton;
import javax.swing.JTable;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;


public class SyfiveCourse extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	
	public SyfiveCourse() {
		setTitle("\u5F53\u524D\u9009\u8BFE\u4FE1\u606F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 441, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		textField = new JTextField();
		
		try {
            BufferedReader bufferedReader =new BufferedReader(new FileReader("D://1.txt"));
            String str =textField.getText();
            while(null !=(str=bufferedReader.readLine())) {
            	
            	textField.setText(str);
            
            }
        }catch (IOException e) {
            e.printStackTrace();
            	
        }
       
		textField.setBounds(21, 60, 396, 298);
		contentPane.add(textField);
		textField.setColumns(10);
	
    
	
}
	}
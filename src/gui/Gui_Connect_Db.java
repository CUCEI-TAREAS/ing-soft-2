package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class Gui_Connect_Db {

	private JTextField
    private JFrame gui_connect_db;
    
    public Gui_Connect_Db(){};

    public void init(){

		
        gui_connect_db = new JFrame();
        gui_connect_db.setVisible(true);
    }
}

/*
	JButton jb1 = new JButton("NORTH");    
	JButton jb2 = new JButton("SOUTH");
	JButton jb3 = new JButton("WEST");     
	JButton jb4 = new JButton("EAST");
	JButton jb5 = new JButton("CENTER");       
	 
	// Define the panel to hold the buttons
	JPanel panel = new JPanel();
	panel.setLayout(new BorderLayout());
	panel.add(jb1, BorderLayout.NORTH);
	panel.add(jb2, BorderLayout.SOUTH);
	panel.add(jb3, BorderLayout.WEST);
	panel.add(jb4, BorderLayout.EAST);
	panel.add(jb5, BorderLayout.CENTER);
*/


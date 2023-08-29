package QuizApplication;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
	JButton button1;
	JButton back;
	JTextField t;
	
	Login(){
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(getClass().getResource("icons/login.jpeg"));
		JLabel image = new JLabel(i1);
		image.setBounds(0,0,600,500);
		
		add(image);
		
		JLabel heading = new JLabel("Simple Minds");
		heading.setBounds(750,60,300,45);
		heading.setFont(new Font("Lucida Calligraphy",Font.BOLD,35));
		heading.setForeground(new Color(120,10,20));
		add(heading);
		
		JLabel name = new JLabel("Enter Your Name");
		name.setBounds(810,150,300,20);
		name.setFont(new Font("Segoe Script",Font.BOLD,20));
		name.setForeground(Color.BLUE);
		add(name);
		
		 t = new JTextField();
		t.setBounds(750,190,300,20);
		t.setFont(new Font("Chiller",Font.PLAIN,26));
		t.setForeground(Color.DARK_GRAY);
		add(t);
		
		 button1 = new JButton("Next");
		button1.setBounds(780,270,100,25);
		button1.setBackground(Color.black);
		button1.setForeground(Color.white);
		button1.addActionListener(this);
		add(button1);
		
		back = new JButton("Back");
		back.setBounds(900,270,100,25);
		back.setBackground(Color.black);
		back.setForeground(Color.white);
		back.addActionListener(this);
		add(back);
		
	
		setSize(1200,500);
		setLocation(200,150);
		setVisible(true);
	}	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new Login();

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			String name = t.getText();
			setVisible(false);
			new button1(name);
			}
		else if(e.getSource()==back) {
			setVisible(false);
		}
		
		
	}

}

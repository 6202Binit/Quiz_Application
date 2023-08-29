package QuizApplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class button1 extends JFrame implements ActionListener{
	String name;
	JButton button1;
	JButton back;
	button1(String name){
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		JLabel heading = new JLabel("Welcome " + name +  " to simple minds");
		heading.setBounds(60,20,700,30);
		heading.setFont(new Font("Lucida Calligraphy",Font.BOLD,28));
		heading.setForeground(new Color(130,24,120));
		
		add(heading);
		
		
		JLabel label = new JLabel();
		label.setBounds(20,90,700,350);
		label.setFont(new Font("Lucida Calligraphy",Font.BOLD,16));
		label.setForeground(new Color(180,200,190));
		label.setText(
				 "<html>"+ 
			                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
			                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
			                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
			                "4. Crying is allowed but please do so quietly." + "<br><br>" +
			                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
			                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
			                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
			                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
			            "<html>"
				);
		add(label);
		
		 button1 = new JButton("Next");
			button1.setBounds(400,500,100,30);
			button1.setBackground(Color.black);
			button1.setForeground(Color.white);
			button1.addActionListener(this);
			add(button1);
			
			back = new JButton("Back");
			back.setBounds(250,500,100,30);
			back.setBackground(Color.black);
			back.setForeground(Color.white);
			back.addActionListener(this);
			add(back);
		
		setSize(800,650);
		setLocation(350,100);
		setVisible(true);
		
	}
	public static void main(String[]args) {
		new button1("User");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			setVisible(false);
			new quiz(name);
		}
		else {
			setVisible(false);
			new Login();
		}
		
	}
}

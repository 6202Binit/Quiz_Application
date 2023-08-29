package QuizApplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class score  extends JFrame implements ActionListener{
	JButton submit ;
	score(String name , int score){
		setBounds(600,150,750,550);
		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		
		
		ImageIcon i1 = new ImageIcon(getClass().getResource("icons/score.png"));
		Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		
		JLabel image = new JLabel(i3);
		image.setBounds(0,200,300,250);
		
		add(image);
		
		JLabel heading = new JLabel("Thanku " + name + " for playing simple minds");
		heading.setBounds(45,30,700,30);
		heading.setFont(new Font("Tahoma",Font.PLAIN,26));
		add(heading);
		
		JLabel res = new JLabel("your score  : " + score );
		res.setBounds(350,200,300,30);
		res.setFont(new Font("Tahoma",Font.PLAIN,26));
		add(res);
		
			submit = new JButton("Play again");
	        submit.setBounds(380,270,150,30);
	        submit.setFont(new Font("Taahoma",Font.PLAIN,20));
	        submit.setBackground(Color.black);
	        submit.setForeground(Color.white);
	        submit.addActionListener(this);
	       
	        add(submit);
	        
	        
	        
		setVisible(true);
	}
	
	public static void main() {
		new score("User",0);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==submit) {
			setVisible(false);
			new Login();
		}
		
	}
}

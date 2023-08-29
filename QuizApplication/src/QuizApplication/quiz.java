package QuizApplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class quiz extends JFrame implements ActionListener{
	
	String questions[][] = new String[10][5];
	String answers[][] = new String[10][2];
	String userans[][] = new String[10][1];
	int score = 0;
	
	JLabel qno;
	JLabel question;
	 JRadioButton button1 , button2,button3,button4;
	 JButton next,life,submit;
	 ButtonGroup group;
	 static int Timer = 10;
	 public static int ans_given = 0;
	 public static int count = 0;
	 String name;
	quiz(String username){
		this.name = name;
		setBounds(50,0,1400,850);
		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		ImageIcon i1 = new ImageIcon(getClass().getResource("icons/quiz.jpg"));
		JLabel image = new JLabel(i1);
		image.setBounds(0,0,1440,391);
		
		add(image);
		
		 qno = new JLabel();
		qno.setBounds(100,450,50,30);
		qno.setFont(new Font("Tahoma",Font.PLAIN,24));
		add(qno);
		
		question = new JLabel();
		question.setBounds(160,450,900,30);
		question.setFont(new Font("Tahoma",Font.PLAIN,24));
		add(question);
		questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";
        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";
        
         button1 = new JRadioButton();
        button1.setBounds(170,520,700,30);
        button1.setBackground(Color.white);
        button1.setFont(new Font("Dialog",Font.PLAIN,20));
        add(button1);
        button2 = new JRadioButton();
        button2.setBounds(170,560,700,30);
        button2.setBackground(Color.white);
        button2.setFont(new Font("Dialog",Font.PLAIN,20));
        add(button2);
         button3 = new JRadioButton();
        button3.setBounds(170,600,700,30);
        button3.setBackground(Color.white);
        button3.setFont(new Font("Dialog",Font.PLAIN,20));
        add(button3);
        button4 = new JRadioButton();
        button4.setBounds(170,640,700,30);
        button4.setBackground(Color.white);
        button4.setFont(new Font("Dialog",Font.PLAIN,20));
        add(button4);
        
        group = new ButtonGroup();
        group.add(button1);
        group.add(button2);
        group.add(button3);
        group.add(button4);
        
        next = new JButton("next");
        next.setBounds(1100,550,200,40);
        next.setFont(new Font("Taahoma",Font.PLAIN,20));
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.addActionListener(this);
        add(next);
        
        life = new JButton("50 50 Lifeline");
        life.setBounds(1100,630,200,40);
        life.setFont(new Font("Taahoma",Font.PLAIN,20));
        life.setBackground(Color.black);
        life.setForeground(Color.white);
        life.addActionListener(this);
        add(life);
        
        
        submit = new JButton("submit");
        submit.setBounds(1100,710,200,40);
        submit.setFont(new Font("Taahoma",Font.PLAIN,20));
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        start(count);
        
        
        
        setVisible(true);
		
	}
	public void paint(Graphics g) {
		super.paint(g);
		
		String time = "Time left : " + Timer + " seconds "; // its use for time left 
		g.setColor(Color.red);
		g.setFont(new Font("Tahoma",Font.PLAIN,20));
		
		if(Timer > 0) {
			g.drawString(time, 1100, 500);
		}
		else {
			g.drawString("Timus up !!", 1100, 500);
		}
		Timer--;
		try {
			Thread.sleep(1000);
			repaint(Timer);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		if(ans_given == 1) {
			ans_given = 0;
			Timer = 10;
		}
		else if(Timer < 0) {
			Timer = 10;
			
			button1.setEnabled(true);
			button2.setEnabled(true);
			button3.setEnabled(true);
			button4.setEnabled(true);
			
			if(count == 8) {
				next.setEnabled(false);
				submit.setEnabled(true);
			}
			
			if(count == 9) { // for submit button if user not click the submit button
				if(group.getSelection()==null) {
					userans[count][0] = "";
				}
				else {
					userans[count][0] = group.getSelection().getActionCommand(); // this method return the value of the which option you sellected			}
				}
				for(int i= 0;i<userans.length;i++) {
					if(userans[i][0].equals(answers[i][1])) {
						score += 10;
					}
				}
				setVisible(false);
				
				// score 
				new score(name,score);
			}
			else { // next button 
			
			
				if(group.getSelection()==null) {
					userans[count][0] = "";
				}
				else {
					userans[count][0] = group.getSelection().getActionCommand(); // this method return the value of the which option you sellected			}
				}
				count++;
				start(count);
			}
		}
	}
	
	
	public  void start(int count) {
		//question.setText(getName());
		qno.setText("" + (count + 1) +  ". ");
		question.setText(questions[count][0]);
		button1.setText(questions[count][1]);
		button1.setActionCommand(questions[count][1]);
		button2.setText(questions[count][2]);
		button2.setActionCommand(questions[count][2]);
		button3.setText(questions[count][3]);
		button3.setActionCommand(questions[count][3]);
		button4.setText(questions[count][4]);
		button4.setActionCommand(questions[count][4]);
		
		group.clearSelection();  // this is used for the after selecton the option , when going next question self to deselect and now youy select
		
	}
public static void main(String[]args) {
	new quiz("User");
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==next) {
		repaint();
		button1.setEnabled(true);
		button2.setEnabled(true);
		button3.setEnabled(true);
		button4.setEnabled(true);
		ans_given = 1;
		if(group.getSelection()==null) {
			userans[count][0] = "";
		}
		else {
			userans[count][0] = group.getSelection().getActionCommand(); // this method return the value of the which option you sellected			}
		}
		
		
		if(count == 8) {
			next.setEnabled(false);
			submit.setEnabled(true);
		}
		
		
		count++;
		start(count);
	}
	else if(e.getSource()==life) {
		if(count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
			button2.setEnabled(false);
			button3.setEnabled(false);
		}
		else {
			button1.setEnabled(false);
			button4.setEnabled(false);
		}
		life.setEnabled(false);
	}
	else if(e.getSource()==submit) {
		ans_given = 1;
		if(group.getSelection()==null) {
			userans[count][0] = "";
		}
		else {
			userans[count][0] = group.getSelection().getActionCommand(); // this method return the value of the which option you sellected			}
		}
		for(int i= 0;i<userans.length;i++) {
			if(userans[i][0].equals(answers[i][1])) {
				score += 10;
			}
		}
		setVisible(false);
		new score(name,score);
		
	}
	
}
}

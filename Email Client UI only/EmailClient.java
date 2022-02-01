package Graficka_Sucelja_2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class EmailClient extends JFrame {
JLabel label1;
JLabel label2;
JLabel label3;
JLabel label4;
JTextArea txtbig;
JTextField txt1;
JTextField txt2;
JTextField txt3;
JButton botun1;
JButton botun2;
	public EmailClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jpanel = (JPanel) this.getContentPane();
		jpanel.setBorder(BorderFactory.createEmptyBorder(8,8,8,8));
		setLayout(new BorderLayout());
		label1 = new JLabel("    From: ",SwingConstants.RIGHT);
		label2 = new JLabel("         To: ",SwingConstants.RIGHT);
		label3 = new JLabel("Subject: ",SwingConstants.RIGHT);
		label4 = new JLabel("Message: ",SwingConstants.RIGHT);
		txtbig = new JTextArea();
		botun1 = new JButton("send e-mail");
		botun2 = new JButton("clear message");
		txt1=new JTextField(10);
		txt2=new JTextField(10);
		txt3=new JTextField(10);
		JPanel panel1 = new JPanel(new BorderLayout());
		JPanel panel2 = new JPanel(new BorderLayout());
		JPanel panel3 = new JPanel(new BorderLayout());
		JPanel panel4 = new JPanel(new BorderLayout());
		JPanel panel5 = new JPanel(new GridLayout(0,1,5,5));
		JPanel panel6 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel1.add(label1,BorderLayout.WEST);
		panel1.add(txt1,BorderLayout.CENTER);
		panel2.add(label2,BorderLayout.WEST);
		panel2.add(txt2,BorderLayout.CENTER);
		panel3.add(label3,BorderLayout.WEST);
		panel3.add(txt3,BorderLayout.CENTER);
		panel4.add(label4,BorderLayout.WEST);
		panel5.add(panel1);
		panel5.add(panel2);
		panel5.add(panel3);
		panel5.add(panel4);
		add(panel5,BorderLayout.NORTH);
		add(txtbig,BorderLayout.CENTER);
		panel6.add(botun1);
		panel6.add(botun2);
		add(panel6,BorderLayout.SOUTH);
		pack();
		
		
	}
	public static void main(String[] args) {
		new EmailClient().setVisible(true);
	}
}

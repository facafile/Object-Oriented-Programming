package AJMO_BAGERI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Graficka_Sucelja_2.EmailClient;

public class Scoreboard extends JFrame{
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JLabel lbl1;
	JLabel lbl2;
	public Scoreboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		 btn1 = new JButton("RESET");
		 btn2 = new JButton("point for red");
		 btn3 = new JButton("point for blue");
		JPanel panel1 = new JPanel(new GridLayout(1,1,5,5));
		JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel panel4 = new JPanel(new BorderLayout());
		JPanel panel5 = new JPanel(new BorderLayout());
		lbl1 = new JLabel("0",SwingConstants.CENTER);
		lbl2 = new JLabel("0",SwingConstants.CENTER);
		lbl1.setFont(new Font("Serif", Font.BOLD, 20));
		lbl2.setFont(new Font("Serif", Font.BOLD, 20));
		panel4.setBackground(Color.red);
		panel5.setBackground(Color.blue);
		panel4.add(lbl1,BorderLayout.CENTER);
		panel5.add(lbl2,BorderLayout.CENTER);
		panel2.add(btn1);
		panel3.add(btn2);
		panel3.add(btn3);
		panel1.add(panel4);
		panel1.add(panel5);
		add(panel2,BorderLayout.NORTH);
		add(panel1, BorderLayout.CENTER);
		add(panel3, BorderLayout.SOUTH);
		btn1.addActionListener((e)-> {
			lbl1.setText("0");
			lbl2.setText("0");
		});
		btn2.addActionListener(new MojActionListener());
		btn3.addActionListener(new MojActionListener());
		pack();
	}
	public class MojActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btn2) {
				Integer x=Integer.parseInt(lbl1.getText())+1;
				lbl1.setText(x.toString());
				
			}
			else if(e.getSource()==btn3) {
					Integer x=Integer.parseInt(lbl2.getText())+1;
					lbl2.setText(x.toString());
			}
			
		}
		
	}
	public static void main(String[] args) {
		new Scoreboard().setVisible(true);
	}
}

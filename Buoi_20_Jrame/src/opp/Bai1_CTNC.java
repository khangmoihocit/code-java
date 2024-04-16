package opp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Bai1_CTNC {
	public static void main(String[] args) {
		JFrame frame = new JFrame("CALCULATOR");
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setLayout(null);
		
		JLabel first = new JLabel("First number");
		first.setBounds(30, 30, 100, 30);
		frame.add(first);
		JTextField first1 = new JTextField();
		first1.setBounds(150, 30, 100, 30);
		frame.add(first1);
		
		JLabel second = new JLabel("Second number");
		second.setBounds(30, 80, 100, 30);
		frame.add(second);
		JTextField second1 = new JTextField();
		second1.setBounds(150, 80, 100, 30);
		frame.add(second1);
		
		JLabel result = new JLabel("Result");
		result.setBounds(30, 130, 100, 30);
		frame.add(result);
		
		JButton add = new JButton("ADD");
		add.setBounds(30, 180, 60, 30);
		frame.add(add);	
		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double x = Double.parseDouble(first1.getText());
				double y = Double.parseDouble(second1.getText());
				double a = x + y;
				String b = String.valueOf(a); 
				JTextField add1 = new JTextField(b);
				add1.setBounds(150, 130, 100, 30);
				frame.add(add1);
			}
		});
		
		JButton sub = new JButton("SUB");
		sub.setBounds(130, 180, 60, 30);
		frame.add(sub);		
		sub.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double x = Double.parseDouble(first1.getText());
				double y = Double.parseDouble(second1.getText());
				double a = x - y;
				String b = String.valueOf(a); 
				JTextField sub1 = new JTextField(b);
				sub1.setBounds(150, 130, 100, 30);
				frame.add(sub1);
			}
		});
		
		JButton mul = new JButton("MUL");
		mul.setBounds(230, 180, 60, 30);
		frame.add(mul);
		mul.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double x = Double.parseDouble(first1.getText());
				double y = Double.parseDouble(second1.getText());
				double a = x * y;
				String b = String.valueOf(a); 
				JTextField mul1 = new JTextField(b);
				mul1.setBounds(150, 130, 100, 30);
				frame.add(mul1);
			}
		});
		
		JButton div = new JButton("DIV");
		div.setBounds(330, 180, 60, 30);
		frame.add(div);
		div.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double x = Double.parseDouble(first1.getText());
				double y = Double.parseDouble(second1.getText());
				double a = x / y;
				String b = String.valueOf(a); 
				JTextField div1 = new JTextField(b);
				div1.setBounds(150, 130, 100, 30);
				frame.add(div1);				
			}
		});
		
	}
}

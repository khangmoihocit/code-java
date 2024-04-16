package opp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Bai2_chuanHoaTen {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Name Convert");
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setLayout(null);

		JLabel lbl1 = new JLabel("Full name");
		JLabel lbl2 = new JLabel("Result");

		JTextField jt1 = new JTextField();
		JTextField jt2 = new JTextField();

		JButton btn = new JButton("Convert");

		lbl1.setBounds(30, 20, 100, 30);
		lbl2.setBounds(30, 80, 100, 30);
		jt1.setBounds(150, 20, 100, 30);
		jt2.setBounds(150, 80, 100, 30);
		btn.setBounds(70, 140, 100, 30);

		frame.add(lbl1);
		frame.add(lbl2);
		frame.add(jt1);
		frame.add(jt2);
		frame.add(btn);
		btn.setBackground(Color.green);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});

	}
}

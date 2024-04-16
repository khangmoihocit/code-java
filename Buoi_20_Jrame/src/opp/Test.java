package opp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//JFrame: tạo khung
//JButton: tạo nút ấn
//JLabel: tạo nhãn
//JTextField: tạo chỗ text
//JTextArea: tạo text nhiều dòng
//JPasswordField: tạo text ẩn
//JOptionPane: hiện thị bảng thông báo
public class Test {
	public static void main(String[] args) {
		//1. JFrame
		JFrame frame = new JFrame("JFrame Example");
		//tao kich thuong cua bang (rong x cao);
		frame.setSize(500, 300); //tao khung
		//dong bang
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//hien thi bang ra giua man hinh
		frame.setLocationRelativeTo(null);
		//hien thi
		frame.setVisible(true);
		//để các nút không bị tràn
		frame.setLayout(null);
		
		/*
		 * //2.JButton JButton btn = new JButton("Username"); //tao kich thuoc nut
		 * btn.setBounds(50, 20, 100, 30); frame.add(btn);
		 * 
		 * JButton btn2 = new JButton("Password"); btn2.setBounds(50, 80, 100, 30);
		 * frame.add(btn2);
		 * 
		 * //3.them su kien cho nut btn btn.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * System.out.println("ong da an vao username!!"); } });
		 * 
		 * btn2.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * System.out.println("ong da an vao password");
		 * 
		 * } });
		 */
		
		
		/*
		 * //nhãn JLabel lbl1 = new JLabel("Usernanme: "); lbl1.setBounds(50, 30, 100,
		 * 30); frame.add(lbl1); JLabel lbl2 = new JLabel("Password: ");
		 * lbl2.setBounds(50, 80, 100, 30); frame.add(lbl2);
		 * 
		 * //JText field JTextField username = new JTextField(""); JTextField password =
		 * new JTextField(""); username.setBounds(170, 30, 120, 30);
		 * password.setBounds(170, 80, 120, 30); frame.add(username);
		 * frame.add(password);
		 * 
		 * JButton login = new JButton("login"); login.setBounds(170, 130, 100, 30);
		 * frame.add(login);
		 * 
		 * login.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { JFrame in = new
		 * JFrame("menu"); in.setSize(500, 300);
		 * in.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 * in.setLocationRelativeTo(null); in.setVisible(true); in.setLayout(null);
		 * 
		 * JLabel lbl3 = new JLabel("Thong tin nguoi dung"); lbl3.setBounds(150, 20,
		 * 200, 30); in.add(lbl3);
		 * 
		 * JLabel lbl4 = new JLabel("Username: " + username.getText());
		 * lbl4.setBounds(30, 50, 200, 30); in.add(lbl4);
		 * 
		 * JLabel lbl5 = new JLabel("Password: " + password.getText());
		 * lbl5.setBounds(30, 80, 200, 30); in.add(lbl5);
		 * 
		 * JLabel diaChi = new JLabel("Địa chỉ: thôn ải, Hợp Thanh, Mỹ Đức, Hà Nội.");
		 * diaChi.setBounds(30, 110, 500, 30); in.add(diaChi); } });
		 */
		
//JTextArea: text nhieu dong
		/*
		 * JTextArea jta = new JTextArea(); jta.setBounds(50, 50, 200, 150);
		 * jta.setLineWrap(true); // het dong se xuong dong jta.setWrapStyleWord(true);
		 * frame.add(jta);
		 */
//JPasswordField:
		JPasswordField password = new JPasswordField();
		password.setBounds(30, 20, 100, 30);
		frame.add(password);
		 JButton btn = new JButton("click");
		 btn.setBounds(30, 80, 100, 30);
		 frame.add(btn);
		 btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//getText se tra ve mang char khi dung JPasswordField
//				System.out.println(password.getPassword());
				
				//chuyen tu mang char sang string
				String s = String.valueOf(password.getPassword());
				System.out.println(s);
				JOptionPane.showMessageDialog(frame, "tạo thành công!");
			}
		});
	}
}

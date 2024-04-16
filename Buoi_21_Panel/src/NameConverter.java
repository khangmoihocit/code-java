import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NameConverter extends JFrame {
	private JLabel lbl1, lbl2;
	private JTextField txt1, txt2;
	private JButton btn;

	public NameConverter(String title) {
		this.setTitle(title);
		lbl1 = new JLabel("Full name");
		lbl2 = new JLabel("Result");
		txt1 = new JTextField();
		txt2 = new JTextField();
		btn = new JButton("Convert");

		lbl1.setBounds(30, 30, 100, 30);
		lbl2.setBounds(30, 80, 100, 30);
		txt1.setBounds(150, 30, 150, 30);
		txt2.setBounds(150, 80, 150, 30);
		btn.setBounds(140, 130, 100, 30);

		this.add(lbl1);
		this.add(lbl2);
		this.add(txt1);
		this.add(txt2);
		this.add(btn);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String fullName = txt1.getText();
				String[] arr = fullName.split("\\s+");
				String res = "";
				for (String x : arr) {
					res += Character.toUpperCase(x.charAt(0));
					for (int j = 1; j < x.length(); ++j) {
						res += Character.toLowerCase(x.charAt(j));
					}
					res += " ";
				}
				res = res.trim();
				txt2.setText(res);
			}
		});		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
	}

}

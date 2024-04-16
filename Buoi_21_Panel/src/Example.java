import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Panel
//BorderLayout: chia theo cac huong
//GridLayout: chia theo dang luoi
public class Example {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Panel");
		/*
		 * JPanel pn1 = new JPanel(); JPanel pn2 = new JPanel(); JButton btn1 = new
		 * JButton("Panel1"); JButton btn2 = new JButton("Panel2"); btn1.setBounds(50,
		 * 50, 100, 30); btn2.setBounds(50, 50, 100, 30); pn1.add(btn1); pn2.add(btn2);
		 * pn1.setBounds(50, 50, 200, 200); pn2.setBounds(260, 50, 200, 200);
		 * pn1.setBackground(Color.blue); pn2.setBackground(Color.GREEN);
		 * frame.add(pn1); frame.add(pn2);
		 */

		// BorderLayout
		/*
		 * JButton btn1 = new JButton("NORTH"); JButton btn2 = new JButton("WEST");
		 * JButton btn3 = new JButton("CENTER"); JButton btn4 = new JButton("EAST");
		 * JButton btn5 = new JButton("SOUTH");
		 * 
		 * frame.setLayout(new BorderLayout(5, 5)); // BorderLayout(ngang, doc);
		 * frame.add(btn1, BorderLayout.NORTH); frame.add(btn2, BorderLayout.WEST);
		 * frame.add(btn4, BorderLayout.EAST); frame.add(btn3, BorderLayout.CENTER);
		 * frame.add(btn5, BorderLayout.SOUTH);
		 */

		// GridLayout
		/*
		 * JButton[] btn = new JButton[9]; for (int i = 0; i < 9; ++i) { btn[i] = new
		 * JButton(i + 1 + ""); } frame.setLayout( new GridLayout(3,3)); for(int i=0;
		 * i<9; ++i) { frame.add(btn[i]); }
		 */

		JButton[] btn = new JButton[64];
		for (int i = 0; i < 64; ++i) {
			btn[i] = new JButton();
			frame.add(btn[i]);
		}
		
		//ban co vua
		for (int i = 0; i < 8; ++i) {
			for (int j = 0; j < 8; ++j) {
				if ((i + j) % 2 == 0) {
					btn[i * 8 + j].setBackground(Color.BLACK);
				}
				else {
					btn[i * 8 + j].setBackground(Color.WHITE);
				}
			}
		}

		frame.setLayout(new GridLayout(8, 8));

		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}

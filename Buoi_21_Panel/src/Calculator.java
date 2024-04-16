import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	private JLabel lblFirst, lblSecond, lblResult;

	/*
	 * private JTextField txtFirst, txtSecond, txtResult; private JButton btnClear,
	 * btnAdd, btnMul, btnSub, btnDiv;
	 */
	public Calculator(String title) {
		this.setTitle(title);
		lblFirst = new JLabel("First");
		lblSecond = new JLabel("Second");
		lblResult = new JLabel("Result");
		this.add(lblFirst);
		this.add(lblSecond);
		this.add(lblResult);
		lblFirst.setBounds(50, 50, 80, 30);
		lblSecond.setBounds(50, 100, 80, 30);
		lblResult.setBounds(50, 150, 80, 30);
		
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	
		this.setLayout(null);
		
	}

	

}

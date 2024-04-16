package Table;

import java.io.ObjectInputStream.GetField;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

//table
//JScrollPane: tao cuon
//set, getvalueAt
//getRowcount: so hang
//getColimncount: so cot
public class Example {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Table");
		Object[][] row = {
				{"sv01", "nguyen van a", "cntt1", 2.3},
				{"sv02", "nguyen van b", "cntt3", 5.3},
				{"sv03", "nguyen van d", "cntt4", 3.3},
				{"sv04", "nguyen van c", "cntt3", 44.3},
				{"sv01", "nguyen van a", "cntt1", 2.3},
				{"sv02", "nguyen van b", "cntt3", 5.3},
				{"sv03", "nguyen van d", "cntt4", 3.3},
				{"sv04", "nguyen van c", "cntt3", 44.3},
				{"sv01", "nguyen van a", "cntt1", 2.3},
				{"sv02", "nguyen van b", "cntt3", 5.3},
				{"sv03", "nguyen van d", "cntt4", 3.3},
				{"sv04", "nguyen van c", "cntt3", 44.3},
				{"sv01", "nguyen van a", "cntt1", 2.3},
				{"sv02", "nguyen van b", "cntt3", 5.3},
				{"sv03", "nguyen van d", "cntt4", 3.3},
				{"sv04", "nguyen van c", "cntt3", 44.3},
				{"sv01", "nguyen van a", "cntt1", 2.3},
				{"sv02", "nguyen van b", "cntt3", 5.3},
				{"sv03", "nguyen van d", "cntt4", 3.3},
				{"sv04", "nguyen van c", "cntt3", 44.3},
				{"sv01", "nguyen van a", "cntt1", 2.3},
				{"sv02", "nguyen van b", "cntt3", 5.3},
				{"sv03", "nguyen van d", "cntt4", 3.3},
				{"sv04", "nguyen van c", "cntt3", 44.3},
		};
		Object[] col = {"ID", "ho ten", "lop", "GPA"};
		JTable table = new  JTable(row, col);
		
		JScrollPane scrollPane = new JScrollPane(table);
		frame.add(scrollPane);
		
		//hien thi so hang va cot
		System.out.println(table.getValueAt(2, 1));
		
		//sua lai thong tin trong table
//		table.setValueAt("noi dung sua", so cot, so hang);
//		table.setValueAt("88888888888", 0, 0);
		
		for(int i=0; i<table.getRowCount(); ++i) {
			for (int j=0; j<table.getColumnCount(); ++j) {
				System.out.print(table.getValueAt(i,j ) + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}

package tablemodel;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//addRow: them thong tin o hang
//removeRow: xoa 
//tablemodel
//sap xep table
public class p1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("test");
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		Object[][] row = { { "SV01", "Nguyen Van Nam", "CNTT1", 3.2 }, { "SV03", "Nguyen Hung Lam", "CNTT2", 2.7 },
				{ "SV02", "Vo Quoc Lam", "DTVT1", 3.1 }, { "SV04", "Tran Van Thang", "CNTT2", 2.8 }, };
		Object[] col = { "ID", "Ho ten", "Lop", "GPA" };
		
		JTable table = new JTable(new DefaultTableModel(row, col));
		DefaultTableModel model = (DefaultTableModel)table.getModel();
//		//data vecto cac vector
//		Vector<Vector> data = model.getDataVector();
//		for(int i=0; i<data.size(); ++i) {
//			for(int j=0; j< data.get(i).size(); ++j) {
//				System.out.print(data.get(i).get(j) + " ");
//			}
//			System.out.println("");
//		}
		//addRow
		model.addRow(new Object[] {"sv05", "khang", "w", 2.34});
		//removeRow
//		model.removeRow(4);
		
		
		
		
		
		
		
		JScrollPane scrollPane = new JScrollPane(table);
		frame.add(scrollPane);
	}
}

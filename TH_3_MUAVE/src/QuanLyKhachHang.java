import java.io.File;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Scanner;

import javax.print.Doc;

public class QuanLyKhachHang {
	 ArrayList<KhachHang> arr1;

	Scanner sc = new Scanner(System.in);
	
	public QuanLyKhachHang() {
		arr1 = new ArrayList<>();
		input();
	}

	
	public void themDSCho(KhachHang x) {
		arr1.add(x);
	}
	public void banVe() {
		System.out.println();
	}
	public void input() {
		try {
			File file = new File("dskhCho.txt");
			if(file.createNewFile()) {
				System.out.println("file da duoc tao");
			}
			else {
				System.out.println("doc file thanh cong");
			}
			Scanner scc = new Scanner(file);
			while(scc.hasNextLine()) {
				String cmndS = scc.nextLine();
				String ten = scc.nextLine();
				String ga = scc.nextLine();
				String gia = scc.nextLine();
					
				KhachHang x  = new KhachHang(cmndS,ten, ga, gia);
				arr1.add(x);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	public void hienDS() {
		for(KhachHang x : arr1) {
			System.out.println(x + "\n");
		}
	}

}

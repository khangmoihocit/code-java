package bai2_bankAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyAccount {
	private ArrayList<Account> ds;
	Scanner sc = new Scanner(System.in);
	public QuanLyAccount() {
		ds = new ArrayList<Account>();
	}
	public void input() {
		Account acc1 = new Account("0012", "pham van khang", "113", 9999, 100000);
		Account acc2 = new Account("0013", "pham van A", "114", 9999, 0);
		Account acc3 = new Account("0014", "pham van B", "115", 9999, 222000);
		ds.add(acc1);
		ds.add(acc2);
		ds.add(acc3);
	}
	public void hien() {
		for(Account x : ds) {
			System.out.println(x);
		}
	}
	public int findPos(String soTaiKhoan) {
		for (int i=0; i<ds.size(); ++i) {
			if (ds.get(i).getSoTK().equals(soTaiKhoan)) {
				return i;
			}
		}
		return -1;
	}
	public void chuyenTien() {
		System.out.println("Nhap tai khoan nguon: ");String tknguon = sc.nextLine();
		System.out.println("nhap tai khoan nhan: ");String tkNhan = sc.nextLine();
		int soTien = sc.nextInt();
		
		int pos1 = findPos(tknguon);
		int pos2 = findPos(tkNhan);
		if (ds.get(pos1).getSoDuTK() - 50000 > soTien) {
			ds.get(pos2).napTien(soTien);
			ds.get(pos1).rutTien(soTien);
		}
		else {
			System.out.println("tai khoan cua quy khach khong du");
		}
	}
	
	
	
	
	
	
	
	
	
	
}

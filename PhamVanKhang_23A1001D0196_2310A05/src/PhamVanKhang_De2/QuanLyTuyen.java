package PhamVanKhang_De2;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyTuyen {
	private ArrayList<Tuyen> qlt;
	public QuanLyTuyen() {
		qlt = new ArrayList<Tuyen>();
	}
	public void them() {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap khoang cach: ");
		int kc = sc.nextInt();
		System.out.print("nhap so diem dung: ");
		int diemDung = sc.nextInt();
		Tuyen t = new Tuyen( kc, diemDung);
		qlt.add(t);
	}
	public void hien() {
		for (Tuyen x : qlt) {
			System.out.println(x);
		}
	}
	public Tuyen tuyen(int a) {
		return qlt.get(a);
	}
	
}

package qlKhoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLySinhVien {
	private ArrayList<SinhVien> dssv;
	public QuanLySinhVien() {
		this.dssv = new ArrayList<SinhVien>();
	}
	public void them(SinhVien x) {
		dssv.add(x);
	}
	public void hien() {
		for (SinhVien x : dssv) {
			System.out.println(x);
		}
	}
	public void svHB() {
		for (SinhVien x : dssv) {
			if (x.getHocBong() > 2000000) {
				System.out.println(x.getHoTen());
			}
		}
	}
	public void sapXep() {
		Collections.sort(dssv, new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				return o1.getHoTen().compareToIgnoreCase(o2.getHoTen());
			}
		});
	}
}

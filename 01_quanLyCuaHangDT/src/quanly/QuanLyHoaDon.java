package quanly;

import java.util.ArrayList;

import quanlifile.QuanLyFile;

public class QuanLyHoaDon {
	private ArrayList<SanPham> dsSanPham;
	private QuanLyFile quanLyFile;
	
	public QuanLyHoaDon() {
		dsSanPham = new ArrayList<SanPham>();
		quanLyFile = new QuanLyFile();
	}
	
}
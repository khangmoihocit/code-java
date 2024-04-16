package de02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class QuanLyNV {
	private ArrayList<NhanVien> list;

	public QuanLyNV() {
		list = new ArrayList<NhanVien>();
	}
	public void them(NhanVien x) {
		list.add(x);
	}
	public void hien() {
		for (NhanVien x : list) {
			System.out.println(x);
		}
	}
	public void hienSVTN() {
		for (NhanVien x : list) {
			if (x instanceof NhanVienMoiRaTruong) {
				if (((NhanVienMoiRaTruong) x).getXepLoaiTN().equalsIgnoreCase("gioi") 
						|| ((NhanVienMoiRaTruong) x).getXepLoaiTN().equalsIgnoreCase("kha")) {
					System.out.print("Danh sach sinh vien tn gioi va kha la : ");
					System.out.println(x);
				}
			}
			else {
				System.out.println("khong co sinh vien gioi va kha");
			}
		}
	}
	public NhanVien timKiemNV() {
		for (NhanVien x : list) {
			if (x instanceof NhanVienLauNam) {
				int soNamKN = Integer.parseInt(((NhanVienLauNam) x).getSoNamKinhNghiem());
				if (soNamKN > 10) {
					return x;
				}
			}
		}
		return null;
	}
	
	public void ghiFile() {
		try {
			FileWriter fw = new FileWriter("nhanvien.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for (NhanVien x : list) {
				bw.write(x.toString());
				bw.newLine();
			}
			bw.close();
			fw.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}

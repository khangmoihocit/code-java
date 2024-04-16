package main;

import java.util.ArrayList;
import java.util.Scanner;


public class Test2 {
	public static void main(String[] args) {
////		String foamString  = "%-10s %-20s %-10s %-25s %-15s %-20s";
////		String tieuDe = String.format(foamString, "ID", "Họ và tên", "tuổi", "địa chỉ", "số điện thoại", "email");
////		System.out.println(tieuDe + "\n-------------------------------------------------------------------------------------------------------------");
		Scanner sc = new Scanner(System.in);
//		QuanLyKhachHang qlkh = new QuanLyKhachHang();
//		KhachHang kh = new KhachHang("1", "Phạm Anh Huy", "3", "4", "5", "6");
////		qlkh.themKH(kh);
//		qlkh.docFile();
////		qlkh.ghiFile();
////		qlkh.hienKH();
////		for (int i=0; i<3; ++i) {
////			String a = sc.nextLine();qlkh.xoaKH(a);
////		}
////		
////		qlkh.ghiFile();
//		
////		qlkh.hienKH();
////		String s = sc.nextLine();
////		qlkh.capNhapKH("1");
////		qlkh.hienKH();
////		qlkh.timKH("18594");
////		qlkh.xoaKH("98761");
//		qlkh.ghiFile();
//		qlkh.hienKH();
//		qlkh.sapXepTheoTen();
//		System.out.println("----------------------------");
//		qlkh.hienKH();
//		KhachHang kh = new KhachHang();
//		kh.nhap();
//		System.out.println(kh);
//		QuanLySanPham qlsp = new QuanLySanPham();
//		SanPham sp = new SanPham("a","a","a","a","a","a","a","a","");
//		qlsp.themSP(sp);
		
//		qlsp.docFile();
//		qlsp.hienSP();
//		qlsp.sapXepTheoGiaGiam();
//		qlsp.hienSP();
		ArrayList<String> arr = new ArrayList<String>();
		String s = "2.000.000VND";
		String[] a = s.split("");
		for (int i=0; i<a.length; ++i) {
			arr.add(a[i]);
		}
		String res = "";
		for (int i=0; i< arr.size(); ++i) {
			if (arr.get(i).equals(".")) {
				arr.remove(i);
			}
			if (arr.get(i).equals("V")) {
				arr.remove(i);
			}
			if (arr.get(i).equals("N")) {
				arr.remove(i);
			}
			if (arr.get(i).equals("D")) {
				arr.remove(i);
			}
			else {
				res+= arr.get(i);
			}
		}
//		System.out.println(res);
//		for (String x : arr) {
//			res += x;
//		}
	System.out.println(res);
		
	}
	
}

package de02;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

public class NhanVien {
	private String maNV, hoTen, ngaySinh, gioiTinh, email;

	public NhanVien(String maNV, String hoTen, String ngaySinh, String gioiTinh, String email) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.email = email;
	}
	public NhanVien() {
		
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh
				+ ", email=" + email + "]";
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap ma nv:") ;String mnv = sc.nextLine();
		
		String hoTen;
		do {
			System.out.print("Nhap ho ten: ");
			 hoTen = sc.nextLine();
			if (hoTen.length() < 10 || hoTen.length() > 50) {
				System.out.print("ten khong hop le! Vui Long nhap lai.\n");
				
			}
		} while (hoTen.length() < 10 || hoTen.length() > 50);
		
		String ngaySinh;
		int namSinh;
		int year;
		String gioiTinh=""; int tuoiToiDa = 100;
		System.out.print("Nhap gioi tinh: "); gioiTinh = sc.nextLine();
		do {
			System.out.print("Nhap ngay sinh(dd/mm/yyyy): "); ngaySinh = sc.nextLine();
			String[]a = ngaySinh.split("/");
			namSinh = Integer.parseInt(a[2]);
			if (gioiTinh.compareToIgnoreCase("nam") == 0) tuoiToiDa = 60;
			if (gioiTinh.compareToIgnoreCase("nu") == 0) tuoiToiDa = 65;
			LocalDate todayDate = LocalDate.now();
			year = todayDate.getYear();
			if (year - namSinh < 18 || year-namSinh > tuoiToiDa) System.out.println("yeu cau tuoi > 18 va < 60 voi nu va < 65 voi nam");
		} while (year - namSinh < 18 || year-namSinh > tuoiToiDa);
		
		System.out.print("Nhap email: "); String email = sc.nextLine();
		setMaNV(mnv);
		setHoTen(hoTen);
		setNgaySinh(ngaySinh);
		setGioiTinh(gioiTinh);
		setEmail(email);
	}
}

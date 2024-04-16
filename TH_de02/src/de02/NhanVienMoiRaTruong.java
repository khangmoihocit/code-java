package de02;

import java.util.Scanner;

public class NhanVienMoiRaTruong extends NhanVien{
	private String namTotNghiep, xepLoaiTN, truongTN;

	public NhanVienMoiRaTruong(String maNV, String hoTen, String ngaySinh, String gioiTinh, String email,
			String namTotNghiep, String xepLoaiTN, String truongTN) {
		super(maNV, hoTen, ngaySinh, gioiTinh, email);
		this.namTotNghiep = namTotNghiep;
		this.xepLoaiTN = xepLoaiTN;
		this.truongTN = truongTN;
	}

	public NhanVienMoiRaTruong() {
		super();
	}

	public String getNamTotNghiep() {
		return namTotNghiep;
	}

	public void setNamTotNghiep(String namTotNghiep) {
		this.namTotNghiep = namTotNghiep;
	}

	public String getXepLoaiTN() {
		return xepLoaiTN;
	}

	public void setXepLoaiTN(String xepLoaiTN) {
		this.xepLoaiTN = xepLoaiTN;
	}

	public String getTruongTN() {
		return truongTN;
	}

	public void setTruongTN(String truongTN) {
		this.truongTN = truongTN;
	}

	@Override
	public String toString() {
		return super.toString() + "NhanVienMoiRaTruong [namTotNghiep=" + namTotNghiep + ", xepLoaiTN=" + xepLoaiTN + ", truongTN="
				+ truongTN + "]";
	}

	@Override
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("nam tot nghiem: "); String sn = sc.nextLine();
		System.out.print("xep loai tot nghiem: ");String n = sc.nextLine();
		System.out.print("truong tot nghiem: "); String dnn = sc.nextLine();
		setNamTotNghiep(sn);
		setXepLoaiTN(n);
		setTruongTN(dnn);
	}
	
	
	
}

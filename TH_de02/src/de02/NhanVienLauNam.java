package de02;

import java.util.Scanner;

public class NhanVienLauNam extends NhanVien{
	private String soNamKinhNghiem, kyNangChuyenMon;

	public NhanVienLauNam(String maNV, String hoTen, String ngaySinh, String gioiTinh, String email,
			String soNamKinhNghiem, String kyNangChuyenMon) {
		super(maNV, hoTen, ngaySinh, gioiTinh, email);
		this.soNamKinhNghiem = soNamKinhNghiem;
		this.kyNangChuyenMon = kyNangChuyenMon;
	}

	public NhanVienLauNam() {
		super();
	}

	public String getSoNamKinhNghiem() {
		return soNamKinhNghiem;
	}

	public void setSoNamKinhNghiem(String soNamKinhNghiem) {
		this.soNamKinhNghiem = soNamKinhNghiem;
	}

	public String getKyNangChuyenMon() {
		return kyNangChuyenMon;
	}

	public void setKyNangChuyenMon(String kyNangChuyenMon) {
		this.kyNangChuyenMon = kyNangChuyenMon;
	}

	@Override
	public String toString() {
		return super.toString() + "NhanVienLauNam [soNamKinhNghiem=" + soNamKinhNghiem + ", kyNangChuyenMon=" + kyNangChuyenMon + "]";
	}

	@Override
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("so nam kinh nghiem: "); String sonamkn = sc.nextLine();
		System.out.print("ky nang chuyen mon: ");String n = sc.nextLine();
		setSoNamKinhNghiem(sonamkn);
		setKyNangChuyenMon(n);
	}
	
}

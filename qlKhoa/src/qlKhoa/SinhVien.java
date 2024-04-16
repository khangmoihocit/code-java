package qlKhoa;

import java.util.Scanner;

public class SinhVien {
	private String hoTen, diaChi, sdt, gioiTinh, lop;
	private int soTinChi;
	private double hocBong, diemTB;
	public SinhVien(String hoTen, String diaChi, String sdt, String gioiTinh, String lop, int soTinChi,
			double diemTB) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.sdt = sdt;
		this.gioiTinh = gioiTinh;
		this.lop = lop;
		this.soTinChi = soTinChi;
		this.hocBong = tinhHB();
		this.diemTB = diemTB;
	}
	public SinhVien() {
	}
	public double tinhHB() {
		if (diemTB >= 8) {
			return soTinChi * 350000 * 1.2;
		}
		else if(diemTB >= 7  && diemTB <8) {
			return soTinChi * 350000 * 1.0;
		}
		else {
			return 0;
		}
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public int getSoTinChi() {
		return soTinChi;
	}
	public void setSoTinChi(int soTinChi) {
		this.soTinChi = soTinChi;
	}
	public double getHocBong() {
		return hocBong;
	}
	public void setHocBong(double hocBong) {
		this.hocBong = hocBong;
	}
	public double getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	@Override
	public String toString() {
		return "SinhVien [hoTen=" + hoTen + ", diaChi=" + diaChi + ", sdt=" + sdt + ", gioiTinh=" + gioiTinh + ", lop="
				+ lop + ", soTinChi=" + soTinChi + ", hocBong=" + hocBong + ", diemTB=" + diemTB + "]";
	}
	
}

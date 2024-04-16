package PhamVanKhang_De2;

import java.util.Scanner;

public class LaiXe {
	private int maLaiXe;
	private String hoTen, diaChi, trinhDo;
	public LaiXe(int maLaiXe, String hoTen, String diaChi, String trinhDo) {
		this.maLaiXe = maLaiXe;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.trinhDo = trinhDo;
	}
	
	public LaiXe() {
	}

	public int getMaLaiXe() {
		return maLaiXe;
	}
	public void setMaLaiXe(int maLaiXe) {
		this.maLaiXe = maLaiXe;
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
	public String getTrinhDo() {
		return trinhDo;
	}
	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}
	@Override
	public String toString() {
		return "LaiXe [maLaiXe=" + maLaiXe + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", trinhDo=" + trinhDo + "]";
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap ma lai xe: ");
		int maLX = sc.nextInt();
		sc.nextLine();
		System.out.print("nhap ho ten: ");
		String hoTen = sc.nextLine();
		System.out.print("nhap dia chi: ");
		String diac = sc.nextLine();
		System.out.print("nhap trinh do (A --> F): ");
		String t = sc.nextLine();
	}
	
}

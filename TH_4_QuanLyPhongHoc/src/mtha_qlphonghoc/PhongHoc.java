package mtha_qlphonghoc;

import java.util.Scanner;

public class PhongHoc {
	String maPhong;
	int dayNha;
	int dienTich;
	int slBongDen;
	public PhongHoc(String maPhong, int dayNha, int dienTich, int slBongDen) {
		super();
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.slBongDen = slBongDen;
	}
	public PhongHoc() {
		super();
	}
	@Override
	public String toString() {
		return "PhongHoc [maPhong=" + maPhong + 
				", dayNha=" + dayNha + 
				", dienTich=" + dienTich + ", slBongDen="
				+ slBongDen + "]";
	}
	
	public void input() {
		System.out.println("Nhap ma phong hoc: ");
		maPhong = new Scanner(System.in).nextLine();
		System.out.println("Nhap day nha: ");
		int day= new Scanner(System.in).nextInt();
		dayNha = day > 0 ? day : 0;//bieu thuc dieu kien truc tiep
		/*
		 * if(day>0) 
		 * 	dayNha = day;
		 * else
		 * 	dayNha=0;
		 */
		System.out.println("Nhap dien tich: ");
		int s= new Scanner(System.in).nextInt();
		dienTich = s > 0 ? s: 0;
		slBongDen = dienTich/10; //m2		
	}
	
	public boolean datChuan() {
		if(slBongDen>0)
			return true;		
		return false;
	}
	

}

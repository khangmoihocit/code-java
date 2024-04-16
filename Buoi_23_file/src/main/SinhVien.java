package main;

import java.io.Serializable;

public class SinhVien implements Serializable {
	@Override
	public String toString() {
		return "SinhVien [nam=" + nam + ", lop=" + lop + "]";
	}

	private String nam, lop;

	public SinhVien(String nam, String lop) {
		this.nam = nam;
		this.lop = lop;
	}

	public String getNam() {
		return nam;
	}

	public void setNam(String nam) {
		this.nam = nam;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}
	
	
}

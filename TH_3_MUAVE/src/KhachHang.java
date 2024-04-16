import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class KhachHang {
	private String CMND, ten, ga;
	private String gia;

	public String getCMND() {
		return CMND;
	}

	public void setCMND(String cMND) {
		CMND = cMND;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getGa() {
		return ga;
	}

	public void setGa(String ga) {
		this.ga = ga;
	}

	public String getGia() {
		return gia;
	}

	public void setGia(String gia) {
		this.gia = gia;
	}

	public KhachHang() {

	}

	public KhachHang(String cMND, String ten, String ga, String gia) {
		CMND = cMND;
		this.ten = ten;
		this.ga = ga;
		this.gia = gia;
	}

	@Override
	public String toString() {
		return "CMND: " + CMND + ", ten: " + ten + ", ga: " + ga + ", gia: " + gia;
	}

}

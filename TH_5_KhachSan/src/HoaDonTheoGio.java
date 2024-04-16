import java.util.Scanner;

public class HoaDonTheoGio extends HoaDon {
	private int soGioThue;
	
	public HoaDonTheoGio(String maHoaDon, String tenKhachHang, String maPhong, int ngay, int thang, int nam,
			double donGia, int soGioThue) {
		super(maHoaDon, tenKhachHang, maPhong, ngay, thang, nam, donGia);
		this.soGioThue = soGioThue;
		if (soGioThue > 24 && soGioThue < 30) {
			this.soGioThue = 24;
		}
	}
	
	@Override
	public double thanhTien() {
		if (soGioThue > 30) {
			return -1;
		}
		else {
			return soGioThue * getDonGia();
		}
	}

	public int getSoGioThue() {
		return soGioThue;
	}

	public void setSoGioThue(int soGioThue) {
		this.soGioThue = soGioThue;
	}
	

}

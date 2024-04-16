
public class HoaDonTheoNgay extends HoaDon {
	private int soNgayThue;

	

	public HoaDonTheoNgay(String maHoaDon, String tenKhachHang, String maPhong, int ngay, int thang, int nam,
			double donGia, int soNgayThue) {
		super(maHoaDon, tenKhachHang, maPhong, ngay, thang, nam, donGia);
		this.soNgayThue = soNgayThue;
	}

	public int getSoNgayThue() {
		return soNgayThue;
	}

	public void setSoNgayThue(int soNgayThue) {
		this.soNgayThue = soNgayThue;
	}

	@Override
	public double thanhTien() {
		if (soNgayThue > 7) {
			return soNgayThue  * getDonGia() * 0.2;
		}
		else {
			return soNgayThue * getDonGia();
		}
	}

	
	
	
}

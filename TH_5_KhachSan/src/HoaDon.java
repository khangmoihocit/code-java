
public class HoaDon {
	private String maHoaDon, tenKhachHang, maPhong;
	private int ngay, thang, nam;
	private double donGia;
	public HoaDon(String maHoaDon, String tenKhachHang, String maPhong, int ngay, int thang, int nam, double donGia) {
		this.maHoaDon = maHoaDon;
		this.tenKhachHang = tenKhachHang;
		this.maPhong = maPhong;
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
		this.donGia = donGia;
	}
	public HoaDon() {
	}
	public String getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public int getNgay() {
		return ngay;
	}
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double thanhTien() {
		return -1;
	}
	
}


public class GiaoDich {
	private String maGD;
	private int ngay, thang, nam;
	private double donGia, dienTich;
	public GiaoDich(String maGD, int ngay, int thang, int nam, double donGia, double dienTich) {
		this.maGD = maGD;
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}
	public GiaoDich() {
	}
	public String getMaGD() {
		return maGD;
	}
	public void setMaGD(String maGD) {
		this.maGD = maGD;
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
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	@Override
	public String toString() {
		return "GiaoDich [maGD=" + maGD + ", ngay=" + ngay + ", thang=" + thang + ", nam=" + nam + ", donGia=" + donGia
				+ ", dienTich=" + dienTich + "]";
	}

	
}

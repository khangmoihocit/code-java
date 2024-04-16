
public class GiaoDichNha extends GiaoDich{
	private String loaiNha, diaChi;

	public GiaoDichNha(String maGD, int ngay, int thang, int nam, double donGia, double dienTich, String loaiNha,
			String diaChi) {
		super(maGD, ngay, thang, nam, donGia, dienTich);
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
	}

	public String getLoaiNha() {
		return loaiNha;
	}

	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public double thanhTien() {
		if (loaiNha.equals("cao cap")) {
			return getDienTich() * getDonGia();
		}
		else if(loaiNha.equals("thuong")){
			return getDienTich() * getDonGia() * 0.9;
		}
		else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return super.toString() + "GiaoDichNha [loaiNha=" + loaiNha + ", diaChi=" + diaChi + "]";
	}
	
	

}

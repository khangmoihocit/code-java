
public class GiaoDichDat extends GiaoDich{
	private String loaiDat;

	public GiaoDichDat(String maGD, int ngay, int thang, int nam, double donGia, double dienTich, String loaiDat) {
		super(maGD, ngay, thang, nam, donGia, dienTich);
		this.loaiDat = loaiDat;
	}

	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}

	public double thanhTien() {
		if (loaiDat.equals("A")) {
			return getDienTich() * getDonGia() *1.5;
		}
		else if(loaiDat.equals("B") || loaiDat.equals("C")){
			return getDienTich() * getDonGia();
		}
		else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return super.toString() + "GiaoDichDat [loaiDat=" + loaiDat + "]";
	}
	
	
}

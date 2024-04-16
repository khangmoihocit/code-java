
public class Bao extends quanLyTaiLieu {
	private int ngayPhatHanh;

	public Bao(String maTaiLieu, String NXB, int soBan, int ngayPhatHanh) {
		super(maTaiLieu, NXB, soBan);
		this.ngayPhatHanh = ngayPhatHanh;
	}

	public Bao(String maTaiLieu, String NXB, int soBan) {
		super(maTaiLieu, NXB, soBan);
	}

	

	public int getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(int ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}
	public boolean check3(String mtl) {
		return mtl.equals(getMaTaiLieu());
	}

	@Override
	public String toString() {
		return super.toString() + "Bao [ngayPhatHanh=" + ngayPhatHanh + "]";
	}
	

}

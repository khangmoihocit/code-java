
public class quanLyTaiLieu {
	private String maTaiLieu;
	private String NXB;
	private int soBan;
	public quanLyTaiLieu(String maTaiLieu, String NXB, int soBan) {
		this.maTaiLieu = maTaiLieu;
		this.NXB = NXB;
		this.soBan = soBan;
	}
	public String getMaTaiLieu() {
		return maTaiLieu;
	}
	public void setMaTaiLieu(String maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}
	public String getNXB() {
		return NXB;
	}
	public void setNXB(String nXB) {
		NXB = nXB;
	}
	public int getSoBan() {
		return soBan;
	}
	public void setSoBan(int soBan) {
		this.soBan = soBan;
	}
	@Override
	public String toString() {
		return "quanLyTaiLieu [maTaiLieu=" + maTaiLieu + ", NXB=" + NXB + ", soBan=" + soBan + "]";
	}
	
	
	
}

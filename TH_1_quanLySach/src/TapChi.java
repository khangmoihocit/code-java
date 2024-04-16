
public class TapChi extends quanLyTaiLieu {
	private int soPhatHanh;
	private int thangPhatHanh;
	public TapChi(String maTaiLieu, String NXB, int soBan, int soPhatHanh, int thangPhatHanh) {
		super(maTaiLieu, NXB, soBan);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}
	
	public int getSoPhatHanh() {
		return soPhatHanh;
	}
	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}
	public int getThangPhatHanh() {
		return thangPhatHanh;
	}
	public void setThangPhatHanh(int thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}
	public boolean check2(String maTL) {
		return maTL.equals(getMaTaiLieu());
	}
	
}

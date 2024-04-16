
public class Sach extends quanLyTaiLieu {
	private String tenTG;
	private int soTrang;
	public Sach(String maTaiLieu, String NXB, int soBan, String tenTG, int soTrang) {
		super(maTaiLieu, NXB, soBan);
		this.tenTG = tenTG;
		this.soTrang = soTrang;
	}
	
	public Sach(String maTaiLieu, String NXB, int soBan) {
		super(maTaiLieu, NXB, soBan);
		// TODO Auto-generated constructor stub
	}
	public String getTenTG() {
		return tenTG;
	}
	public void setTenTG(String tenTG) {
		this.tenTG = tenTG;
	}
	public int getSoTrang() {
		return soTrang;
	}
	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	public boolean check1(String maTaiLieu) {
		if(maTaiLieu.equals(getMaTaiLieu())){
			return true;
		}
		else return false;
	}

	@Override
	public String toString() {
		return super.toString()+ "Sach [tenTG=" + tenTG + ", soTrang=" + soTrang + "]";
	}
	
	
	
}

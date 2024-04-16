package PhamVanKhang_De2;

public class Tuyen {
	private int  khoangCach, soDiemDung;
	private String maTuyen;
	static int a = 0;
	public Tuyen() {
	}

	public Tuyen(int khoangCach, int soDiemDung) {
		a++;
		String s = String.valueOf(a);
		this.maTuyen = "00" + s;
		this.khoangCach = khoangCach;
		this.soDiemDung = soDiemDung;
	}

	

	public String getMaTuyen() {
		return maTuyen;
	}

	public void setMaTuyen(String maTuyen) {
		this.maTuyen = maTuyen;
	}

	public int getKhoangCach() {
		return khoangCach;
	}

	public void setKhoangCach(int khoangCach) {
		this.khoangCach = khoangCach;
	}

	public int getSoDiemDung() {
		return soDiemDung;
	}

	public void setSoDiemDung(int soDiemDung) {
		this.soDiemDung = soDiemDung;
	}

	@Override
	public String toString() {
		return "Tuyen [maTuyen=" + maTuyen + ", khoangCach=" + khoangCach + ", soDiemDung=" + soDiemDung + "]";
	}
	public int khoangCach() {
		return this.khoangCach * this.soDiemDung;
	}
}

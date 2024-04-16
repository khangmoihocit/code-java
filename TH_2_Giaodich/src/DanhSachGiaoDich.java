import java.util.ArrayList;


public class DanhSachGiaoDich {
	 private ArrayList<GiaoDich> dsgd;

	public DanhSachGiaoDich(ArrayList<GiaoDich> dsgd) {
		this.dsgd = dsgd;
	}

	public DanhSachGiaoDich() {
		this.dsgd = new ArrayList<GiaoDich>();
	}
	public void them(GiaoDich x) {
		this.dsgd.add(x);
	}
	public void hien() {
		for (GiaoDich x : dsgd) {
			System.out.println(x);
		}
	}
	public void tongSoLuongTungLoai() {
		int a  = 0;
		int b=0;
		for(GiaoDich x : dsgd) {
			if (x instanceof GiaoDichDat) {
				a++;
			}
			else {
				b++;
			}
		}
		System.out.println("tong so luong giao dich dat la: " + a);
		System.out.println("tong so luong giao dich nha la: " + b);
	}
	public double tbThanhTien() {
		double s = 0;
		int cnt = 0;
		for (GiaoDich x : dsgd) {
			if (x instanceof GiaoDichDat) {
				s += ((GiaoDichDat) x).thanhTien();
				 cnt ++;
			}
		}
		if (cnt > 0) {  
			s = s / cnt;
		}
		else {
			System.out.println("khong co giao dich dat nao.");
		}
		return s;
	}
	
	public void giaoDichThang9() {
		for (GiaoDich x : dsgd) {
			if ((x.getThang() == 9) && x.getNam() == 2013) {
				System.out.println("cac giao dich thang 9/2013:");
				System.out.println(x);
			}
			else {
				System.out.println("khong co giao dich thang 9/2013 nao");
			}
		}
	}
	
}

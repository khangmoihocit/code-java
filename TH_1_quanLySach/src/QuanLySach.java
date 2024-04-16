import java.util.ArrayList;
import java.util.Scanner;


public class QuanLySach {
	private ArrayList<Sach> arr1;
	private ArrayList<TapChi> arr2;
	private ArrayList<Bao> arr3;
	public QuanLySach(ArrayList<Sach> arr1, ArrayList<TapChi> arr2, ArrayList<Bao> arr3) {
		this.arr1 = arr1;
		this.arr2 = arr2;
		this.arr3 = arr3;
	}
	public QuanLySach() {
		this.arr1 = new ArrayList<Sach>();
		this.arr2 = new ArrayList<TapChi>();
		this.arr3 = new ArrayList<Bao>();
	}
	public void themSach() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma tai lieu: "); String maTL = sc.nextLine();
		System.out.print("Nhap nha xuat ban: "); String nxb = sc.nextLine();
		System.out.print("nhap so ban: "); int soBan = sc.nextInt();
		sc.nextLine();
		System.out.print("nhap ten tac gia: "); String tenTG = sc.nextLine();
		System.out.print("nhap so trang: "); int soTrang = sc.nextInt();
		Sach sach = new Sach(maTL, nxb, soBan, tenTG, soTrang);
		this.arr1.add(sach);
		}
	public void themTapChi() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma tai lieu: "); String maTL = sc.nextLine();
		System.out.print("Nhap nha xuat ban: "); String nxb = sc.nextLine();
		System.out.print("nhap so ban: "); int soBan = sc.nextInt();
		sc.nextLine();
		System.out.print("nhap so phat hanh: "); int tenTG = sc.nextInt();
		System.out.print("nhap thang phat hanh: "); int soTrang = sc.nextInt();
		TapChi tp = new TapChi(maTL, nxb, soBan, tenTG, soTrang);
		this.arr2.add(tp);
	}
	public void themBao() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma tai lieu: "); String maTL = sc.nextLine();
		System.out.print("Nhap nha xuat ban: "); String nxb = sc.nextLine();
		System.out.print("nhap so ban: "); int soBan = sc.nextInt();
		sc.nextLine();
		System.out.print("nhap ngay phat hanh: "); int tenTG = sc.nextInt();
		Bao bao = new Bao(maTL, nxb, soBan, tenTG);
		this.arr3.add(bao);
	}
	public void xoa() {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap ma tai lieu: ");
		String maTaiLieu = sc.nextLine();
		for (Sach x : arr1) {
			if (x.check1(maTaiLieu)) {
				this.arr1.remove(x);
				break;
			}
			else {
				System.out.println("khong ton tai ma tai lieu nay!");
			}
		}
		for (TapChi x : arr2) {
			if (x.check2(maTaiLieu)) {
				this.arr2.remove(x);
				break;
			}
		}
		for (Bao x : arr3) {
			if (x.check3(maTaiLieu)) {
				this.arr3.remove(x);
				break;
			}
		}
	}
	

	
	
	

	
	
	
	
	
	
}

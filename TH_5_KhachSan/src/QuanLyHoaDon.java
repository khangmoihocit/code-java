import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHoaDon {
	private ArrayList<HoaDon> ds;

	public QuanLyHoaDon() {
		ds = new ArrayList<HoaDon>();
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.nextLine();
		System.out.println("1. Nhap hoa don the gio. \n2. Nhap hoa don theo ngay.");
		if (k == 1) {
			System.out.print("nhap ma hoa don: ");
			String maHoaDon = sc.nextLine();
			System.out.print("nhap ten khach hang: ");
			String tenKhachHang = sc.nextLine();
			System.out.print("nhap ma phong: ");
			String maPhong = sc.nextLine();
			System.out.print("nhap ngay");
			int ngay = sc.nextInt();
			System.out.print("nhap thang");
			int thang =  sc.nextInt();
			System.out.print("nhap nam");
			int nam = sc.nextInt();
			System.out.print("nhap don gia");
			double donGia = sc.nextDouble();
			System.out.print("nhap so gio thue");
			int soGioThue = sc.nextInt();
			HoaDon dhg = new HoaDonTheoGio(maHoaDon, tenKhachHang, maPhong, ngay, thang, nam, donGia, soGioThue);
			ds.add(dhg);
		}
		if (k == 2) {
			System.out.print("nhap ma hoa don: ");
			String maHoaDon1 = sc.nextLine();
			System.out.print("nhap ten khach hang: ");
			String tenKhachHang1 = sc.nextLine();
			System.out.print("nhap ma phong: ");
			String maPhong1 = sc.nextLine();
			System.out.print("nhap ngay");
			int ngay1 = sc.nextInt();
			System.out.print("nhap thang");
			int thang1 =  sc.nextInt();
			System.out.print("nhap nam");
			int nam1 = sc.nextInt();
			System.out.print("nhap don gia");
			double donGia1 = sc.nextDouble();
			System.out.print("nhap so ngay thue: ");
			int ngayThue1 = sc.nextInt();
			HoaDon hdngay = new HoaDonTheoNgay(maHoaDon1, tenKhachHang1, maPhong1, ngay1, thang1, nam1, donGia1, ngayThue1);
			ds.add(hdngay);
		}
		
	}
	public void  tongTungLoai() {
		int n =0;
		int m =0;
		for (HoaDon x : ds) {
			if (x instanceof HoaDonTheoGio) {
				++n;
			}
			else
				++m;
		}
		System.out.println("tong so luong hoa don theo gio la: " + n);
		System.out.println("tong so luong hoa don theo ngay la: " + m);
	}
	public double trungBinhThanhTien() {
		int s=0;
		for (HoaDon x : ds) {
			s += x.thanhTien();
		}
		return s;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

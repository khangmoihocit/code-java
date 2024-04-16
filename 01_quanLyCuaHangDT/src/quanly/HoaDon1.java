//package quanly;
//
//import java.sql.Date;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//import quanlifile.QuanLyFile;
//
//public class HoaDon1 {
//	private String maHD, ngayTaoHD;
//	private KhachHang khachHang;
//	private QuanLySanPham dsSanPham;
//	private int soLuongSP; // số sản phẩm mua
//	private ArrayList<SanPham> listSP;
//	static int a = 0;
//	private QuanLyFile quanLyFile;
//	// khởi tạo mã hoa don tự động tăng
//	public static String maHD(String s, int a) {
//		String res = "";
//		if (a >= 0 && a < 10) {
//			res = "00" + s;
//		} else if (a >= 10 && a <= 99) {
//			res = "0" + s;
//		} else {
//			res = s;
//		}
//		return res;
//	}
//	//khởi tạo thời gian tự động
//	public static String time() {
//		Date date = new Date(System.currentTimeMillis());
//		DateFormat dfm = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//		return dfm.format(date);
//	}
//	
//	public HoaDon1(KhachHang khachHang, int soLuongSP) {
//		a++;
//		String s = String.valueOf(a);
//		this.maHD = maHD(s, a);
//		this.ngayTaoHD = time();
//		this.khachHang = khachHang;
//		this.soLuongSP = soLuongSP;
//		this.quanLyFile = new QuanLyFile();
//	}
//	public HoaDon1() {
//		this.quanLyFile = new QuanLyFile();
//	}
//	public String getMaHD() {
//		return maHD;
//	}
//	public void setMaHD(String maHD) {
//		this.maHD = maHD;
//	}
//	public String getNgayTaoHD() {
//		return ngayTaoHD;
//	}
//	public void setNgayTaoHD(String ngayTaoHD) {
//		this.ngayTaoHD = ngayTaoHD;
//	}
//	public KhachHang getKhachHang() {
//		return khachHang;
//	}
//	public void setKhachHang(KhachHang khachHang) {
//		this.khachHang = khachHang;
//	}
//	public int getSoLuongSP() {
//		return soLuongSP;
//	}
//	public void setSoLuongSP(int soLuongSP) {
//		this.soLuongSP = soLuongSP;
//	}
//	
//	//khoi tao hoa don
//	public void khoiTaoHoaDon(int n, QuanLyKhachHang kh) {
//		String maKH = new Scanner(System.in).nextLine();
//		KhachHang x = kh.timKH(maKH);
//		HoaDon1 hd = new HoaDon1(x, n);
//	}
//	public double thanhTien() {
//		// vì giá sản phẩm có dạng 2.000.000VND nên sử dụng hàm chuanHoa() về dạng 2000000
//		long  s = 0;
//		for (SanPham x : listSP) {
//			int a = Integer.parseInt(x.chuanHoa(x.getGiaString()));
//			s += a;
//		}
//		return s;
//	}
//	public void xuatHoaDon() {
//		quanLyFile.outputHD(new HoaDon1(khachHang, soLuongSP));
//		System.out.println("xuất hóa đơn thành công!");
//	}
//	//hien thi danh sach san pham trong hoa don
//	public String getdsSanPham() {
//		String res = "";
//		for (SanPham x : listSP) {
//			res += x.toString() + "\n";
//		}
//		return res;
//	}
//	
//	@Override
//	public String toString() {
//		String format1 = "%-5s %-25s %-5s %-15s %-15s %-15s %-28s %-10s %-15s %-15s";
//		String tieuDe1 = String.format(format1, "Mã SP", "Tên SP", "SL", "thương hiệu", "hệ điều hành", 
//		"kích thước màn", "chip xử lý", "pin", "Xuất xứ", "giá(VND)");
//		String format2  = "%-10s %-20s %-10s %-25s %-15s %-20s";
//		String tieuDe2 = String.format(format2, "ID", "Họ và tên", "tuổi", "địa chỉ", "số điện thoại", "email");
//		
//		return "\nmã hóa đơn: " + getMaHD() 
//			+ "\n-------------thông tin khách hàng---------\n"+ tieuDe2 + "\n"+ getKhachHang() 
//			+ "\n-----------Thông tin sản phẩm----------\n" + getdsSanPham()
//			+ "\nThành tiền: "  + thanhTien() 
//			+ "\nNgày tạo hóa đơn: " + ngayTaoHD;
//	}
//	
//	
//	
//
//}

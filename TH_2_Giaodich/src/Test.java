import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		DanhSachGiaoDich a = new DanhSachGiaoDich();
		Scanner sc = new Scanner(System.in);
		
		int chon;
		do {
			System.out.println("MENU");
			System.out.println("1. Them giao dich dat" + "\n"
					+ "2. Them giao dich nha"+ "\n"
					+ "3.Tong so luong giao dich tung loai"+ "\n"
					+ "4. Trung binh thanh tien cua giao dich dat"+ "\n"
					+ "5. Cac giao dich cua thang 9/2013"
					+ "\n" + "6. hien cac giao dich");
			System.out.println("0.thoat");
			System.out.println("chon: ");
			chon = sc.nextInt();
			sc.nextLine();
			switch(chon) {
			case 1:{
				System.out.print("nhập mã giao dịch: "); String mgd = sc.nextLine();
				System.out.print("nhập ngày giao dịch: "); int ngay = sc.nextInt();
				System.out.print("nhập tháng giao dịch: "); int thang = sc.nextInt();
				System.out.print("Nhập năm giao dịch: "); int nam = sc.nextInt();
				System.out.print("nhập đơn giá: "); double dg = sc.nextDouble();
				System.out.print("nhập diện tích: "); double dt = sc.nextDouble(); sc.nextLine();
				System.out.print("nhập loại đất: "); String ld = sc.nextLine();
				GiaoDich x = new GiaoDichDat(mgd, ngay, thang, nam, dg, dt, ld);
				a.them(x);
				break;
			}
			case 2:{
				System.out.print("nhập mã giao dịch: "); String mgd = sc.nextLine();
				System.out.print("nhập ngày giao dịch: "); int ngay = sc.nextInt();
				System.out.print("nhập tháng giao dịch: "); int thang = sc.nextInt();
				System.out.print("Nhập năm giao dịch: "); int nam = sc.nextInt();
				System.out.print("nhập đơn giá: "); double dg = sc.nextDouble();
				System.out.print("nhập diện tích: "); double dt = sc.nextDouble(); sc.nextLine();
				System.out.print("nhập loại nhà"); String ld = sc.nextLine();
				System.out.print("nhập địa chỉ: "); String dcString = sc.nextLine();
				GiaoDich x = new GiaoDichNha(mgd, ngay, thang, nam, dg, dt, ld, dcString);
				a.them(x);
				break;
			}
			case 3:{
				a.tongSoLuongTungLoai();break;
			}
			case 4:{
				System.out.println(a.tbThanhTien());break;
			}
			case 5:{
				a.giaoDichThang9();break;
			}
			case 6:{
				a.hien();
			}
			default:{
				System.out.println("loi");break;
				
			}
			}
		} while (chon!=0);
	}
}

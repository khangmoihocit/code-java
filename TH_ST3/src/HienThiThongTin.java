import java.util.Scanner;

public class HienThiThongTin {
    private ThongTinConNguoi thongTin;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap loai thong tin (1: SinhVien, 2: NhanVien, 3: KhachHang): ");
        int loai = sc.nextInt();
        switch (loai) {
            case 1:
                thongTin = new SinhVien();
                break;
            case 2:
                thongTin = new NhanVien();
                break;
            case 3:
                thongTin = new KhachHang();
                break;
            default:
                System.out.println("Loai thong tin khong hop le");
                return;
        }
        thongTin.nhap();
    }

    public void hienThiThongTin() {
        if (thongTin != null) {
            System.out.println(thongTin.toString());
        } else {
            System.out.println("Chua co thong tin");
        }
    }
    
}
import java.util.Scanner;

public class KhachHang extends ThongTinConNguoi{
    private String kieuXe;

    public KhachHang(String ten, String diaChi, String kieuXe) {
        super(ten, diaChi);
        this.kieuXe = kieuXe;
    }
    public KhachHang(){
    }
    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap kieu xe: ");
        kieuXe = sc.nextLine();
    }

    @Override
    public String toString() {
        return "KhachHang [kieuXe=" + kieuXe + "]";
    }
}

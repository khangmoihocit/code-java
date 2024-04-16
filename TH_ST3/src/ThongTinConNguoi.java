import java.util.Scanner;

public class ThongTinConNguoi {
    private String ten, diaChi;

    public ThongTinConNguoi(String ten, String diaChi) {
        this.ten = ten;
        this.diaChi = diaChi;
    }
    public ThongTinConNguoi(){
    }
    public String getTen() {
        return ten;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
    }
    @Override
    public String toString() {
        return "ThongTinConNguoi [ten=" + ten + ", diaChi=" + diaChi + "]";
    }    
    
}

import java.util.Scanner;

public class SinhVien extends ThongTinConNguoi{
    private double diem1, diem2;

    public SinhVien(String ten, String diaChi, double diem1, double diem2) {
        super(ten, diaChi);
        this.diem1 = diem1;
        this.diem2 = diem2;
    }
    public SinhVien(){
    }
    

    public double getDiem1() {
        return diem1;
    }
    public double getDiem2() {
        return diem2;
    }
    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }
    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap diem 1: ");
        diem1 = sc.nextDouble();
        System.out.print("Nhap diem 2: ");
        diem2 = sc.nextDouble();
    }
    
    public double tinhTongDiem(){
        return diem1 + diem2;
    }
    public void capNhatThongTinSV(String ten, String diaChi, double diem1, double diem2){
        super.setTen(ten);
        super.setDiaChi(diaChi);
        this.diem1 = diem1;
        this.diem2 = diem2;
        
    }
    public void thayDoiDiem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("0. Thay doi diem mon 1\n 1. Thay doi diem mon 2");
        int chon = sc.nextInt();
        if (chon == 0){
            System.out.print("Nhap diem 1: ");
            diem1 = sc.nextDouble();
        } else {
            System.out.print("Nhap diem 2: ");
            diem2 = sc.nextDouble();
        }
    }
    @Override
    public String toString() {
        return super.toString() + " [diem1=" + diem1 + ", diem2=" + diem2 + "]";
    }
    
    
}

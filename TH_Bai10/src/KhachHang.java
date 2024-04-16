import java.io.Serializable;
import java.util.Scanner;

public class KhachHang implements Serializable{
    private String cmnd, tenKH, gaDen;
    private double giaTien;
    public KhachHang(String cmnd, String tenKH, String gaDen, double giaTien) {
        this.cmnd = cmnd;
        this.tenKH = tenKH;
        this.gaDen = gaDen;
        this.giaTien = giaTien;
    }
    public KhachHang(){

    }
    public String getCmnd() {
        return cmnd;
    }
    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
    public String getTenKH() {
        return tenKH;
    }
    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }
    public String getGaDen() {
        return gaDen;
    }
    public void setGaDen(String gaDen) {
        this.gaDen = gaDen;
    }
    public double getGiaTien() {
        return giaTien;
    }
    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap cmnd: ");
        cmnd = sc.nextLine();
        System.out.print("Nhap ten khach hang: ");
        tenKH = sc.nextLine();
        System.out.print("Nhap ga den: ");
        gaDen = sc.nextLine();
        System.out.print("Nhap gia tien: ");
        giaTien = sc.nextDouble();
        setCmnd(cmnd);
        setGaDen(gaDen);
        setGiaTien(giaTien);
        setTenKH(tenKH);
    }
    @Override
    public String toString() {
        return "KhachHang [cmnd=" + cmnd + ", tenKH=" + tenKH + ", gaDen=" + gaDen + ", giaTien=" + giaTien + "]";
    }
    
    
}

import java.util.Scanner;

public class NhanVien extends ThongTinConNguoi{
    private double luong;
    private String chucVu;
    public NhanVien(String ten, String diaChi, double luong, String chucVu) {
        super(ten, diaChi);
        this.luong = luong;
        this.chucVu = chucVu;
    }
    public NhanVien(){
    }
    public double getLuong() {
        return luong;
    }
    public void setLuong(double luong) {
        this.luong = luong;
    }
    public String getChucVu() {
        return chucVu;
    }
    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap luong: ");
        luong = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhap chuc vu(A or B or C): ");
        chucVu = sc.nextLine();
    }

    public double tinhLuong(){
        if (chucVu.equals("A")){
            return luong * 3;
        } else if (chucVu.equals("B")){
            return luong * 2;
        } else {
            return luong * 1;
        }
    }
    public void capNhatThongTinNV(NhanVien nv){
        this.setTen(nv.getTen());
        this.setDiaChi(nv.getDiaChi());
        this.setLuong(nv.luong);
        this.setChucVu(nv.chucVu);
    }
    public void luaChonThayDoi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("0. thay doi luong \n1. thay doi chuc vu");
        int chon = sc.nextInt();
        if (chon == 0){
            System.out.print("Nhap luong: ");
            luong = sc.nextDouble();
        } else {
            System.out.print("Nhap chuc vu(A or B or C): ");
            chucVu = sc.nextLine();
        }
    }
    @Override
    public String toString() {
        return super.toString() + "[luong=" + luong + ", chucVu=" + chucVu + "]";
    }
    
}

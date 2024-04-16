package BT_hinh;
public class test {
	public static void main(String[] args) {
		Shape hinhTron = new Circle("vang", false, 3);
		System.out.println(hinhTron.getArea());
		Shape hinhChuNhat = new Rectangle("do", false, 3, 4);
		System.out.println(hinhChuNhat.getArea());
		Shape hinhVuong = new Square("trang", false, 5);
		System.out.println(hinhVuong.getArea());
	}
}

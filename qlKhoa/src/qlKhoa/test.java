package qlKhoa;

public class test {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien("nguyen van a", "nu", "092623", "nu", "23A5" , 3, 5.6);
		SinhVien sv2 = new SinhVien("nguyen van b", "nu", "09263423", "nu", "23A5" , 3, 7.6);
		SinhVien sv3 = new SinhVien("nguyen van c", "nu", "0926234", "nu", "23A5" , 2, 8.6);
		QuanLySinhVien qlsv = new QuanLySinhVien();
		qlsv.them(sv3);
		qlsv.them(sv2);
		qlsv.them(sv1);
		qlsv.hien();
		qlsv.svHB();
		qlsv.sapXep();
		qlsv.hien();
	}
}

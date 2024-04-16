package mtha_qlphonghoc;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		QuanLyPhongHoc qlph = new QuanLyPhongHoc();
		int chon;
		while(true) {
			menu();
			chon = new Scanner(System.in).nextInt();
			switch(chon) {
			case 1:
				System.out.println("Nhap loai phong hoc: \n1.phong ly thuyet "
						+ "\n2. Phong may tinh"
						+ "\n3. Phong thi nghiem\n");
				int loai =  new Scanner(System.in).nextInt();
				qlph.themPhongHoc(loai);
				break;
			case 2:
				qlph.hienDS();
				break;
			case 3:
				qlph.dsPhongDatChuan();
				break;
			case 4:
				System.out.println("Nhap ma phong can tim: ");
				String maPhong = new Scanner(System.in).nextLine();
				if(qlph.searchByMaPhong(maPhong)==null)
					System.out.println("Khong tim thay phong hoc: " + maPhong);
				else
					System.out.println(qlph.searchByMaPhong(maPhong).toString());
				break;
				
			case 5:
				System.out.println("Nhap ma phong can cap nhat: ");
				String mp = new Scanner(System.in).nextLine();
				if(qlph.updMayTinh(mp))
					System.out.println("cap nhat thanh cong");
				else
					System.out.println("Cap nhat that bai");
				break;
			case 6:
				qlph.sortByDayNha();
				qlph.hienDS();
				break;
			case 7:
				System.out.println("Nhap ma phong can cap nhat: ");
				String mp1 = new Scanner(System.in).nextLine();
				if(qlph.delPhongHoc(mp1)==true) {
					System.out.println("xoa thanh cong");
				}else
					System.out.println("xoa that bai");
				break;
			default:
				break;			
				
			}
			if(chon<=0 || chon >7) {
				break;
			}
		}
	}
	
	
	public static void menu() {
		System.out.println("Quan ly phong hoc");
		System.out.println("1. Them moi phong hoc");
		System.out.println("2. hien danh sach phong hoc");
		System.out.println("3. Hien danh sach phong hoc dat chuan");
		System.out.println("4. Tim kiem phong hoc theo ma phong");
		System.out.println("5. cap nhat so luong may tinh");
		System.out.println("6. sap xep danh sach phong theo day ");
		System.out.println("7. Xoa phong hoc theo ma phong");
		System.out.println("Hay chon 1-7 de thuc hien chuong trinh: ");
	}

}

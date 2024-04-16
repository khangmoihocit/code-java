package bai3_giaiCuu;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NhanVat nv = new NhanVat(100, 100, true);
		int chon;
		do {
			System.out.println("1.Gap nam doc\n2. Gap phu thuy\n3.Gap cay dau than\n4.Gap binh linh");
			System.out.print("chon: ");
			chon = sc.nextInt();
			switch (chon) {
			case 1: {
				nv.mushroom();
				System.out.println(nv);
				break;
			}
			case 2: {
				nv.phuThuy(12);
				System.out.println(nv); break;
			}
			default :{
				System.out.println("loi");
				break;
			}
			}
		} while (chon != 0);
	}
}

package set;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSet1 {
	public static void main(String[] args) {
		// giong voi hashset, in ra theo thu tu xuat hien
		LinkedHashSet<Integer> set = new LinkedHashSet();
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<8; ++i) {
			set.add(scanner.nextInt());
		}
		for (int x : set) {
			System.out.print(x + " ");
		}
	}
	

}

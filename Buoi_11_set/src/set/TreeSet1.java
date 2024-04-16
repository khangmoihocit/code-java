package set;

import java.util.Scanner;
import java.util.TreeSet;
//TreeSet: co thu tu
//set.first(); phan tu dau tien
//set.last(); phan tu cuoi cung
//higher, lower, ceiling, floor.

public class TreeSet1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("hi");
//		TreeSet<String> set = new TreeSet<>();
//		String s = "ngon ngu lap trinh java va ngon ngu lap trinh python";
//		String[] arr = s.split(" ");//tach tu va dua vao mang
//		for(String x : arr) {
//			set.add(x);
//		}
//		for (String x: set) {
//			System.out.println(x);
//		}

		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0; i < 8; ++i) {
			set.add(scanner.nextInt());
			// 9 2 1 5 4 7 8 6
		}
		for (int x : set) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println(set.first());// Phan tu dau tien
		System.out.println(set.last());// phan tu cuoi cung
		System.out.println(set.higher(5)); // phan tu nho nhat ma lon hon 5
		System.out.println(set.lower(5)); // phan tu lon nhat ma nho hon 5
		System.out.println(set.ceiling(5)); // phan tu nho nhat >=5
		System.out.println(set.floor(5)); // phan tu lon nhat <=5
		System.out.println(set.headSet(6));//in ra cac phan tu nho hon 6
		System.out.println(set.tailSet(6));//in ra cac phan tu lon hon 6
		set.pollLast(); // xoa phan tu o cuoi
		set.pollFirst(); // xoa phan tu o dau
		for(int x: set) {
			System.out.print(x+ " ");
		}
				
		
	}
}

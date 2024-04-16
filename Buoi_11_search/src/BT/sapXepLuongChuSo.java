package BT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class sapXepLuongChuSo {
	public static int sapXepChan(int n) {
		int res = 0;
		while(n != 0) {
			int tmp = n%10;
			if (tmp % 2 == 0) {
				res++;
			}
			n /= 10;
		}
		return res;
	}
	public static void soChan(Integer[] a) {
		Arrays.sort(a, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (sapXepChan(o1) != sapXepChan(o2)) {
					return sapXepChan(o1) - sapXepChan(o2);
				}
				else {
					return o1 - o2;
				}
			}
		});
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[]a = new Integer[n];
		for (int i = 0; i<n; ++i) {
			a[i] = sc.nextInt();
		}
		soChan(a);
		for (int x : a) {
			System.out.print(x + " ");
		}
		
	}
}

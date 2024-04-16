import java.util.Arrays;
import java.util.Scanner;

//Arrays.sort(a);
public class p1 {
	public static void main(String[] args) {
		System.out.println("hello");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i=0; i<n; ++i) {
			a[i] = sc.nextInt();
		}
		
//		Arrays.sort(a); //O(NLogN)
		Arrays.sort(a, 0, 3); // sap xep theo chi so [a, b)
		for (int i=0; i<n; ++i) {
			System.out.print(a[i]);
		}
		
		
	}
}

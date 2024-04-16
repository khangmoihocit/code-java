import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p1 {
	public static int binarySearch(int a[],int x) {
		int l = 0, r = a.length - 1;
		while(l <= r) {
			int m = (l+r)/2;
			if (a[m] == x) {
				return m;
			}
			else if (a[m] < x) {
				l = m+1;
			}
			else {
				r = m-1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]a  = new int[] {1, 1,4, 5, 6, 7, 8, 9};
		System.out.println(a[Arrays.binarySearch(a, 8)]);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

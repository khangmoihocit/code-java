import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//comparator
public class p2_comparator {
	public static int tong(int n) {
		int res = 0;
		while (n != 0) {
			res += n % 10;
			n /= 10;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println("njdj");
		Scanner sc = new Scanner(System.in);

		Integer[] a = { 5, 14, 9, 2223, 111, 3, 121, 21};
		Arrays.sort(a, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				//table sort
				if(tong(o1) != tong(o2)) {
					if (tong(o1) < tong(o2))
						return -1;
					else {
						return 1;
					}
				}
				else {
					if (o1 < o2)
						return -1;
					else
						return 1;
				}
			}
		});
		
		for (int x : a) {
			System.out.print(x + " ");
		}
	}
}

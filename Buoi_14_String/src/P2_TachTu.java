import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

//split: tach tu
//StringTokenizer(s): stringstream c++
public class P2_TachTu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "ngon      ngu lap    trinh java";
//		String[] a = s.split("\\s+");
//		Arrays.sort(a);
//		for (String x: a ) {
//			System.out.println(x);
//		}
		StringTokenizer st = new StringTokenizer(s);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}
}

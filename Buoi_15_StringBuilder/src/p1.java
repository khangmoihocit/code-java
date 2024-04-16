import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
//		String s = "";
		Scanner sc = new Scanner(System.in);

		//cong so lon 
		System.out.println("cong so lon phai luu trong string");
		String s = sc.nextLine();
		int tong = 0;
		for (int i=0; i<s.length(); ++i) {
			tong += s.charAt(i) - '0'; // tru ma ascii: '0': 48, '2': 50 --> '2' - '0' = 50 - 48;
		}
		System.out.println(tong);
		
		//đếm tần suất 
		String ss = "byuhwdwwyyghsy6686262691";
		
		
	}
}

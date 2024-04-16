import java.util.Scanner;

public class LapNguoc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap chuoi: ");
		String s = sc.nextLine();
		System.out.print("xau lat nguoc: ");
		for (int i= s.length()-1; i>=0; --i) {
			System.out.print(s.charAt(i));
		}
		
	}
}

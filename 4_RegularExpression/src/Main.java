import java.util.Scanner;
import java.util.regex.Pattern;

//kiem tra input chuoi
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//vd1: nhap 1 so: "^[0-9]$"
		//vd2: nhap nhieu so : "^[0-9]+$"
		//vd3: nhap so >= 6 ki tu ^[0-9]{6,}$
		//vd4: chi nhap 6 ky tu ^[0-9]{6}$
		//vd5: khoang bao nhieu ky tu ^[0-9]{6, 10}$
		// [a-zA-Z], [a-zA-Z0-9], [a-zA-Z0-9 ]
		Pattern p = Pattern.compile("^[a-zA-Z ]+$");
		while(true) {
			System.out.print("input txt: ");
			String txt = sc.nextLine();
			if (p.matcher(txt).find()) {
				System.out.println("txt ok");
				break;
			}
			else {
				System.err.println("txt not ok");
			}
		}
	}
}

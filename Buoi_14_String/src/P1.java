import java.util.Scanner;

//length()
//charAt();
//toUpperCase();
//toLowerCase();
//concat(); == +
//compateTo(): so sanh 2 xau va tra ve gia tri thu tu tu dienx
//compareToIgnoreCase(): so sanh k phan biet in hoa, thuong
//substring(): tra ve xau con
//contains(): kiem tra su ton tai cua xau con
//replace(): thay the ky tu bang cac tu khac
public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String s = "lap trinh java";
//		System.out.println(s.length());
//		for (int i=0; i<s.length(); ++i) {
//			System.out.println(s.charAt(i));
//		}
		//System.out.println(s.toUpperCase());
		/*
		 * String t = "c++"; s = t + s; //s = t.concat(s); System.out.println(s);
		 */
		
		/*
		 * String t = "java"; String s = "Java"; System.out.println(t.compareTo(s));
		 * System.out.println((int)'j'); System.out.println((int)'p');
		 * System.out.println(t.compareToIgnoreCase(s));
		 */
		/*
		 * String s = "ngon ngu lap trinh java"; // s = s.substring(s.length()-4);
		 * System.out.println(s);
		 * 
		 * System.out.println(s.contains("lap "));
		 */
		String string = "java";
		string = string.toUpperCase();
		System.out.println(string);
	}
}

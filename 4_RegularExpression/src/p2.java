import java.util.Scanner;
import java.util.regex.Pattern;

public class p2 {
	public static String getPhone() {
		String txt = "";
		Scanner sc = new Scanner(System.in);
		//vd1: nhap theo dinh dang "123-123-1234" : "^[0-9]{3}-[0-9]{3}-[0-9]{4}$"
		//vd2: nhap x hoac ex tai 1 cho "^[0-9]{3}[x|ex]$"
		//vd3: "(123)-123" "^\\([0-9]{3}\\)-[0-9]{3}$"
		Pattern pattern1 = Pattern.compile("^\\([0-9]{3}\\)-[0-9]{3}$");
		Pattern pattern2 = Pattern.compile("^[0-9]{3}-[0-9]{3}-[0-9]{4}$");
		Pattern pattern3 = Pattern.compile("^[0-9]{3}[x|ex]$");
		while(true) {
			System.out.print("input txt: ");
			txt = sc.nextLine();
			if (pattern1.matcher(txt).find() || pattern2.matcher(txt).find() 
					|| pattern3.matcher(txt).find()) {
				break;
			}
			else {
				System.err.println("txt is not ok");
			}
		}
		return txt;
	}
	public static void main(String[] args) {
		String phone = getPhone();
		System.out.println(phone);
	}
}


public class ChuyenThuong {
	public static String convert(String s) {
		String res = "";
		for (int i = 0; i < s.length(); ++i) {
			res += Character.toLowerCase(s.charAt(i));
		}
		return res;
	}
	
	public static void main(String[] args) {
		String s = "NGON NGU LAP TRINH JAVA";
		System.out.println(convert(s));
		
	}
}

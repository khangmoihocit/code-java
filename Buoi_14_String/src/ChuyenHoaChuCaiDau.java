import java.util.ArrayList;
import java.util.StringTokenizer;

public class ChuyenHoaChuCaiDau {
	public static String convert(String s) {
		StringTokenizer st = new StringTokenizer(s);
		String res = "";
		ArrayList<String> arr = new ArrayList<>();
		while(st.hasMoreTokens()) {
			arr.add(st.nextToken());
		}
		for (String x: arr) {
			res += Character.toUpperCase(x.charAt(0)) + x.substring(1) + " ";
		}
		return res;
	}
	public static void main(String[] args) {
		String s = "pham van khang";
		System.out.println(convert(s));
	}
}

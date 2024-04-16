
public class Test {
	public static void main(String[] args) {
		String s = "001";
		int a = Integer.parseInt(s);
		a++;
		String ss = String.valueOf("00" + a);
		System.out.println(ss);
	}
}

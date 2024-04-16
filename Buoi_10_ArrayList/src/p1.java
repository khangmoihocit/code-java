import java.awt.image.RescaleOp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//add
//arr.get(i), arr.set(key, value)
//clear, isEmpty()
//contains: kiem tra gia tri co xuat hien trong mang
//remove: xoa theo chi so hoac object
//indexOf(): tra ve vi tri dau tien 
//forEach():
public class p1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(1);
//		arr.add(3);
//		arr.add(5);
//	
//		for (int x: arr) {
//			System.out.println(x + " ");
//		}
//		System.out.println(arr.isEmpty()); //kiem tra mang co rong hay khong
//		System.out.println(arr.contains(4));
//		 arr.remove(5);
//		 arr.remove((Object)1);
	
		int n = sc.nextInt();
		for (int i=0; i<n; ++i) {
			int tmp = sc.nextInt();
			arr.add(tmp);
		}
		Collections.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 -o2;
			}
		});
//		for (int x : arr) {
//			System.out.print(x + " ");
//		}
		arr.forEach((a) -> System.out.println(a + " "));
	}
}

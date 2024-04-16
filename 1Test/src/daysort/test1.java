package daysort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class test1 {
	public static void main(String[] args) {
		String s1 = "";
		String s2 = "2/3/2023";
		String s3 = "3/4/2023";
		ArrayList<String> arr = new ArrayList<String>();
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		Collections.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				String[]a = o1.split("/");
				String[]b = o2.split("/");
				if (a[2].compareTo(b[2]) != 0) {
					if(a[2].compareTo(b[2]) > 0)return -1;
					else return 1;
				}
				else if (a[1].compareTo(b[1]) != 0) {
					if (a[1].compareTo(b[1]) > 0) return -1;
					else return 1;
				}
				else {
					if (a[0].compareTo(b[0]) > 0) return -1;
					else return 1;
				}
			}
		});
		for (String x : arr) {
			System.out.println(x);
		}
	}
}

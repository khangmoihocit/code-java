package interface_comparatoble;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		Students st1 = new Students(4, "a");
		Students st2 = new Students(2, "h");
		Students st3 = new Students(5, "b");
		Students st4 = new Students(1, "a");
		ArrayList<Students> dsst = new ArrayList<Students>();
		dsst.add(st1);
		dsst.add(st2);
		dsst.add(st3);
		dsst.add(st4);
		for (Students x : dsst) {
			System.out.println(x.getGpa() + " " + x.getTen());
		}
		System.out.println("sau khi sort");
		Collections.sort(dsst, new SortStudents());
		for (Students x : dsst) {
			System.out.println(x.getGpa() + " " + x.getTen());
		}
	}
}

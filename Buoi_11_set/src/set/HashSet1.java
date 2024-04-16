package set;

import java.lang.foreign.AddressLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

//set.size();
//set.add(...);
//set.contains(...); tim
//set.remove(...); xoa
//set1.addAll(set2); add set1 tu set2
//set1.remove(set2); xoa phan tu o set1 ma set2 co
//set1.retainAll(set2); giao sua set1 va set2

public class HashSet1 {
	public static void main(String[] args) {
//		HashSet<Integer> set = new HashSet<>();
//		set.size();// so phan tu trong set
//		set.add(1);
//		set.add(3);// them phan tu
//		Random random = new Random();
//		for (int i=0; i<10; ++i) {
//			set.add(random.nextInt(10));
//		}
//		
//		//for each
////		for (int x : set) {
//			System.out.print(x + " ");
//		}
		
		
		//interator
//		Iterator it = set.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next() + " ");
//		}
		
//		//set.contains();
//		if(set.contains(7)) System.out.println("find");
//		else System.out.println("not find");
//		//set.remove();
//		set.remove(7);
//		
//		for(int x : set) {
//			System.out.println(x + " ");
//		}
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		for (int i=1; i<9; ++i) set2.add(i);	
		//set1.addAll()set2
		set1.addAll(set2);// add tu set 2 qua set 1
		for (int a : set1) {
			System.out.println(a + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

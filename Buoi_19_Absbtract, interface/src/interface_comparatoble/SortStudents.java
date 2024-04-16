package interface_comparatoble;

import java.util.Comparator;
//comparator
public class SortStudents implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		return (int)(o1.getGpa() - o2.getGpa());
	}

	

	
}

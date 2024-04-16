package interface_comparatoble;

public class Students implements Comparable<Students> {
	private double gpa;
	private String ten;

	public Students(double gpa, String ten) {
		this.gpa = gpa;
		this.ten = ten;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Override
	public int compareTo(Students o) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
	}

//	@Override
//	public int compareTo(Students o) {
//		if (this.getTen() != o.getTen()) { 	
//			return this.getTen().compareTo(o.getTen());
//		}
//		else {
//			return (int) (this.getGpa() - o.getGpa());
//		}
//		
//	}

}

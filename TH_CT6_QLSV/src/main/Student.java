package main;

public class Student extends Person{
	private String studentID;
	private int yearMatrlculated;
	public Student(String lastName, String firstName, String studentID, int yearMatrlculated) {
		super(lastName, firstName);
		this.studentID = studentID;
		this.yearMatrlculated = yearMatrlculated;
	}
	public Student() {
		
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getYearMatrlculated() {
		return yearMatrlculated;
	}
	public void setYearMatrlculated(int yearMatrlculated) {
		this.yearMatrlculated = yearMatrlculated;
	}
	@Override
	public String toString() {
		return super.toString() + ", studentID=" + studentID + ", yearMatrlculated=" + yearMatrlculated + "]";
	}
	
}

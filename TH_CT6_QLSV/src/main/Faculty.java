package main;

public class Faculty extends Person{
	private String facultyID, office;

	public Faculty(String lastName, String firstName, String facultyID, String office) {
		super(lastName, firstName);
		this.facultyID = facultyID;
		this.office = office;
	}
	public Faculty() {
		
	}
	public String getFacultyID() {
		return facultyID;
	}
	public void setFacultyID(String facultyID) {
		this.facultyID = facultyID;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	@Override
	public String toString() {
		return super.toString() + "facultyID=" + facultyID + ", office=" + office + "]";
	}
	
}

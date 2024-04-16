package main;

import java.util.TreeSet;

public class Section {
	private String sectionNor, semester, room;
	private Faculty faculty;
	private TreeSet<Enrolment> setEmrolment;
	public Section(String sectionNor, String semester, String room, Faculty faculty, TreeSet<Enrolment> setEmrolment) {
		this.sectionNor = sectionNor;
		this.semester = semester;
		this.room = room;
		this.faculty = faculty;
		this.setEmrolment = setEmrolment;
	}
	public Section() {
		setEmrolment = new TreeSet<Enrolment>();
	}
	public String getSectionNor() {
		return sectionNor;
	}
	public void setSectionNor(String sectionNor) {
		this.sectionNor = sectionNor;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	public TreeSet<Enrolment> getSetEmrolment() {
		return setEmrolment;
	}
	public void setSetEmrolment(TreeSet<Enrolment> setEmrolment) {
		this.setEmrolment = setEmrolment;
	}
	
}

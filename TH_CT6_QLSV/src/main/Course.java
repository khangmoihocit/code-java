package main;

import java.util.ArrayList;
import java.util.TreeSet;

public class Course {
	private String courseNor, courseTitle;
	private int crodits;
	private ArrayList<Section> listSection;
	public Course(String courseNor, String courseTitle, int crodits) {
		this.courseNor = courseNor;
		this.courseTitle = courseTitle;
		this.crodits = crodits;
		this.listSection = new ArrayList<Section>();
	}
	public Course() {
		this.listSection = new ArrayList<Section>();
	}
	
	public void addSection(String sectionNor, String semester, String room, Faculty facultyMember, TreeSet<Enrolment> listEnrolls) {
		Section section = new Section(sectionNor, semester, room, facultyMember, listEnrolls);
		listSection.add(section);
	}
	public void display(){
		for (Section section : listSection) {
			System.out.println("Section Number: " + section.getSectionNor());
			System.out.println("Semester: " + section.getSemester());
			System.out.println("Room: " + section.getRoom());
			System.out.println("Faculty: " + section.getFaculty().getFirstName() + " " + section.getFaculty().getLastName());
			System.out.println("Enrolments: ");
			for (Enrolment enrolment : section.getSetEmrolment()) {
				System.out.println("Student: " + enrolment.getStudent().getFirstName() + " " + enrolment.getStudent().getLastName());
				System.out.println("Status: " + enrolment.getStatus());
				System.out.println("Grade: " + enrolment.getGrade());
				System.out.println("Number Grade: " + enrolment.getNumGrade());
			}
		}
	}
	public String getCourseNor() {
		return courseNor;
	}
	public void setCourseNor(String courseNor) {
		this.courseNor = courseNor;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public int getCrodits() {
		return crodits;
	}
	public void setCrodits(int crodits) {
		this.crodits = crodits;
	}
	public ArrayList<Section> getListSection() {
		return listSection;
	}
	public void setListSection(ArrayList<Section> listSection) {
		this.listSection = listSection;
	}
	
}

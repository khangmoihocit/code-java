package main;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Dela Cruz", "Juan", "2018-0001", 2018);
        Student s2 = new Student("Ramos", "Maria", "2018-0002", 2018);
        Faculty f1 = new Faculty("Reyes", "Jose", "F2018-0001", "Rm 101");
        Faculty f2 = new Faculty("Santos", "Pedro", "F2018-0002", "Rm 102");
        Enrolment e1 = new Enrolment("Enrolled", "B", 85.0f, s1);
        Enrolment e2 = new Enrolment("Enrolled", "A", 90.0f, s2);
        Section sec1 = new Section("S18-001", "1st Semester, 2018", "Rm 101", f1, null);
        Section sec2 = new Section("S18-002", "1st Semester, 2018", "Rm 102", f2, null);
        Course c1 = new Course("IT101", "Introduction to Programming", 3);
        c1.addSection("S18-001", "1st Semester, 2018",
         "Rm 101", f1, null);
        c1.addSection("S18-002", "1st Semester, 2018", "Rm 102", f2, null);
        c1.display();
    }
}

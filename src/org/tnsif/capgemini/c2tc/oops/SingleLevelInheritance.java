package org.tnsif.capgemini.c2tc.oops;

class Course{
	String courseName = "Java Programming";
	
	void showCourse() {
		System.out.println("Course: " + courseName);
		
	}
}

class Student extends Course{
	String studentName = "Kunal";
	
	void showStudent() {
		System.out.println("Student: " + studentName);
	}
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.showStudent();
		stu.showCourse();
	}

}

package hw5Q3Constructor;

public class Student {

	public String stName;
	public int stID;
	public char sex;
	public boolean isProgrammer;
	public float grade;

	public Student() {
		System.out.println("TThis is from the default Constructor of the Student class");
	}

	public Student(String stName, int stID, char sex, boolean isProgrammer, float grade) {
		super();
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		
		System.out.println("\nStudent Name :"+ stName + "\nStudent ID:" +stID+ "\nSex:" +sex+ "\nIs the student a Programmer:" + isProgrammer+ "\nStudent grade:" + grade);
	}

}

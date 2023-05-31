package hw3JavaVariables;

import java.security.PublicKey;

public class AboutMe {

	// Variable declared and initialized
	public String firstName = "Mohammed ";
	public String middleName = "Shaki ";
	public String lastName = "Islam";
	String fullName = firstName + middleName + lastName;
	public byte age = 44;
	public short myHouseNumber = 13714;
	public int myYearlySalary = 000000000;

	public long myBankBalance = 00000l;
	public float myHeight = 1.00f;
	public double myGrade = 0.00;
	public char sex = 'M';
	public boolean usCitizen = true;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println(aboutMe.fullName);
		System.out.println(aboutMe.age);
		System.out.println(aboutMe.myHouseNumber);
		System.out.println(aboutMe.myYearlySalary);
		System.out.println(aboutMe.myBankBalance);
		System.out.println(aboutMe.myHeight);
		System.out.println(aboutMe.myGrade);
		System.out.println(aboutMe.sex);
		System.out.println(aboutMe.usCitizen);
		System.out.println("My Name: " + aboutMe.fullName + ", My Age: " + aboutMe.age);

	}

}
package hw4JavaVariables;

public class AboutMe {
	
	// variables declared
		public String name; 
		public byte age;
		public short myHouseNumber;
		public int myYearlySalary;
		public long myBankBalance; 
		public float myWeight;
		public double myGrade;
		public char sex;
		public boolean usCitizen;
		
		
		 public AboutMe() {
			 System.out.println("This is all about me: ");
		 
			
		}
		// method implemented
		 public void myInfo () {
				System.out.println("My Name: " + name + "\nMy Age: " + age + "\nMy House Number: " + myHouseNumber
						+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Balance:" + myBankBalance + "\nSex: " + sex
						+ "\nMy Weight(lb): " + myWeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);
	

	}
}



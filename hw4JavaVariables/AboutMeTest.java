package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe mohammedIslam = new AboutMe(); // Constructor in initialized

		mohammedIslam.name = "Mohammed Islam"; // variable initialized
		mohammedIslam.age = 44;
		mohammedIslam.myHouseNumber = 13714;
		mohammedIslam.myYearlySalary = 150000;
		mohammedIslam.myBankBalance = 120000;
		mohammedIslam.sex = 'M';
		mohammedIslam.myWeight = 169;
		mohammedIslam.myGrade = 3.6;
		mohammedIslam.usCitizen = true;
		mohammedIslam.myInfo();

		System.out.println("\n------------------------------------\n");
		AboutMe alex = new AboutMe();
		alex.name = "Jennier Alex"; // variable initialized
		alex.age = 40;
		alex.myHouseNumber = 1000;
		alex.myYearlySalary = 150000;
		alex.myBankBalance = 120000;
		alex.sex = 'F';
		alex.myWeight = 169;
		alex.myGrade = 3.6;
		alex.usCitizen = true;
		alex.myInfo();

		// TODO Auto-generated method stub

	}

}

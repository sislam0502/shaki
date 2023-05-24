package hw5Q2Constructor;

public class Computer {

	// variable is declared
	public String brandName;
	public String modelName;
	public String oSystem;
	public char grade;
	public short price;
	public boolean madeInUSA;

	// Default constructor is created

	public Computer() {

		System.out.println("This is from the default Constructor of Computer class");
	}

	public Computer(String brandName, String modelName, String oSystem, char grade, short price,
			boolean madeInUSA) {
		super();
		this.brandName = brandName;
		this.modelName = modelName;
		this.oSystem = oSystem;
		this.grade = grade;
		this.price = price;
		this.madeInUSA = madeInUSA;

		System.out.println("\nBrand name:" + brandName+ " \nModel Name: "  + modelName + " \nOperating system :" + oSystem + "\nGrade:" + grade + "\nPrice :" + price + " \nMade in USA:"  + madeInUSA );
	}

}

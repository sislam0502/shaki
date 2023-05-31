package hw6IfElseCondition01;

import java.util.Scanner;

public class Voter {

	public static void main(String[] args) {

		System.out.println("Please enter your age:");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if (age == 18) {
			System.out.println("I am a Voter");

		} else if (age < 18) {
			System.out.println("I am not a Voter");

		} else if (age > 18) {
			System.out.println("I am a Voter from age 18");
		} else
			System.out.println("Please add a valid age");

		scanner.close();
	}
}
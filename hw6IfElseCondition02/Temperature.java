package hw6IfElseCondition02;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		System.out.println(".......Give the temperature:......... ");
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        if (temp < 32){
            System.out.println("Freezing");
        }
        else if (temp < 55){
            System.out.println("Pleasent");
        }
        else if (temp < 73) {
        	System.out.println("Getting Warmer");
			
		}
        else if (temp >101) {
        	System.out.println("Very Hot");
			
		}
        else{
            System.out.println("Please put a valid temperature");
        }
        scanner.close();
    } 


	}



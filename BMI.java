/* 
 * Name: Pranshu Suri
 * Date: 1-25-16
 * Purpose of Program: To calculate the BMI of a specific individual given information inputted by the user.
 */

import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your name (first last) : ");
		String firstName = in.next();
		String lastName = in.next();
		System.out.print("Enter your weight in pounds (e.g. 175): ");
		double weightPounds = in.nextDouble();
		System.out.print("Enter your height in feet and inches (e.g. 5 11): ");
		double feet = in.nextDouble();
		double inches = in.nextDouble();
		
		String category = "";
		double heightInches = feet * 12 + inches;
		double heightMeters = (int)(.0254 * heightInches * 10) / 10.0;
		double weightKilograms = (int)(weightPounds * .453592 * 10) / 10.0;
		double BMI = (int)(weightPounds / (heightInches * heightInches) * 703 * 10) / 10.0;
		
		if (BMI <= 18.5)
			category = "Underweight";
		else if (BMI < 25)
			category = "Normal Weight";
		else if (BMI < 30)
			category = "Overweight";
		else
			category = "Obese";
		
		System.out.println("\nBody Mass Index Calculator");
		System.out.println("==========================");
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Height (m): " + heightMeters);
		System.out.println("Weight (kg): " + weightKilograms);
		System.out.println("BMI: " + BMI);
		System.out.println("Category: " + category);
		
		
	}

}

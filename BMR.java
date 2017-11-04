/* 
 * Name: Pranshu Suri
 * Date: 1-25-16
 * Purpose of Program: To calculate the BMR of a specific individual given information inputted by the user.
 */

import java.util.Scanner;
public class BMR {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = in.next();
		
		System.out.print("Gender (M or F): ");
		char gender = in.next().charAt(0);
		
		System.out.print("Enter your age: ");
		String ageInput = in.next();
		int age = Integer.parseInt(ageInput);
		
		System.out.print("Height in inches: ");
		String height = in.next();
		double heightInches = Double.parseDouble(height);
		
		System.out.print("Weight in pounds: ");
		String weight = in.next();
		double weightPounds = Double.parseDouble(weight);
		
		double BMR;
		double heightCentimeters = ((int)(heightInches * 2.54 * 10)) / 10.0;
		double weightKilograms = ((int)(weightPounds * .453592 * 10) / 10.0);
		
		if (gender == 'M')
			BMR = (int)((66.5 + (13.75 * weightKilograms) + (5.003 * heightCentimeters) - (6.755 * age)) * 10) / 10.0;
		else
			BMR = (int)((655.1 + (9.563 * weightKilograms) + (1.850 * heightCentimeters) - (4.676 * age)) * 10) / 10.0;
		
		System.out.println("\n\nCalculate Your Basal Metabolism\n");
		
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Height (cm): " + heightCentimeters);
		System.out.println("Weight (kg): " + weightKilograms);
		System.out.println("Basal Metabolic Rate: " + BMR + " calories per day");
		
	}

}

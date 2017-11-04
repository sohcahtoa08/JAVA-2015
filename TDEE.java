/**
 * User enters information and program determines activity factor and TDEE through series of conditionals evaluated based on inputted information.
 * 
 * @author Pranshu Suri
 * @version 1/25/16
 */

import java.util.Scanner;
public class TDEE {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double activityFactor = 0;
		
		System.out.print("Please enter your name: ");
		String firstName = in.next();
		String lastName = in.next();
		String name = firstName + " " + lastName;
		System.out.print("Please enter your BMR: ");
		double BMR = in.nextDouble();
		System.out.print("Please enter your gender (M/F): ");
		String gender = in.next();
		
		System.out.println("\nSelect Your Activity Level");
		System.out.println("[0] Resting (Sleeping, Reclining)");
		System.out.println("[1] Sedentary (Minimal Movement)");
		System.out.println("[2] Light (Sitting, Standing)");
		System.out.println("[3] Moderate (Light Manual Labor, Dancing, Riding Bike");
		System.out.println("[4] Very Active (Teams Sports, Hard Manual Labor");
		System.out.println("[5] Extremely Active (Full-time Athlete, Heavy Manual Labor)");
		
		System.out.print("\nEnter the number corresponding to your activity level: ");
		int choice = in.nextInt();
		
		if (choice == 0)
			activityFactor = 1.0;
		else if (choice == 1 && gender.equalsIgnoreCase("F"))
			activityFactor = 1.3;
		else if ((choice == 2 && gender.equalsIgnoreCase("M")) || (choice == 3 && gender.equalsIgnoreCase("F")))
			activityFactor = 1.6;
		else if (choice == 2 && gender.equalsIgnoreCase("F"))
			activityFactor = 1.5;
		else if (choice == 3 && gender.equalsIgnoreCase("M"))
			activityFactor = 1.7;
		else if (choice == 4 && gender.equalsIgnoreCase("M"))
			activityFactor = 2.1;
		else if (choice == 4 && gender.equalsIgnoreCase("F"))
			activityFactor = 1.9;
		else if (choice == 5 && gender.equalsIgnoreCase("M"))
			activityFactor = 2.4;
		else if (choice == 5 && gender.equalsIgnoreCase("F"))
			activityFactor = 2.2;
		else
			System.out.println("Sorry, your input is invalid!");
		
		double TDEE = BMR * activityFactor;
		
		System.out.println("Name: " + name + "\tGender: " + gender);
		System.out.println("BMR: " + BMR + " calories" + "\tActivity Factor: " + activityFactor);
		System.out.println("TDEE: " + TDEE + " calories");
		
	}

}

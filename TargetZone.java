/* 
 * Name: Pranshu Suri
 * Date: 1-18-16
 * Purpose of Program: To calculate a target heart rate zone based on an individual's age and resting heart rate using the Karvonen Formula and to determine whether a given heart rate for this individual after exercising is within their target zone.
 */

import java.util.Scanner;
public class TargetZone {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Determine Your Target Heart Rate Zone for Cardiovascular Exercise (50%-85%)");
		
		// Prompt user for age
		System.out.print("\nEnter your age: ");
		String inputAge = in.next();
		int age = Integer.parseInt(inputAge);
		
		// Prompt user for resting heart rate
		System.out.print("Enter your resting heart rate: ");
		String inputRestingHeartRate = in.next();
		int restingHeartRate = Integer.parseInt(inputRestingHeartRate);
		
		// Prompt user for heart rate after exercise
		System.out.print("Enter your heart rate after exercising: ");
		String inputHeartRateAfterExercise = in.next();
		int heartRateAfterExercise = Integer.parseInt(inputHeartRateAfterExercise);
		
		// Karvonen Formula for calculating lower and upper bounds at 50% and 85%, respectively
		int lowerBound = (int)((((220 - age) - restingHeartRate) * .5) + restingHeartRate);
		int upperBound = (int)((((220 - age) - restingHeartRate) * .85) + restingHeartRate);
		
		// Print heart rate target zone
		System.out.println("Your heart rate target zone is between " + lowerBound + " and " + upperBound);
		
		// Print whether or not exercise heart rate falls within heart rate target zone
		if (heartRateAfterExercise >= lowerBound)
			if (heartRateAfterExercise <= upperBound)
				System.out.println("After just exercising, your heart rate is within your target zone.");
		if (heartRateAfterExercise < lowerBound)
			System.out.println("After just exercising, your heart rate is lower than your target zone.");
		if (heartRateAfterExercise > upperBound)
			System.out.println("After just exercising, your heart rate is higher than your target zone.");
		
	}

}

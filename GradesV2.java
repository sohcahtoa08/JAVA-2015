/* 
 * Name: Pranshu Suri
 * Date: 12-30-15
 * Purpose of Program: To calculate the average grade each time a new score is added to the total using increment and arithmetic/assignment operators
 */

public class GradesV2 {

	public static void main(String[] args) {
		// local variables
		int totalPoints = 0;  // total points for all tests
		int numTests = 0;     // counts number of tests
		int testGrade = 0;    // individual test grade
		double average = 0.0; // average grade
		
		testGrade = 97;
		numTests ++;
		totalPoints += testGrade;
		average = (double)totalPoints / numTests;
		System.out.println("n = " + numTests + " New Test Grade: " + testGrade + " Total Points: " + totalPoints + "\tAverage Score: " + average);
		
		testGrade = 79;
		numTests ++;
		totalPoints += testGrade;
		average = (double)totalPoints / numTests;
		System.out.println("n = " + numTests + " New Test Grade: " + testGrade + " Total Points: " + totalPoints + "\tAverage Score: " + average);
		
		testGrade = 83;
		numTests ++;
		totalPoints += testGrade;
		average = (double)totalPoints / numTests;
		System.out.println("n = " + numTests + " New Test Grade: " + testGrade + " Total Points: " + totalPoints + "\tAverage Score: " + average);
		
		testGrade = 88;
		numTests ++;
		totalPoints += testGrade;
		average = (double)totalPoints / numTests;
		System.out.println("n = " + numTests + " New Test Grade: " + testGrade + " Total Points: " + totalPoints + "\tAverage Score: " + average);
		
		// additional three test grades
		testGrade = 55;
		numTests ++;
		totalPoints += testGrade;
		average = (double)totalPoints / numTests;
		System.out.println("n = " + numTests + " New Test Grade: " + testGrade + " Total Points: " + totalPoints + "\tAverage Score: " + average);
		
		testGrade = 100;
		numTests ++;
		totalPoints += testGrade;
		average = (double)totalPoints / numTests;
		System.out.println("n = " + numTests + " New Test Grade: " + testGrade + " Total Points: " + totalPoints + "\tAverage Score: " + average);
		
		testGrade = 98;
		numTests ++;
		totalPoints += testGrade;
		average = (double)totalPoints / numTests;
		System.out.println("n = " + numTests + " New Test Grade: " + testGrade + " Total Points: " + totalPoints + "\tAverage Score: " + average);
		
	}

}

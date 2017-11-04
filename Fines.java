/* 
 * Name: Pranshu Suri
 * Date: 1-1-16
 * Purpose of Program: To create a program that calculates fines for overdue books using user input and prints various other information
 */

import java.util.Scanner;

public class Fines {

	public static void main(String[] args) {
		
		/*Scanner in = new Scanner(System.in);
		
		// user input
		System.out.print("Enter name (Last, First) and Social Security Number (###-##-####): ");
		String lastName = in.next();
		String firstName = in.next();
		String name = lastName + " " + firstName;
		String socialSecurityNum = in.nextLine();
		
		
		System.out.print("\nEnter the title of the book: ");
		String title = in.nextLine();
		
		System.out.print("\nEnter the date checked out (mm/dd/yyyy): ");
		String date = in.next();
		
		System.out.print("\nDays late: ");
		String daysLate = in.next();
		
		System.out.print("Daily fine: ");
		String dailyFine = in.next();
		
		// print output
		String account = lastName.substring(0,lastName.length()-1) + firstName.substring(0,1) + "-" + socialSecurityNum.substring(8);
		System.out.println("\n\nTo: " + name + "\t\tAccount: " + account);
		
		System.out.println("From: Mona");
		System.out.println("Subject: Overdue Notice");
		System.out.println("=============================================================");
		
		date = date.replaceAll("/","-");
		System.out.println(title + " was checked out on: " + date);
		
		System.out.println("This book is currently " + daysLate + " days late.");
		double fine = Integer.parseInt(daysLate) * Double.parseDouble(dailyFine);
		System.out.println("You fine has accumulated to: " + fine);*/
		
		String str = "supercalifragilisticexpealidocious";
		
		System.out.println(str.substring(21));

	}

}

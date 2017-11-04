/**
 * Prompts user to select a category and tests the menu structure.
 * 
 * @author Pranshu Suri
 * @version 1/25/16
 */
import java.util.Scanner;
public class WellnessMenu
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please select one of the following options from the menu for more information.");
        System.out.println("\nSelect a letter corresponding to a menu option.");
        System.out.println("[A] BMI");
        System.out.println("[B] BMR");
        System.out.println("[C] Healthy Eating");
        System.out.println("[D] Food Pyramid");
        System.out.println("[E] Fitness Training");
        System.out.print("Enter A, B, C, D, or E: ");
        String choice = in.next();
        System.out.println();
        
        if (choice.equalsIgnoreCase("A")) //condition for choice A goes in the parentheses
        {
            System.out.println("Testing: You chose A for BMI");
        }
        else if(choice.equalsIgnoreCase("B")) //condition for choice B goes in the parentheses
        {
        	System.out.println("Testing: You chose B for BMR");
        }
        else if (choice.equalsIgnoreCase("C")) //condition for choice C goes in the parentheses
        {
        	System.out.println("Testing: You chose C for Healthy Eating");
        }
        else if (choice.equalsIgnoreCase("D")) //condition for choice D goes in the parentheses
        {
        	System.out.println("Testing: You chose D for Food Pyramid");
        }
        else if (choice.equalsIgnoreCase("E")) //condition for choice E goes in the parentheses
        {
        	System.out.println("Testing: You chose E for Fitness Training");
        }
        else //default choice for an invalid entry
        {
            System.out.println("You did not choose a valid menu option!");
        }
    }
}
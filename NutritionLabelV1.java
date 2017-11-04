/*
 * The purpose of this program is to compare nutritional values of food labels to the daily recommended values and print the results.
 * 
 * ©FLVS 2007
 * @author Pranshu Suri
 * @version 1/17/16
 */

import java.util.Scanner;
public class NutritionLabelV1
{
    public static void main(String[] args)
    {
        String foodItem;                            //food item
        
        int dailyTotalCalories = 2000;              //max daily calories
        int dailyValueGramsTotalFat = 65;           //fat DRV    
        int dailyValueTotalCarbs = 300;             //carbohydrates DRV       
        int dailyValueFiber = 25;                   //fiber DRV
        int dailyValueProtein = 50;                 //protein DRV
  
        //object to use the keyboard input methods
        Scanner in = new Scanner(System.in);
        
        //prompt user for input
        System.out.print("Enter the name of the food item: ");
        foodItem = in.nextLine();
        System.out.println();
        
        //serving size
        System.out.print("How many servings will you eat? ");
        int servingSize = in.nextInt();
        
        //calories
        System.out.print("Enter Calories per Serving: ");
        int totalCalories = in.nextInt();
        totalCalories = totalCalories * servingSize;
        int percentTotalCalories = totalCalories * 100 / dailyTotalCalories;
        boolean isTotalCalories = totalCalories < dailyTotalCalories;
        
        //fat
        System.out.print("Enter grams of Total Fat per Serving: ");
        int totalGramsFat = in.nextInt();
        totalGramsFat = totalGramsFat * servingSize;
        int percentTotalGramsFat = totalGramsFat * 100 / dailyValueGramsTotalFat;
        boolean isTotalGramsFat = totalGramsFat < dailyValueGramsTotalFat;
        
        //carbs
        System.out.print("Enter grams Carbohydrate per Serving: ");
        int totalCarbs = in.nextInt();
        totalCarbs = totalCarbs * servingSize;
        int percentTotalCarbs = totalCarbs * 100 / dailyValueTotalCarbs;
        boolean isTotalCarbs = totalCarbs < dailyValueTotalCarbs;
        
        //fiber
        System.out.print("Enter grams Fiber per Serving: ");
        int totalFiber = in.nextInt();
        totalFiber = totalFiber * servingSize;
        int percentTotalFiber = totalFiber * 100 / dailyValueFiber;
        boolean isTotalFiber = totalFiber < dailyValueFiber;
        
        //protein
        System.out.print("Enter grams Protein per Serving: ");
        int totalProtein = in.nextInt();
        totalProtein = totalProtein * servingSize;
        int percentTotalProtein = totalProtein * 100 / dailyValueProtein;
        boolean isTotalProtein = totalProtein < dailyValueProtein;
        
        //output        
        System.out.println("Food: " + foodItem);
        System.out.println("Serving Size: " + servingSize);
        
        System.out.println("Food: " + foodItem);
        System.out.println("Serving Size: " + servingSize);
        
        System.out.println();
        System.out.println("Component\tTotal\t\tPercent\t\tLess than Daily Value");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Calories\t" + totalCalories + "\t\t" + percentTotalCalories + "\t\t" + isTotalCalories);
        System.out.println("Grams of Fat\t" + totalGramsFat + "\t\t" + percentTotalGramsFat + "\t\t" + isTotalGramsFat);
        System.out.println("Carbs\t\t" + totalCarbs + "\t\t" + percentTotalCarbs + "\t\t" + isTotalCarbs);
        System.out.println("Fiber\t\t" + totalFiber + "\t\t" + percentTotalFiber + "\t\t" + isTotalFiber);
        System.out.println("Protein\t\t" + totalProtein + "\t\t" + percentTotalProtein + "\t\t" + isTotalProtein);
       
    }//end of main method    
}//end of class
public class CalculationsV1
{
    public static void main(String[ ] args)
    {
        // Addition
        System.out.println("Addition");
        System.out.println("4 plus 8 equals " + (4 + 8));
        System.out.println("23.51 plus 8.9325 equals " + (23.51 + 8.9325));
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println("9 minus 33 equals " + (9 - 33));
        System.out.println("98.6 minus 47.0038 equals " + (98.6 - 47.0038));
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println("15 times 3 times 201 equals " + (15 * 3 * 201)); 
        System.out.println("3.14 times 5.0 times 5.0 equals " + (3.14 * 5.0 * 5.0));
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println("48 divided by 8 equals " + (48 / 8));
        System.out.println("212.0 divided by 32.0 equals " + (212.0 / 32.0));
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println("23 modulus 15 equals " + (23 % 15));
        System.out.println("3298.7 modulus 243.1 equals " + (3298.7 % 243.1));
        System.out.println();
        
        System.out.println("15 divided by 2.5 times -2 plus 10 divided by 5 equals " + (15 / 2.5 * -2 + 10 / 5));
        System.out.println("234 minus 234 divided by 6 modulus 12 plus 3 equals " + (234 - 234 / 6 % 12 + 3));
        System.out.println("46.2 divided by 11 minus 3 plus 24 modulus (17 minus 2 times 3) equals " + (46.2 / 11 - 3 + 24 % (17 - 2 * 3)));
        System.out.println("480 divided by 10 divided by 12 plus 200 times .5 minus 20 modulus 8 equals " + (480 / 10 / 12 + 200 * .5 - 20 % 8));
        
        
        
               
    } // end of main method
} // end of class
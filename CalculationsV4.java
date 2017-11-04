public class CalculationsV4
{
    public static void main(String[ ] args)
    {
        // Addition
    	
    	int iNum1 = 4;
    	int iNum2 = 8;
    	
        System.out.println("Addition");
        System.out.print(iNum1 + " plus " + iNum2 + " = ");
        System.out.println(iNum1 + iNum2);
        
        System.out.println(23.51 + 8.9325);
        System.out.println();
        
        
        // Subtraction
        
        int iNum3 = 9;
        int iNum4 = 33;
        
        System.out.println("Subtraction");
        System.out.print(iNum3 + " minus " + iNum4 + " = ");
        System.out.println(iNum3 - iNum4);
        
        System.out.println(98.6 - 47.0038);
        System.out.println();
        
        
        // Multiplication
        
        int iNum5 = 15;
        int iNum6 = 3;
        int iNum7 = 201;
        
        System.out.println("Multiplication");
        System.out.print(iNum5 + " times " + iNum6 + " times " + iNum7 + " = ");
        System.out.println(iNum5 * iNum6 * iNum7);
        
        System.out.println(3.14 * 5.0 * 5.0);
        System.out.println();
        
        
        // Division
        
        int iNum8 = 48;
        int iNum9 = 8;
        
        System.out.println("Division");
        System.out.print(iNum8 + " divided by " + iNum9 + " = ");
        System.out.println(iNum8 / iNum9);
        
        System.out.println(212.0 / 32.0);
        System.out.println();
         
        
        // Modulus operator
        
        int iNum10 = 23;
        int iNum11 = 15;
        
        System.out.println("Modulus");
        System.out.print(iNum10 + " modulus " + iNum11 + " = ");
        System.out.println(iNum10 % iNum11);
        
        System.out.println(3298.7 % 243.1);
        System.out.println();
        
        
        // Lab Equations
        
        int iNum12 = 15;
        int iNum13 = -2;
        int iNum14 = 10;
        int iNum15 = 5;
        int iNum16 = 234;
        int iNum17 = 6;
        int iNum18 = 12;
        int iNum19 = 3;
        int iNum20 = 11;
        int iNum21 = 3;
        int iNum22 = 24;
        int iNum23 = 17;
        int iNum24 = 2;
        int iNum25 = 3;
        int iNum26 = 480;
        int iNum27 = 10;
        int iNum28 = 12;
        int iNum29 = 200;
        int iNum30 = 20;
        int iNum31 = 8;
        
        System.out.println("2.02 Lab Equations");
        System.out.print(iNum12 + " divided by 2.5 times " + iNum13 + " plus " + iNum14 + " divided by " + iNum15 + " = ");
        System.out.println(iNum12 / 2.5 * iNum13 + iNum14 / iNum15);
        
        System.out.print(iNum16 + " minus " + iNum16 + " divided by " + iNum17 + " modulus " + iNum18 + " plus " + iNum19 + " = ");
        System.out.println(iNum16 - iNum16 / iNum17 % iNum18 + iNum19);
        
        System.out.print("46.2 divided by " + iNum20 + " minus " + iNum21 + " plus " + iNum22 + " modulus (" + iNum23 + " minus " + iNum24 + " times " + iNum25 + ") = ");
        System.out.println(46.2 / iNum20 - iNum21 + iNum22 % (iNum23 - iNum24 * iNum25));
        
        System.out.print(iNum26 + " divided by " + iNum27 + " divided by " + iNum28 + " plus " + iNum29 + " times .5 minus " + iNum30 + " modulus " + iNum31 + " = ");
        System.out.println(iNum26 / iNum27 / iNum28 + iNum29 * .5 - iNum30 % iNum31);
        System.out.println();
        
        // Two Extra Expressions
        
        int iNum32 = 17;
        int iNum33 = 42;
        int iNum34 = 36;
        int iNum35 = 11;
        int iNum36 = 88;
        int iNum37 = 7;
        int iNum38 = 9;
        int iNum39 = 6;
        
        System.out.print("(" + iNum32 + " plus " + iNum33 + " minus " + iNum34 + ") times " + iNum35 + " = ");
        System.out.println((iNum32 + iNum33 - iNum34) * iNum35);
        
        System.out.print("(" + iNum36 + ") minus " + iNum37 + " divided by " +  iNum38 + " modulus " + iNum39 + " = ");
        System.out.println((iNum36 - iNum37) / iNum38 % iNum39);
        
        
               
    } // end of main method
} // end of class
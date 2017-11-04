/* 
 * Name: Pranshu Suri
 * Date: 12-30-15
 * Purpose of Program: To demonstrate basic knowledge and understanding of two primitive data types (integers and doubles), as well as how to declare and use variables throughout a program to make it more efficient
 */

public class CalculationsV5
{
    public static void main(String[ ] args)
    {
        // Addition
    	int iNum1 = 4;
    	int iNum2 = 8;
    	
    	double dNum1 = 23.51;
    	double dNum2 = 8.9325;
    	
        System.out.println("Addition");
        System.out.print(iNum1 + " plus " + iNum2 + " = ");
        System.out.println(iNum1 + iNum2);
        
        System.out.print(dNum1 + " plus " + dNum2 + " = ");
        System.out.println(dNum1 + dNum2);
        System.out.println();
        
        
        // Subtraction
        int iNum3 = 9;
        int iNum4 = 33;
        
        double dNum3 = 98.6;
        double dNum4 = 47.0038;
        
        System.out.println("Subtraction");
        System.out.print(iNum3 + " minus " + iNum4 + " = ");
        System.out.println(iNum3 - iNum4);
        
        System.out.print(dNum3 + " minus " + dNum4 + " = ");
        System.out.println(dNum3 - dNum4);
        System.out.println();
        
        
        // Multiplication
        int iNum5 = 15;
        int iNum6 = 3;
        int iNum7 = 201;
        
        double dNum5 = 3.14;
        double dNum6 = 5.0;
        
        System.out.println("Multiplication");
        System.out.print(iNum5 + " times " + iNum6 + " times " + iNum7 + " = ");
        System.out.println(iNum5 * iNum6 * iNum7);
        
        System.out.print(dNum5 + " times " + dNum6 + " times " + dNum6 + " = ");
        System.out.println(dNum5 * dNum6 * dNum6);
        System.out.println();
        
        
        // Division
        int iNum8 = 48;
        int iNum9 = 8;
        
        double dNum7 = 212.0;
        double dNum8 = 32.0;
        
        System.out.println("Division");
        System.out.print(iNum8 + " divided by " + iNum9 + " = ");
        System.out.println(iNum8 / iNum9);
        
        System.out.print(dNum7 + " divided by " + dNum8 + " = ");
        System.out.println(dNum7 / dNum8);
        System.out.println();
         
        
        // Modulus operator
        int iNum10 = 23;
        int iNum11 = 15;
        
        double dNum9 = 3298.7;
        double dNum10 = 243.1;
        
        System.out.println("Modulus");
        System.out.print(iNum10 + " modulus " + iNum11 + " = ");
        System.out.println(iNum10 % iNum11);
        
        System.out.print(dNum9 + " modulus " + dNum10 + " = ");
        System.out.println(dNum9 % dNum10);
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
        
        double dNum11 = 2.5;
        double dNum12 = 46.2;
        double dNum13 = 0.5;
        
        System.out.println("2.02 Lab Equations");
        System.out.print(iNum12 + " divided by " + dNum11 + " times " + iNum13 + " plus " + iNum14 + " divided by " + iNum15 + " = ");
        System.out.println(iNum12 / dNum11 * iNum13 + iNum14 / iNum15);
        
        System.out.print(iNum16 + " minus " + iNum16 + " divided by " + iNum17 + " modulus " + iNum18 + " plus " + iNum19 + " = ");
        System.out.println(iNum16 - iNum16 / iNum17 % iNum18 + iNum19);
        
        System.out.print(dNum12 + " divided by " + iNum20 + " minus " + iNum21 + " plus " + iNum22 + " modulus (" + iNum23 + " minus " + iNum24 + " times " + iNum25 + ") = ");
        System.out.println(dNum12 / iNum20 - iNum21 + iNum22 % (iNum23 - iNum24 * iNum25));
        
        System.out.print(iNum26 + " divided by " + iNum27 + " divided by " + iNum28 + " plus " + iNum29 + " times " + dNum13 + " minus " + iNum30 + " modulus " + iNum31 + " = ");
        System.out.println(iNum26 / iNum27 / iNum28 + iNum29 * dNum13 - iNum30 % iNum31);
        System.out.println();
        
        // Two Extra Integer Expressions
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
        
        System.out.print("(" + iNum36 + " minus " + iNum37 + ") divided by " +  iNum38 + " modulus " + iNum39 + " = ");
        System.out.println((iNum36 - iNum37) / iNum38 % iNum39);
        System.out.println();
        
        // Two Extra Double Expressions
        double dNum14 = 17.5;
        double dNum15 = 42.5;
        double dNum16 = 36.5;
        double dNum17 = 11.5;
        double dNum18 = 88.5;
        double dNum19 = 7.5;
        double dNum20 = 9.5;
        double dNum21 = 6.5;
        
        System.out.print("(" + dNum14 + " plus " + dNum15 + " minus " + dNum16 + ") times " + dNum17 + " = ");
        System.out.println((dNum14 + dNum15 - dNum16) * dNum17);
        
        System.out.print("(" + dNum18 + " minus " + dNum19 + ") divided by " +  dNum20 + " modulus " + dNum21 + " = ");
        System.out.println((dNum18 - dNum19) / dNum20 % dNum21);
        
        
          
    } // end of main method
} // end of class
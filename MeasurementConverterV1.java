/**
 * MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 * 
 *      Sample Calculation:
 *        1 mile = 5280 ft, therefore    6230 ft / 5280 = 1.7992 miles
 *                      
 * ©FLVS 2007
 * @author B. Jordan
 * @version 01/19/07
 * 
 * Modified by: Pranshu Suri
 * Date: 12-30-15
 * Purpose of Program: To write a program that converts to and from various units of measurement
 */

public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {    
        //local variable declarations - assign actual values below
        double miles;                   // distance in miles
        double feet;                    // distance in feet
        double kilometers;              // distance in kilometers
        double inches;                  // distance in inches
        double pounds;                  // weight in pounds
        double kilograms;               // weight in kilograms
        
        //convert feet to miles
        feet = 6230;
        miles = feet / 5280;
        System.out.println(feet + " ft. = " + miles + " mi.");
        
        
        //convert miles to feet
        miles = 3.5;
        feet = miles * 5280;
        System.out.println(miles + " mi. = " + feet + " ft.");
        
        //convert miles to kilometers
        miles = 3.5;
        kilometers = miles / 0.62137;
        System.out.println(miles + " mi. = " + kilometers + " km.");
        
        //convert kilometers to miles
        kilometers = 3.5;
        miles = kilometers * 0.62137;
        System.out.println(kilometers + " km. = " + miles + " mi.");
       
        //convert pounds to kilograms
        pounds = 3.5;
        kilograms = pounds / 2.20462262185;
        System.out.println(pounds + " lb. = " + kilograms + " kg.");
        
        //convert kilograms to pounds
        kilograms = 3.5;
        pounds = kilograms * 2.20462262185;
        System.out.println(kilograms + " kg. = " + pounds + " lb.");
        
        //convert feet to inches
        feet = 3.5;
        inches = feet * 12;
        System.out.println(feet + " ft. = " + inches + " in.");
        
        //convert inches to feet
        inches = 3.5;
        feet = inches / 12;
        System.out.println(inches + " in. = " + feet + " ft.");
        
        int x = (int)(3.14 * 10 * 10);
        System.out.println("\n\n" + x);
        
    }//end of main method
}//end of class

/**
 * The CurrencyConversion class converts an amount of money from a specific
 * country into the equivalent currency of another countyr given the current 
 * exchange rate.
 * 
 *
 * ©CSA/FLVS 2007
 * @author Maria Vieta Jacquard
 * @version 01/19/07
 * Modified By: Pranshu Suri
 * Date: 12-30-15
 * Purpose of Program: This program converts from dollars to various other currencies given the current exchange rate and subsequently prints the results.
 */
public class CurrencyConversionV1
{   
    public static void main(String [ ] args)
    {
        double remainingDollars = 2500.00;       // local variable for dollars remaining
        
        double totalPesos;                       // local variable for total pesos
        double dollarsSpentInMexico = 478.00;    // local variable for dollars spent in Mexico
        double pesosSpent;						 // local variable for pesos spent
        
        double totalYen;					     // local variable for total yen
        double dollarsSpentInJapan = 824.00;	 // local variable for dollars spent in Japan
        double yenSpent;						 // local variable for yen spent
        
        double totalEuros;					     // local variable for total Euros
        double dollarsSpentInFrance = 1100.00;	 // local variable for dollars spent in France
        double eurosSpent;						 // local variable for Euros spent
        
        // purpose of program
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println();
        
        System.out.println("Started with " + remainingDollars + " dollars\n");
        
        // convert US dollars to Mexican pesos
        totalPesos = remainingDollars / 0.0611;
        System.out.println(remainingDollars + " American dollars = " + totalPesos + " Mexican pesos");
        remainingDollars -= dollarsSpentInMexico;
        pesosSpent = dollarsSpentInMexico / 0.0611;
        System.out.println("dollars spent: " + dollarsSpentInMexico + "\tpesos spent: " + pesosSpent);
        System.out.println();
        
        // convert US dollars to Japanese yen
        totalYen = remainingDollars / 0.00876;
        System.out.println(remainingDollars + " American dollars = " + totalYen + " Japanese yen");
        remainingDollars -= dollarsSpentInJapan;
        yenSpent = dollarsSpentInJapan / 0.00876;
        System.out.println("dollars spent: " + dollarsSpentInJapan + "\tyen spent: " + yenSpent);
        System.out.println();
        
        // convert US dollars to Euros
        totalEuros = remainingDollars / 1.1545;
        System.out.println(remainingDollars + " American dollars = " + totalEuros + " Euros");
        remainingDollars -= dollarsSpentInFrance;
        eurosSpent = dollarsSpentInFrance / 1.1545;
        System.out.println("dollars spent: " + dollarsSpentInFrance + "\tEuros spent: " + eurosSpent);
        System.out.println();
        
        // print amount of dollars returned with
        System.out.println("Returned with " + remainingDollars + " American dollars");
        
            
    } // end of main method
} // end of class
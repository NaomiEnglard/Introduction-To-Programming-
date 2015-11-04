//Restaurant tax and tip calculator
//Naomi Englard

import java.util.Scanner; 
public class RestaurantBill2
{
   public static void main(String[] args)
   {
	// goal: create a program to calculate tips and tax, when you out in the amount on a bill you receive
	
	double Bill;
	Scanner keyboard = new Scanner(System.in);          // allows you to input a new bill value each time
	System.out.print("Please write the dollar value of your meal charge then press enter" );
	Bill = keyboard.nextDouble();
	System.out.println("Your meal charge is $" + Bill);
	
	double TaxRate= .0675, Tax, PWT	;  	 	// PWT = price with tax
	Tax = TaxRate * Bill;					//tax calculator
	PWT = Tax + Bill;		    	   		// Calculate Price with tax
	System.out.println("The tax is $" +Tax + " so the bill with tax is $" +PWT);
	
	double TipRate=.15 ,Tip, Pwtt;			// Pwtt = price with tip and tax
	Tip = TipRate * PWT;					// calculate tip
	Pwtt = Tip + PWT;						// calculare total bill with tax and tip
	System.out.println("Then you pay a tip of $" +Tip+ "\nThe total bill with tax and a tip is $" + Pwtt);
	
	System.exit (0);                         // end the program
	
	}
}



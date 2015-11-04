// Pennies for pay
// Naomi Englard

import java.util.Scanner;
public class PenniesPay
{
	public static void main (String[] args)
	{
	// get input of days worked
	Scanner keyboard = new Scanner(System.in);
	System.out.println("How many days did you work so far?");
	int Days = keyboard.nextInt();
	// if days is less than 1
	while ( Days<=0)
	{System.out.println("please eneter a number greater and 0 for the amount of days worked");
	System.out.println("How many days did you work?");
	Days = keyboard.nextInt();
	}
	
	//convert pennies to dollars
	
	}
}
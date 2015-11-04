// Pennies for pay
// Naomi Englard
//day 32 becomes negative? and print f once it goes past 2 digits

import java.util.Scanner;
public class PenniesPayNE
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
	//create loop to show how much the person makes each day if salary doubles each day
	double pennies =1, total =1  ;   //initialize pennies to 1 because that is the lowest possible amount you can get
	int x;
	for ( x = 1; x<=Days; x++)
		{
		if (x==1)
			{
			// for day one they get one penny, not double the day before pennies are 1
			String days = "Days", Profit ="Profit in pennies", Dollars ="Profit in Dollars";
			System.out.printf("%-12s%-24s \n", days, Profit);  //title of chart, this only outputs once not every time
			}
		else
			{
			pennies *= 2.00;   // the salary doubles what it was the day before. 
			total = pennies + total;
			}
		System.out.printf( " %d \t %,.0f  \n", x , pennies);
		}
	// convert to dollars
	double dollars = total/100;
	System.out.print("you made a total of ");
	System.out.printf("$%,.2f",dollars);
		
		
	}
}
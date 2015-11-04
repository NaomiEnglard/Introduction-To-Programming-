// Pennies for pay
// Naomi Englard
//day 32 becomes negative? and print f once it goes past 2 digits

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
	//create loop to show how much the person makes each day if salary doubles each day
	double pennies =1  ;   //initialize pennies to 1 because that is the lowest possible amount you can get
	double Dollar =.01;    // on day one the person makes 1 cent 
	int x;
	for ( x = 1; x<=Days; x++)
		{
		if (x==1)
			{
			// for day one they get one penny, not double the day before pennies are 1
			String days = "Days", Profit ="Profit in pennies", Dollars ="Profit in Dollars";
			System.out.printf("%-12s%-24s        %-12s \n", days, Profit, Dollars);  //title of chart, this only outputs once not every time
			}
		else
			{
			double newPennies = pennies * 2.00;   // the salary doubles what it was the day before. pennies is the value of the previous day
			double profit = pennies + newPennies;
			Dollar = profit/100.00;
			pennies = newPennies; //assign pennies the new value so that when it loops again the penny value has been updated to the value of the previes day
			}
		System.out.printf( " %-4d \t %-40.0f  $%,.2f \n", x , pennies,Dollar);
		}
	}
}
//Rain fall homework
//Naomi Englard

import java.util.Scanner;
public class rainNE
{
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Please enter the number of years you want to calculate rain fall for, then press enter");
	int rain = keyboard.nextInt();
	// make sure years is a not less than 1
	while (rain<1)
		{
		System.out.println("please try again and input a number of years that is greater than zero");
		System.out.print(" How many years do you want to calculate rainfall for?");
		rain = keyboard.nextInt();
		}
	int  years, month;
	double amountRain, totalInches = 0;
	for (years =1; years <= rain; years++)   // loop for each year once
		{
		for (month =1; month<=12; month++)   // loop 12 times for each year, once per mounth
			{ //ask user how many inches of rain they got each month
			System.out.printf("How many inches of rain did you get in year %d month %d \t",years, month);
			amountRain = keyboard.nextDouble();
			// input validation: amount of rain must be a positive number
			if (amountRain <= 0)
				{
				System.out.println ("Please try again and enter a positive number for the amount of rainfall, the negative number is not included in the average");
				month-- ;// this will negate the month++ on top, so that the negative number does not fill one month inches rainfall slot
				}
			else
				totalInches += amountRain;
			}
		}
	int totalMonths = rain * 12;	
	double averageInches;
	averageInches = totalInches/totalMonths;
	System.out.printf("\nFor %d months it rained a total of %f inches \nso on average it rained %f inches each month", totalMonths, totalInches,averageInches);
	}
}

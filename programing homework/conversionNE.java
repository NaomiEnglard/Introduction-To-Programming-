//Conversion Program
//Naomi Englard

import java.util.Scanner;
import java.util.Random;

public class conversionNE
{
	public static void main(String[] args)
	{//ask user to enter distance in meters
	Scanner keyboard = new Scanner(System.in);
	System.out.print("enter a distance in meters, then press enter \t");
	double meter = keyboard.nextDouble();
	System.out.println("you entered " + meter +" meter(s)");
	//input validation
	while (meter<0)
		{
		System.out.print("woops you entered a negative number, please enter a positive number");
		meter=keyboard.nextDouble();
		}
	menu();//ask the user what they want to convert meters to
	System.out.print("enter the number choice of the option you want:");
	int option = keyboard.nextInt();
	//validate input
	while (option>4 || option<1)
		{
		System.out.print("please enter a number between 1 and 4");
		option = keyboard.nextInt();
		}
	//based on the menu choice convert the distance from meters to the choice the user slected
	switch (option)
		{case 1:
			showKilometers(meter);
			break;
		case 2:
			showInches(meter);
			break;
		case 3:
			showFeet(meter);
			break;
		case 4:
			System.exit(0);
		}
	
	}
	//show menu options
	public static void menu()
	{
	System.out.println("pick an option from the following menu ");
	System.out.println("1. Convert to kilometers \n2. Convert to inches \n3.Convert to feet \n4.Quit the program");
	}
	//method to convert to kilometers
	public static void showKilometers(double meters)
	{
	double answer = meters * .001;
	System.out.printf("%f meters is equal to %f kilometers", meters, answer);
	}
	//method to convert to Inches
	public static void showInches(double meters)
	{
	double answer = meters * 39.37;
	System.out.printf("%f meters is equal to %f inches", meters, answer);
	}
	//method to convert to feet
	public static void showFeet(double meters)
	{
	double answer = meters * 3.281;
	System.out.printf("%f meters is equal to %f feet", meters, answer);
	}
}
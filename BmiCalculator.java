// Homework 5 BMI calculator
//Naomi Englard

import java.util.Scanner;
public class BmiCalculator
{
	public static void main(String[] args)
	{
	// get the person's weight
	double Weight;
	Scanner imput = new Scanner(System.in);
	System.out.print("Please write your weight,in pounds, and then press enter");
	Weight = imput.nextDouble();
	System.out.println ("you weigh " + Weight + " pounds");
	
	// get persons height
	double Height;
	Scanner keyboard = new Scanner(System.in);
	System.out.print("please write your height,in inches, then press enter");
	Height = keyboard.nextDouble();
	System.out.println ("you are " + Height+ " inches tall");
	
	// use input to calculate BMI using formula BMI = weight * 703/height^2
	
	double BMI;
	BMI = (Weight * 703)/ (Height * Height);
	System.out.println ("Your BMI is " + BMI);
	
	// Output based on bmi if person is underweight, overweight, or optimal weight
	
	if (BMI < 18.5)                                         // a bmi less than 18.5 in underweight
		System.out.println ("you are underweight");
	else if (BMI <= 25)                                     // a bmi greater than 18.5 but less than 25 is optimal 
		System.out.println ("you are at an optimal weight");    
	else                                                   // bmi greater than 25 is overwieght
		System.out.println ("you are overweight");              
		
		//problem when you 25. something bmi it says your overweight even if you would round it to 25
	
	System.exit(0);	
	}
}

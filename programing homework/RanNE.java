//Random number
//Naomi Englard

import java.util.*;
public class RanNE
{
	public static void main(String[] args)
	{//allow user to try to guess a random number from 1-100
	int realNum, guess,counter=0;
	Random num= new Random();
	realNum= num.nextInt(100)+1;
	do
	{counter++; //keeps track of how many they guess the number
	enterNum();
	Scanner keyboard= new Scanner(System.in);
	guess = keyboard.nextInt();
		if (guess<1 || guess>100)
			System.out.println("the answer is between 1 and 100, please enter a number in this range");
		else if (realNum > guess)
			System.out.println("your guess is to low, try again");
		else if (realNum<guess)
			System.out.println("your guess is to high, try again");
	}while ( !(guess== realNum));
	System.out.println("yay! you got the right number");
	System.out.printf("it took you %d tries",counter);
	}
	// this method will tell the user to enter a number
	public static void enterNum()  // i wanted to use a method that was more useful like generating a random number, but we did not learn how to pass back the answer
	{
	System.out.print("Guess a number from 1 to 100 \t");
	}
	
}

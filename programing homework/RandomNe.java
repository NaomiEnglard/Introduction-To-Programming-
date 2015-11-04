//Random number
//Naomi Englard

import java.util.*;
public class RandomNE
{
	public static void main(String[] args)
	{//allow user to try to guess a random number from 1-100
	int realNum, guess;
	do
	{enterNum();
	Scanner keyboard= new Scanner(System.in);
	guess = keyboard.nextInt();
	Random num= new Random();
	realNum= num.nextInt(100)+1;
		if (realNum > guess)
			System.out.println("your guess is to low, try again");
		else if (realNum<guess)
			System.out.println("your guess is to high, try again");
	}while ( !(guess== realNum));
	System.out.println("yay! you got the right number");
	}
	// this method will tell the user to enter a number
	public static void enterNum()  // i wanted to use a method that was more useful like generating a random number, but we did not learn how to pass back the answer
	{
	System.out.println("Guess a number from 1 to 100");
	}
	
}

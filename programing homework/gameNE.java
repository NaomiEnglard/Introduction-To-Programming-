//21 game
//Naomi Englard

import java.util.*;
public class gameNE
{
	public static void main(String[] args)
	{//instructions how to play
	System.out.println("you just started a game of 21 \nThe object of the game is to get as close to 21 without going over.");
	System.out.println("each turn you will have a choice to pick a card, freeze, or exit the game");
	System.out.println("Its time to start, the computer picks first");
	// get number for the card
	int number = cardNum();       // number is needed to add to find a persons total
	if (number ==1 || number>=11)
		{String name = cardWithName(number);
		System.out.print(name);
		}
	else
		System.out.print(number);
	//get a suite for the card
	String suite = createSuite();
	System.out.println("of " + suite);
	
	}
	// this will generate a number for a card
	public static int cardNum()
	{
	Random num = new Random();
	int card = num.nextInt(13)+1;
	return card;           
	}
	//the card that have names will be assigned a name
	public static String cardWithName ( int x)
	{ 
	String cardname = "s";  //when it generates a 1 or anything over 10 the card has a name not a number
		if (x == 1)                
		cardname = "Ace";
		else if (x == 11)
		cardname= "Jack";
		else if (x == 12)
		cardname = "Queen";
		else if (x == 13)
		cardname ="King";	
	return cardname;
	}
	//generate a random suite
	public static String createSuite()
	{
	Random number = new Random();
	int choice = number.nextInt(4)+1;
	String chds ="s";  //creat a string that will be assigned an Club, Hearts, Diamon, or Spade
	switch (choice)
		{
		case 1:
			chds = "Clubs";
			break;
		case 2:
			chds = "Hearts";
			break;
		case 3:
			chds = "Diamonds";
			break;
		case 4:
			chds = "Spades";
			break;
		}
	return chds;
	}
	
	}

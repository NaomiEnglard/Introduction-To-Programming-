//21 game
//Naomi Englard

import java.util.*;
public class game
{ 
	public static void main(String[] args)
	{instructions(); //introduction and instructions how to play
	String playAgain = "no"; // this char will make sure they game does not start again after the user finishes the game, unless the user changes it to yes.
	do
	{
	int menuChoice, score=0, scoreComp =0; //score is a counter to calculate the amount of points u have and scoreComp is your computers score
	int whoseTurn=1; //this counter goes up after computer goes and after user goes, so when the counter is odd it was the computers turn
		do 
		{ //the computer goes first (and then it goes again each time after user goes), scoreComp will keep track of computers score up till now
		scoreComp = computerTurn(scoreComp, whoseTurn); //System.out.println(scoreComp);
		whoseTurn ++; //after computer's turn the counter becomes even so the program will know its the users turn
		menuChoice = menuOption(); // show user choices of what they can do each turn and return their choice
			if(menuChoice ==1)
				{int value = getCard(whoseTurn); // get random card and return the card number to value to keep track of points
				score += value;  //a counter to keep track of your score
				System.out.println("Your current Score is " + score);
				}
			else if (menuChoice ==2)
				System.out.println("you don't get a card this turn, your current score is " + score);
			else if (menuChoice ==3)
				{System.out.println("you submitted your score, you are about to find out if you won or lost");
				whoWon(score,scoreComp);  //this will see whose score is higher and say who is the winner
				playAgain = playMore(); //ask user if they want to play again
				}
			else if (menuChoice == 4)
				{System.out.println("the game is exiting");
				System.exit(0);
				}
			whoseTurn++;	//counter becomes odd again so program "knows" its computer's turn
		}while(menuChoice ==1 || menuChoice ==2 );
	}while (playAgain.equals("yes")); 
	}
	public static void instructions ()
	 {
	System.out.println("you just started a game of 21 \nThe object of the game is to get as close to 21 without going over.");
	System.out.println("each turn you will have a choice to pick a card, freeze, submit your score, or exit the game");
	System.out.println("Its time to start, the computer will go first \n");
	 }
	/**methods needed to get a card
	@param turnCounter keeps track of whose turn it is
	@return the value of the card that was genrated
	*/
	public static int getCard(int turnCounter)
	{// generate a card number and keep the value for later calculations
	Random num = new Random();
	int cardNumber = num.nextInt(13)+1;  //generate a number between 1-13
	String cardName = " ";//cardName starts as a space so when the card has a name it is given the name and when there is not the a space is shown and the number is outputted
	//test if the card should be called a name and assign it proper name
		if (cardNumber ==1 || cardNumber>=11)
		{ //when it generates a 1 or anything over 10 the card has a name not a number
			if (cardNumber == 1)                
				cardName = "Ace";
			else if (cardNumber == 11)
				cardName= "Jack";
			else if (cardNumber == 12)
				cardName = "Queen";
			else if (cardNumber == 13)
				cardName ="King";
		}	
	//assign the card a random suite
	Random number = new Random();
	int choice = number.nextInt(4)+1; //generate number from 1-4
	String suite ="s";  //creat a string that will be assigned an Club, Hearts, Diamon, or Spade, s is used to initialize
	switch (choice)
		{
		case 1:
			suite = "Clubs";
			break;
		case 2:
			suite = "Hearts";
			break;
		case 3:
			suite = "Diamonds";
			break;
		case 4:
			suite = "Spades";
			break;
		}
	if (cardNumber >=11)
		cardNumber =10; //any of the face cards have a point value of 10
	if ((turnCounter%2) == 0) //when there is no remainder turnCounter is even so it is the users turn, then it should output what card was picked
		{System.out.print("you picked: \t");
		System.out.print(cardName); //if the card does not have a name it will just output an extra space
		if (cardName.equals(" ")) //when a card name is not assigned show the card number instead
			System.out.print(cardNumber); 
		System.out.print(" of " + suite + "\t");
		}
	else; //when turnCounter is odd it is the computers turn so it should not output the card that was picked
	return cardNumber;       // this will be used to keep track of total points   
	}
	/**menu options, user picks one
	@return the menu choice the user choose
	*/
	public static int menuOption()
	{Scanner keyboard = new Scanner(System.in);
	System.out.println("Pick a choice and enter the corresponding number");
	System.out.println("1.Pick a card \n2.Freeze \n3.Submit score and see who wins  \n4.Exit game");
	int menu = keyboard.nextInt();
	System.out.println("you entered " + menu);
	// check to make sure they enter a valid number
	while(menu<1 || menu >4)
	{System.out.println("please re-enter a number that is between 1-4");
	menu = keyboard.nextInt();
	}
	return menu;
	}
	/**computer turn
	@param the computers score at present
	@param the counter number to "know" whose turn it is
	@return updated computer score
	*/
	public static int computerTurn(int compValue, int counter)
	{
	if (compValue<15)  //when computer has less than 15 points it will pick
		{int value = getCard(counter);
		compValue += value; //keeps updating computers score
		System.out.println("the computer picked a card, now its your turn");
		}
	else
		System.out.println("the computer choose to freeze this turn, now its your turn");
	 return compValue;   //the computer does not pick and the compValue stays the same
	}
	/**see who won
	@param users total score
	@param computer's total score
	*/
	public static void whoWon(int user, int computer)
	{
	if (user >21 )  //first make sure user does not have to many points
		System.out.println("you lost, you got over 21 points");
	else if (computer>21) //then make sure computer did not get over 21 points
		System.out.println("you win the computer got over 21 points");
	else //if both of you are ok then see who has more points
		{if (user > computer)
			System.out.println("you WIN");
		else if (user == computer)
			System.out.println("its a tie");
		else
			System.out.println("the computer wins, sorry that means you lost");
		}
	System.out.printf("you had %d points and the computer had %d points \n",user,computer);
	}
	/**ask user if they want to play again
	@return user's response if he/she wants to play again
	*/
	public static String playMore()
	{Scanner keyboard = new Scanner(System.in);
	System.out.print("do you want to play again? \nif you do write yes if not write no:");
	String answer = keyboard.nextLine();
	answer = answer.toLowerCase();
	if (answer.equals("yes"))
		System.out.println("\nyou are starting a new game \n");
	return answer;		
	}
}
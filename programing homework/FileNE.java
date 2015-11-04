//Naomi Englard
//HW 10

import java.util.Scanner;
import java.io.*;

public class FileNE
{
	public static void main(String[] args) throws IOException
	{
	//read numbers from file
	File myfile = new File("listnum.txt");
	Scanner input= new Scanner(myfile);
	String line =input.nextLine();
	int num =Integer.parseInt(line);         //convert the string line into a int version
	int compareLess = num;       // this will make the comparison number equal to the first number on the list. to test if a new number is less than the number before
	int compareGr8 = num; 		 //this will alow you to test if a new number is greater than the number before
	int counter = 1;             //the counter will go up each time loup iterates, since it reads one number before the loop the counter starts at 1
	int total = num; 			 // total keeps a running total in the loop, it starts as the first value which is done before the loop
		//System.out.println(line);
	while (input.hasNext())
	{line = input.nextLine();
	num = Integer.parseInt(line);
		//System.out.println(num);
	// find the highest and lowest number by comparing each to number before
		if (num<compareLess)      //this test if the number in the line read is less than the previes number. if it is assign it to the new lowest value
			compareLess = num;
		else if (num>compareGr8)  // test in new number is greater than previes. if it is assign it to the new greatest value
			compareGr8 = num;
	// find avreage, by keeping a running total and having a counter to know how many times it iterates
	counter ++; 				//everytime a new number is read in the counter will go up one so i know how many numbers were read in
	total += num ;              // keeps total
	}
	input.close();
	double avreage =  (double)total/counter;  //make total into a double so the answer is not truncated	
	// outout to screen
	System.out.println("the largest number is " + compareGr8+ " and the smallest number is " + compareLess);
	System.out.println("the average is " + avreage);
	//write the result to output.txt
	PrintWriter output = new PrintWriter("output.txt");
	output.println("The greatest number is " +compareGr8+ " and the lowest number is "+compareLess);
	output.println("The average is " + avreage);
	output.close();
	System.out.println("the lowest, highest, and avreage numbers have been written to file output.txt");
	
	}
}
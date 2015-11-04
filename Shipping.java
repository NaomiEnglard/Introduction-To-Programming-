//Shipping charges
//Naomi Englard

import java.util.Scanner;
public class Shipping
{
	public static void main(String[] args)
	{
	// ask person weight of package and shipping distance
	double Weight, Distance;
	
	Scanner keyboard= new Scanner(System.in);
	System.out.print("Please write in pounds the weight of your package, then press enter");
	Weight= keyboard.nextDouble();
	
	System.out.print("please write the distance your package is going in miles, then press enter");
	Distance = keyboard.nextDouble();
	
	System.out.println("Your package weighs " + Weight+ " pounds. It is being shipped "+ Distance+ " miles");
	
	// shipping cost are for every 500 miles. so calculate how many times the package went 500 miles.
	
	double RateDistance, Remainder;
	RateDistance = (Distance/500) ;     //Calculate how many times package goes 500 miles
	Remainder = Distance%500;  
		//System.out.println( RateDistance ); System.out.println(Remainder);
		
	/* Since shipping is not prorated when there is a decimal you need to up the shipping cost to the next 
	shipping price. therefore get rid of the decimal and add one to RateDistance. HOwever if there is no 		remainder than your shipping cost will be the RateDistance times price of shipping.
	*/
	int Shipping;
		if (Remainder>0)
			{Shipping = ((int)RateDistance) + 1;
				//System.out.println("your shipping this shipping rate" + Shipping);
			}
		else
			{//you dont need to convert it to an int because it has no remainder. however it is easier to have
			//the shipping as one variable, not shipping or RateDistnace
			Shipping = (int)RateDistance ;  
				//System.out.println ("your shipping cost is"+ RateDistance);
			}
	// Shipping also changes based on weight, so find out which category of weight the package falls. 
	//then multiply the Shippping variable by the cost to ship a package of that weight.
		
	double TotalCost;
	
	if (Weight<=2)
		TotalCost = Shipping * 1.10 ;  //1.10 = cost to ship package under 2lbs 500 miles
	else if  (Weight <= 6)
		TotalCost = Shipping * 2.20;   //2.20 = cost to ship package over 2lbs but 6lbs or under, 500 miles
	else if (Weight<= 10)
		TotalCost = Shipping * 3.70;  //3.70 = cost to ship package over 6lbs but 10lbsor uneder, 500 miles
	else
		TotalCost = Shipping * 3.80;  //3.80 = cost to ship package over 10lbs, 500 miles
	
	System.out.println("your total cost is $ "+ TotalCost);
		
	//problem when multiply int by double it turns int into double and assings it a very small decimal
	System.exit(0);
	}
}
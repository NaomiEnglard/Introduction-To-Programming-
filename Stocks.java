//Aviva's stocks
//Naomi Englard homework

public class Stocks
{
   public static void main(String[] args)
   {
   /* goal: calculate how much money Aviva made/lost when she bought and sold 1200 stocks, 
			   include price she paid for stocks and amount she sold them for,
			   include commission loss in total outcome*/
			   
      int stocksPurchased;
      double dollarPerShare, commission;
	  
		stocksPurchased = 1200 ;
		dollarPerShare  = 31.64;
		
		// Aviva paid 1st commission at a rate of 2% of amount she paid for stocks
		commission      = .2*(stocksPurchased * dollarPerShare); 
			/*System.out.println(stocksPurchased) ;
			System.out.println(dollarPerShare);
			System.out.println(commission) ;*/
	  
	// How much did Aviva pay for her stocks? not including commission
	
		double cost; //amount aviva paid for her stocks
		cost = stocksPurchased * dollarPerShare ;
		System.out.println("Aviva paid $" +cost + " for 1200 shares of stock");  
			//System.out.println(cost);
	
	// Once Aviva paid commission on these stocks, how much did it cost her?
	
		double totalPrice;  //Total amount Aviva paid for stocks with commission
		totalPrice = cost+commission;
			//System.out.println (totalPrice);
		System.out.println("She also paid $" +commission + " in commission when she bought these stocks");
		System.out.println("All together she spent $" + totalPrice + " when she bought 1200 stocks");
		
	// How much did Aviva sell her stocks for? when she sold the stocks at a rate of $32.69 per stock
	
		double salePerStock = 32.69;
		double profit; // the amount of money Aviva got for selling the stocks, without commission deducted (opposite of cost)
		profit = salePerStock * stocksPurchased;  //stocksPurchased was defined in the beginning as the amount of stocks aviava bought which is 1200
		System.out.println("Aviva sold all her stocks and made back $" +profit+ " before she paid commision");
	
	// How much did Aviva pay in commission when she sold back her stocks? If she paid the broker the same rate (2%)
		
		commission = .2 * profit; 		//she paid broker 2% on the amount she got back for the stocks
		System.out.println ("Aviva had to pay commission again, this time on her sale profit, the total commission the second time is $" +commission);
		
	// Deducting the commission how much money was Aviva left with( this number is represented by totalSale)? 
		
		double totalSale;  
		totalSale =profit - commission; 
		System.out.println ("After she paid the broker Aviva was left with $" + totalSale);
		
	//Did Aviva make or lose money, without commission?
	
		double incomeNoCommission;
		incomeNoCommission = profit - cost;
		System.out.println("Aviva paid $37968 for 1200 stocks and she sold them for $39228, so she made $" + incomeNoCommission);
		
	//However, Aviva paid commision, so did she still make money or did that make her lose money?

		double totalOutcome ;
		totalOutcome = totalSale - totalPrice;   		// this equation shows how much she got back once she paid commission minus 
														//how much she paid for the stocks with a commission fee, so it calculates her total outcome with commission
		System.out.println ("Aviva paid commission twice, once she paid these fees she was left with $" + totalOutcome + 
							" since this is a negative number it shows that Aviva lost money");
	
	
	}
}
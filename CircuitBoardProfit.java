//Using Dialog Box
//Naomi Englard

import javax.swing.JOptionPane;

public class CircuitBoardProfit
{
	public static void main(String[] args)

	{ //Goal: use dialog boxes to calculate profit of circuit board sale
	
	String inputPrice;
	
	// ask user for retail price of a circuit board
	
	inputPrice = JOptionPane.showInputDialog("What is the dollar value " +              
											  "for the retail price of a circuit board"); 
	//Convert the string answer to a double to use for a arithmetic operation
	
	double retailPrice;
	retailPrice = Double.parseDouble(inputPrice);
	
	//using the formula profit = retail price * .4 calculate profit
	
	double profit, percentProfit = .4;
	profit = retailPrice * percentProfit;
	
	//show the profit in a dialog box
	
	JOptionPane.showMessageDialog (null, "The profit earned from this product is $" + profit);
	
	System.exit (0);   //end the program
	}
}


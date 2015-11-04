//Naomi Englard

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Test2NE
{
	public static void main(String[] args)
	{
	int x=1,numb, total= 0;
	
	Scanner keyboard = new Scanner(System.in);
	System.out.println("enter a number");
	numb= keyboard.nextInt();
	while ( x<=numb)
		{
		total += x;
		x++;
		}
System.out.println(total);		
	}
}
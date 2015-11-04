//naomi

import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
public class Naomi
{
	public static void main(String[] args)
	{
	// ask for seconds
	int seconds;
	String input;
	input = JOptionPane.showInputDialog("enter a number of seconds");
	seconds= Integer.parseInt(input);
	
	if (seconds < 60)
		System.out.println (seconds);
	else if (seconds >= 60 && seconds <3600)
		{ double minutes;
		minutes = seconds/60.00;
		System.out.println("minutes =" + minutes );
		System.out.println(seconds);
		int whole = (int)minutes;
		System.out.println("that is equal to " + whole+" minutes");
		double leftseconds = (minutes - whole);
		double leftsecondss= leftseconds*60.00;
		System.out.println ("and " +leftsecondss+" seconds");
		
	System.exit(0);
		
		}
	}
}

import java.util.Scanner;

public class Hw3
{

	public static void main (String[] args)
	{
	
		             
		 String Day_of_a_week [];
		
		Day_of_a_week = new  String [7];
		
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i <Day_of_a_week.length; i++)
		{
			System.out.println ("Please enter day "+ i + " of the week : ");
			
			Day_of_a_week[i]=sc.next ();
		
		}
		
            for (int i = 0; i < Day_of_a_week.length; i++) {
            	System.out.println (Day_of_a_week[i]);
            }
	

		
	}		
}
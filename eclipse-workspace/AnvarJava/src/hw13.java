import java.util.Scanner;

public class hw13
{

	public static void main (String[] args)
	{
		
		Scanner inp = new Scanner(System.in);
	    
		System.out.print("In:");
	   
		String word = inp.nextLine();
		
		
		for (int i = 0; i < word.length (); i++)
		{
			char a = word.charAt (i);
			
			System.out.println (a);
		} 
	
	
	
	
	}

}

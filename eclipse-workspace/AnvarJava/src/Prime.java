
public class Prime
{

	public static void main (String[] args)
	{
		// TODO Auto-generated method stub

		
		int num1 = 15; 
		boolean cond = false ;
		
		
		for (int i = 2; i<= num1-1 ; i++)
		{
			if(num1 % i ==0) {
				cond = true; 
				System.out.println (" number is not prime ");
				break;
			}
		}
		
	if(cond==false) {
		System.out.println (" this is prime number " );
	
	}
	}
}


public class hw7
{

	public static void main (String[] args)
	{
		
		
		int[][] number = {
                {5,2,3,7},
                {1,5,1,1},
                {8,3,1,2}
       };
		
       
      int highestV = number [0][0];
              
       for (int i = 0; i < number.length; i++)
	{
		for (int j = 0; j < number.length; j++)
		{
			if( number[i][j] > highestV) {
				
		highestV = number[i][j];
			}
		}
		}
	
        
        
        
		System.out.println ("highest value is: " + highestV);
		
	}
}

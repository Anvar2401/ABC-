
public class hw6
{

	public static void main (String[] args)
	{
		// TODO Auto-generated method stub

		
		int[][] nums = {
                {5,2,3,7},
                {1,5,2,2},
                {1,2,3,4}
       };
		
		int sum = 0;
		
		for (int i = 0; i <3; ++i)
		{  sum = 0;
			for (int j = 0; j < 4; ++j)
			{  sum = sum +  nums[i][j];
				
		          	
			}		
            }
		System.out.println (sum);
	
	}
}
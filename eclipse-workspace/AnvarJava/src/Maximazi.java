
public class Maximazi
{

	public static void main (String[] args)
	{
		// TODO Auto-generated method stub

		
	   //  String str = "SprintQA";
	     
	   //StringBuffer str1 = new StringBuffer(str);
	   
	     //System.out.println ( str1.reverse ());
	
		 int  number[]= { 10,30,40,50,60,10};
		 int mx = 0;
		 
		 mx= number[0];
		
		 for (int i= 0; i < number.length; i++){
			 if(number[i] > mx) {
				
				mx= number[i];
			 }
	
			
		}
		
		System.out.println (mx);
	}

}

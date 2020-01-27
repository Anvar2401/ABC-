
public class hw11
{

	public static void main (String[] args)
	{
		
		
		String str = "hello how are you" ;
		System.out.println (str.endsWith ("u"));  // --- String ends with  char " U" ...  true
		
		System.out.println (str.endsWith ("world")); // --- false 
		
		System.out.println (str.endsWith ("are"));  // ---  false 
		
		System.out.println (str.endsWith ("you"));  // ---   true 
		
		
	}

}

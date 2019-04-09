public class ExceptionHandling {




	public static void main(String[] args) {		
		//todo:
		//1.) Execute the following program. It will throw Exceptions.
		//Catch the Exceptions using their proper Names till no further
		//exceptions occur.
		//
		//2.) Taking the square root of a negative number won't cause
		//the exception. Write your own Exception for this case and 


		//write a method which throws this exception			          
		        int a = 5; 
		        int b = 0; 		          
		        try
		        { 
		            int i = a/b; 		          
		        }  
		        catch(ArithmeticException e) 
		        { 
		        	e.printStackTrace();; 
		        } 

		int[] arr = new int[5];
		try
		{
		arr[5] = 7;

		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}		

		String one = "one";
		try
		{
		int i = Integer.parseInt(one);
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}		

		double c = -7.0;
		double d = Math.sqrt(c);
		System.out.println(d);
		try{
			posSquare(-5);
		}
		catch(NaNException e)
		{	
			e.printStackTrace();	
		}				
	}

	
	public static int posSquare(double z) throws NaNException{
		
	    if (z<0){
	        throw new NaNException("Not Defined");
	    }
	    else{
	    	return (int) Math.sqrt(z);
	    }
	}

}
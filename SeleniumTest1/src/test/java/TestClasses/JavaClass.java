package TestClasses;

public class JavaClass {
	
	public static void main(String[] args){
	   
	   int a = 10;
	   int b = 5;
	   int c = 78;
	   int d[] = {23,43,65,98};
	   
	   try
	   {
		   c = a/b;
		   System.out.println(d[7]);
	   }
	   
	    catch (ArithmeticException e) {
	       	System.out.println("can't divide by zero");
	    	b = 1;
	    	c = a/b;
	    	
//	    try {
//	    	System.out.println(d[7]);
//	        }
//	    
//	   catch(ArrayIndexOutOfBoundsException t) {
//	  		 System.out.println("index range is over");
//	  		 System.out.println("length odd is " +d.length);
//	    	 }
	    }
	   finally
	   {
		   System.out.println("finally block");
	   
	   
	   }
	   
	    System.out.println(c);
	    System.out.println("Exception done");
	    

	}

}



//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  = githubpw
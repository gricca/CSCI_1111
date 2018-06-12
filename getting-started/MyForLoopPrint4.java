public class MyForLoopPrint4 {

   public static void main (String[] argv)
   {
	System.out.println (1); 

	for (int j=2; j<=5; j++) {
	   for (int i=0; i<j; i++) {
	       System.out.print (j);
	   }
	   System.out.println (); 
	}
    }
}

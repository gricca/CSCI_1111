public class MyForExercise { 

  public static void main (String[] argv)
  {
	for (int i=1; i<=10; i+=2) {
	    methodOne (); 
	}
   } 

  public static void methodOne ()
  { 
	for (int j=0; j<5; j++) {
	    methodTwo (); 
	}
	methodThree (); 
   }

   public static void methodTwo ()
   {
	System.out.print ("*"); 
   }

   public static void methodThree ()
   {
	System.out.println ("*"); 
   }

}

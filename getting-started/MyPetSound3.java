public class MyPetSound3 { 

  public static void main (String[] argv)  
  {
	printBigC ();
        for (int i=0; i<6; i++) {
	    printBigA ();
	}
        printBigW ();
      
   }

   public static void printBigC ()
   {
        System.out.println ("*****");
        System.out.println ("*    ");
        System.out.println ("*    ");
        System.out.println ("*    ");
        System.out.println ("*****");
	System.out.println ("\n"); 
   } 

 public static void printBigA ()
   {
        System.out.println ("*****");
        System.out.println ("*   *");
        System.out.println ("*****");
        System.out.println ("*   *");
        System.out.println ("*   *");
        System.out.println ("\n");
   }

public static void printBigW ()
   {
        System.out.println ("*   *");
        System.out.println ("*   *");
        System.out.println ("* * *");
        System.out.println ("** **");
        System.out.println ("*   *");
        System.out.println ("\n");
   }
} 

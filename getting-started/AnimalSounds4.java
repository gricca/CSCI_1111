public class AnimalSounds4 { 

  public static void main (String[] argv)
  {
	printBigM (); 
	printBigO (); 
   } 

   public static void printBigM () 
   { 
	System.out.println ("*   *");
        System.out.println ("** **");
        System.out.println ("* * *");
        System.out.println ("*   *");
        System.out.println ("*   *");
	System.out.println ("*   *\n");
   }

   public static void printBigO ()
   {
        System.out.println ("*****");
        System.out.println ("*   *");
        System.out.println ("*   *");
        System.out.println ("*   *");
        System.out.println ("*****\n");

	printBigO (); 
   }

}

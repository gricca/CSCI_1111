public class MethodTracing {

  public static void main (String[] argv)

  {

        printA ();
        printB ();
        printC ();
        printD ();
        System.out.println ("OK, that's enough");

   }

   public static void printA ()
   {
        printB ();
        System.out.println ("A");
        printC ();

   }

   public static void printB ()
   {
        printC ();
        System.out.println ("B");
        printD ();
   }

   public static void printC ()
   {
        printD ();
	System.out.println ("C");
        printD ();
   }

   public static void printD ()
   {
        System.out.println ("D");
   }


}





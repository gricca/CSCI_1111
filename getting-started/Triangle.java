public class Triangle {

   public static void main (String[] argv)
   {
       int size = IOTool.readIntFromTerminal ("How big would you like your triangle? Enter the size: ");

       for (int i=1; i<=size; i++) {
           for (int j=1; j<=i; j++) {
               System.out.print ("*");
           }
           System.out.println ();
       }
   }

}

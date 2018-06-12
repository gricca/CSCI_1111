public class ScopeExample { 

   static double x = 0.5; 
 
   public static void main (String[] argv)
   { 
       System.out.println (x); 
       squareIt (); 
       System.out.println (x); 
   }

   static void squareIt ()
   { 
       x = x * x;
   }
}

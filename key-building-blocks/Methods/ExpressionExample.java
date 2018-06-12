public class ExpressionExample { 

   public static void main (String[] argv) 
   {
       double a = 2 * power(2,3) + power(2,4); 
       System.out.println (a);

       double b = power (power(2,3), 2) / power(2,6); 
       System.out.println (b); 
   }

   static double power (double x, int k)
   {
       System.out.println ("power of " + x + " to " + k); 
       
       double p = 1;
       for (int i=1; i<=k; i++) { 
           p = p * x; 
       }
 
       return p; 
   }

}

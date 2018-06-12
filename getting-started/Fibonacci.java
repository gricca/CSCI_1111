public class Fibonacci { 

   public static void main (String[] argv)
   {
       double N = 10.0;
       double p = 1.0;
       double q = 0.0; 
       System.out.println (q);
       System.out.println (p);
       for (double i=3.0; i<=N; i++) {
           double f = p + q;
           double y = f / p;
           System.out.println (y);
           q = p; 
           p = f;
           f = y;  
       }
    }

}

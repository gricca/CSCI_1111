public class r6exercise { 

   public static void main (String[] argv) 
   { 
       int p = 3; 
       int q = incr( incr( incr(p) ) ); 
       System.out.println (q); 
   } 

   static int incr (int n) 
   {
      System.out.println (); 
      n++; 
      return n;
   } 
}

public class MyRandomCount4 { 

   public static void main (String[] argv) 
   { 
       int trial = 0; 
       double x = Math.random(); 
       System.out.println (x);
       while (x > 0.01) { 
             trial ++; 
             x = Math.random();
       } 
       System.out.println (trial); 
   }
}

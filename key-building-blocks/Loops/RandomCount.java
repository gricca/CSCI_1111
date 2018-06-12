public class RandomCount { 

   public static void main (String[] argv) 
   { 
       int trial = -1; 
       for (int i=0; i<10; i++) { 
           double x = Math.random();
           System.out.println (x);  
           if (x < 0.01) { 
              trial = i; 
           } 
       } 
       System.out.println (trial); 
   } 
}

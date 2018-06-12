public class MyRandomCount2 { 

   public static void main (String[] argv) 
   { 
      int trial = -1; 
      boolean done = false; 
      for (int i=0; i<10; i++) { 
          System.out.println (i);
          System.out.println (done);
          if (! done) { 
             double x = Math.random();
             System.out.println (x); 
             if (x < 0.25) { 
                trial = i; 
                done = true; 
             } 
          } 
       } 
       System.out.println (trial); 
   }
}

public class MyRandomWalk3 { 

   public static void main (String[] argv) 
   { 
       double x=5, y=5; 
       int numSteps = 0; 

       while ((x > 0) && (x < 10) && (y > 0)) { 
             double r = Math.random (); 
             if ((r > 0.0) && (r < 0.25)) { 
                y ++;
             } 
             if ((r > 0.25) && (y < 0.5)) { 
                y --; 
             } 
             if ((r > 0.5) && (y < 0.75)) { 
                x ++; 
             } 
             else { 
                  x --; 
             }
 
          numSteps ++;
      }
      System.out.println (numSteps);
      System.out.println (x); 
      System.out.println (y);  
   }
}

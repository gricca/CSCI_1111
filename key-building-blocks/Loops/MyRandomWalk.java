public class MyRandomWalk { 

   public static void main (String[] argv) 
   { 
       double x = 5; 
       int numSteps = 0; 
 
       while ((x > 0) && (x < 10)) { 
             if (Math.random() < 0.5) { 
                x = x + 1;
                System.out.println (x);  
             } 
             else { 
                  x = x - 1; 
             } 
             numSteps ++; 
       }
 
       System.out.println ("This is the number of steps:" + numSteps); 
       System.out.println ("This is the boundary it hits:" + x); 
   }
}
   

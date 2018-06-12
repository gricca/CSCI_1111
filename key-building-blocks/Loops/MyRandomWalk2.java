public class MyRandomWalk2 { 

   public static void main (String[] argv) 
   { 
       int numTrials = 1000; 
       double sum = 0;
       int i = 0;  
       while ( i < numTrials) { 
           sum = sum + singleTrial ();
           i++; 
       }
       double avg = sum / numTrials; 
       System.out.println (avg); 
   } 

   static int singleTrial ()
   { 
       double x = 5; 
       int numSteps = 0; 
 
       while ((x > 0) && (x < 10)) { 
             if (Math.random() < 0.5) { 
                x = x + 1; 
             } 
             else { 
                  x = x - 1; 
             } 
             numSteps ++; 
       }
       return numSteps; 
   }

}

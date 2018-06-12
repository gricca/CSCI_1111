public class ForLoopCorrect {

   public static void main (String[] argv) 
   {  
       for (int i=1; i<=5; i++) { 
           int prod = 1;
       
            for (int j=1; j<=i; j++) {
                 prod *= j; 
           }
           System.out.println ("The product of numbers 1 through " + i + " is: " + prod);
       }
   }

} 

public class PrintSmallestExercise { 

   public static void main (String[] argv) 
   {
       int i=3, j=4, k=5; 
       printSmallest (j, i, k); 
       printSmallest (9, 7, 5); 
   }

   static void printSmallest (int a, int b, int c)
   { 
       if ( (b < a) && (a < c) ) { 
          System.out.println (b);
          System.out.println ("5"); 
       }
   }
}

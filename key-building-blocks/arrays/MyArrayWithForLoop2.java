public class MyArrayWithForLoop2 { 

   public static void main (String[] argv) 
   { 
       int n = 6;

       int[] A = new int [n]; 

       for (int i=5; i>=0; i--) { 
           A[i] = (i+1)*(i+1); 
       }

       for (int i=5; i>=0; i--) { 
           System.out.println (A[i]); 
       }
   }

} 

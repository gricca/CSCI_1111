public class MyMinMaxArray { 

   public static void main (String[] argv) 
   { 
       int[] A = {-5, -6, -10, -11, -20, -3, -30};

      int max = 0; 
      int min = 0; 
       for (int i=0; i<A.length; i++) {
           if (A[i] > A[(A.length - 1) - i]) { 
               max = A[i];
           } 
           if (A[i] < A[(A.length - 1) - i]) { 
               min = A[i];
           }
       }
       System.out.println (max); 
       System.out.println (min); 
   }
}

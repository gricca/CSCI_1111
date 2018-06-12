public class MyReverseExample { 

   public static void main (String[] argv) 
   { 
       int[] A = {1, 4, 9, 16, 25}; 
       int n = A.length; 
   
       int temp = 0; 
       for (int i=0; i<n/2; i++) {
           temp = A[i];
           A[i] = A[n-i-1];
           A[n-i-1] = temp; 
   
       }
       for (int i=0; i<n; i++) { 
           System.out.println (A[i]); 
       }
    }
} 

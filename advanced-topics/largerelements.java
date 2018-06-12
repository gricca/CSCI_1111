public class largerelements { 

   public static void main (String[] argv) 
   { 
       int[] A = {8,1,4,2,3,5,6}; 
       int[] B = findelements (A); 
   }

   static int[] findelements (int[] A)
   { 
       int count = 0; 
       int index = 0; 
       //int[] b = new int [count]; 

       for (int j=1; j<A.length-1; j++) {
           if ( (A[j] < A[j-1]) && (A[j] < A[j+1]) ) {
               count++;
           }
       }

       int[] b = new int [count];

       for (int j=1; j<A.length-1; j++) { 
           if ( (A[j] < A[j-1]) && (A[j] < A[j+1]) ) {
               b[index] = A[j];
               index++; 
           }
       }
       return b;
       
   }
}

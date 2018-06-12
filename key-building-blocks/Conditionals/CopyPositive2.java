public class CopyPositive2 {

   public static void main (String[] argv) 
   {
       int[] A = {-5, 2, 3, -9, 12, 4, -30};
       int[] B = new int [A.length]; 

       int k = 0; 
       for (int i=0; i<A.length; i++) { 
           if (A[i] >= 0) { 
               B[k] = A[i]; 
               k++; 
            }
        }
       
        for (int i=0; i<B.length; i++) {
            if (B[i] != 0) { 
            System.out.println (B[i]); 
            }
        }
   }

}

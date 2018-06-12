public class LeftRotateByK { 

   public static void main (String[] argv) 
   { 
       int[] A = {1, 4, 9, 16, 25};
                 for (int i=0; i<A.length; i++) { 
                     System.out.print (A[i] + " ");
                 }
       System.out.println (); 
       leftRotateByK (A);

       int [] B = {3, 2, 1};
                  for (int i=0; i<B.length; i++) { 
                     System.out.print (B[i] + " ");
                 }
       System.out.println ();  
       leftRotateByK (B);

       int [] C = {6, 7, 8, 9};
                  for (int i=0; i<C.length; i++) {
                     System.out.print (C[i] + " ");
                 }
       System.out.println ();  
       leftRotateByK (C);
   }

   static int leftRotateByK (int[] B)
   {
       int n = B.length;
       int temp = 0;
       int k = 2;

       for (int i=0; i<k; i++) {
           for (int j=n-1; j>0; j--) {
               temp = B[j];
               B[j] = B[j-1];
               B[j-1] = temp;
           }
       }

       for (int i=0; i<n; i++) {
           System.out.println (B[i] + " ");
       }

       return B[0];
   }
}


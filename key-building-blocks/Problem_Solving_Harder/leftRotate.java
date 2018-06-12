public class LeftRotate { 

   public static void main (String[] argv) 
   { 
       int[] A = {1, 4, 9, 16, 25}; 
       leftRotate (A);
       System.out.println ();
       int [] B = {3, 2, 1};
       leftRotate (B);
       System.out.println ();
       int [] C = {6, 7, 8, 9};
       leftRotate (C);
       System.out.println ();
   }
  
   static int leftRotate (int[] A)
   { 
       int n = A.length; 
       int temp = 0; 

       for (int i=0; i<n-1; i++) {
           temp = A[i]; 
           A[i] = A[i+1]; 
           A[i+1] = temp;
       }

       for (int i=0; i<n; i++) { 
           System.out.print (A[i] + " ");
       }
      
       return A[0];
   }
}


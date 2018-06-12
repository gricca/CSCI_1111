public class CopyMultiples2 { 

   public static void main (String[] argv) 
   { 
       int[] A = {2, 9, 22, 12, 4, 3, 8, 30};

       int copy = 0;
       for (int i=0; i<A.length; i++) {
           if ( (A[i] % 3 == 0) || (A[i] % 4 == 0) ) {
           copy ++; 
           }
       }
        
        int[] B = new int [copy];
        
        int k = 0;
        for (int i=0; i<A.length; i++) {
            if ( (A[i] % 3 == 0) || (A[i] % 4 == 0) ) {  
            B[k] = A[i]; 
            k++;
            }
         }

         for (int i=0; i<B.length; i++) { 
             System.out.println (B[i]); 
         }
         System.out.println ("The length of B without wasting space is: " + B.length);
   }

}  
        


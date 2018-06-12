public class MyArrayWithForLoop { 

   public static void main (String[] argv) 
   {
       int n = 6;

       int[] A = new int [n]; 

       for (int i=0; i<n; i++) { 
           A[i] = (i+1)*(i+1); 
       }

       for (int i=0; i<n; i++) { 
           System.out.println (A[i]); 
       }
   }

}

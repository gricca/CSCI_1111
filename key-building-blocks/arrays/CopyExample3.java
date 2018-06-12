public class CopyExample3 {

   public static void main (String[] argv) 
   {
       int n = 5; 

       double[] A = new double [n]; 
       for (int i=0; i<n; i++) { 
           A[i] = 1.0 / ((i+1)*(i+1)); 
       }

       System.out.println (A[0]); 

       System.out.println (A); 

       double[] B = new double [n]; 

       A = B; 
       System.out.println (A[0]); 

       System.out.println (A); 
       System.out.println (B); 

   }
}

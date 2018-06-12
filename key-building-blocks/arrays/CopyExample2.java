public class CopyExample2 {

   public static void main (String[] argv) 
   { 
       int n = 5; 

       double[] A = new double [n]; 
       for (int i=0; i<n; i++) { 
           A[i] = 1.0 / ((i+1)*(i+1)); 
       } 

       double[] B = new double [n]; 

       B = A; 
       System.out.println (B[0]); 
       A[0] = 0; 
       System.out.println (B[0]); 
    }
}

public class MyDoubleExample {

   public static void main (String[] argv) 
   {
       int n = 5; 

       double[] A = new double [n]; 

       double s = 0.0; 
       for (int i=0; i<n; i++) { 
           A[i] = 1.0 / ((i+1) * (i+1)); 
           System.out.println ("This is a term in the sequence: " + A[i]);
           s += A[i];  
       }
       double six = 6 * s; 
       System.out.println ("This is the sum of the sequence times 6: " + six); 
       double sqrt = Math.sqrt (six); 
       System.out.println ("This is the square root of the sum above: " + sqrt); 

    }

}

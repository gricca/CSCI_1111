public class FindLargestInArray { 

   public static void main (String[] argv)
   {
      double[] someNumbers = {2.718, 3.141, 1.414, 1.618}; 
      double largest = findLargest (someNumbers); 
      System.out.println (largest); 
   }

   static double findLargest (double[] A) 
   { 
       double largest = 0.0;
       for (int i=0; i<A.length; i++) { 
           if (A[i] > largest) {
              largest = A[i]; 
           }
        } 
        return largest;

    }

}

public class NicePrintExample {

   public static void main (String[] argv) 
   { 
       double[][] A = { 
             {1.1, 2.222, -3.3, 4.4444}, 
             {1.0, 2.2, 33.3, 444.4}, 
             {0.4, -5.0, 0.66, 0.0777}
       };
       
       for (int i=0; i<A.length; i++) { 
           for (int j=0; j<A[i].length; j++) { 
               System.out.printf (" %5.4f", A[i][j]);
            }
            System.out.println ();
       }
   }
}

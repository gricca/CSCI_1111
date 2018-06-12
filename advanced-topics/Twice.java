import java.util.*; 
import java.io.*;

public class Twice { 

   public static void main (String[] argv)
   { 
      int[] A = {5, 7, 11, 13, 17}; 
      int[] B = {4, 5, 7, 3, 2, 7, 6, 7, 11, 11, 5}; 
      int[] C = processArrays (A, B);
      System.out.println (Arrays.toString(C)); 
   }

   static int[] processArrays (int[] a, int[] b)
   { 
       int sum = 0;
       int k = 0;
       int total = 0; 
       int[] c = new int [a.length]; 

       for (int i=0; i<a.length; i++) { 
           for (int j=0; j<b.length; j++) { 
               if (a[i] == b[j]) {
                  sum++; 
               }

           }
           if (sum > 1) {
                  c[k] = a[i];
                  k++;
           }
           sum = 0; 
       }
       return c;
       
   }
}

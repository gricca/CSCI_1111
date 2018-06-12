import java.util.*;

public class Twice {

    public static void main (String[] argv)
    {
	// Print numbers in A that occur exactly twice in B.
	int[] A = {5, 7, 11, 13, 17};
	int[] B = {4, 5, 7, 3, 2, 7, 6, 7, 11, 11, 5};
        int[] C = processArrays (A, B);
	System.out.println (Arrays.toString(C));
	// Should print 5, 11

	int[] A2 = {1, 2, 3, 4};
	int[] B2 = {1, 0, 4, 1, 4, 1, 1, 2, 3, 0, 8, 8};
        int[] C2 = processArrays (A2, B2);
	System.out.println (Arrays.toString(C2));
	// Should print 4
    }

    static int[] processArrays (int[] a, int[] b)
    { 
       int count = 0; 
       int size1 = 0;
       int size2 = 0;
       int index = 0;  

       for (int i=0; i<a.length; i++) { 
           for (int j=0; j<b.length; j++) { 
               if (a[i] == b[j]) { 
                  size1++;
               }  
           }
           if (size1 == 2) { 
              size2++; 
           }
       }

      int[] c = new int [size2+1];

      for (int i=0; i<a.length; i++) {
          for (int j=0; j<b.length; j++) { 
              if (a[i] == b[j]) { 
                 count++; 
              }
          }
          if (count == 2) { 
             c[index] = a[i]; 
             index++; 
          }
          count = 0;
      }
      return c;          
   }
         
}

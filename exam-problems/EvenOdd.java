
import java.util.*;

public class EvenOdd {

    public static void main (String[] argv)
    {
	// First test:
	char[] A = {'f', 'e', 'e', 'x', 'v', 'a', 'e', 'm', 'r'};
	char[] B = extractOdd (A);
	System.out.println (Arrays.toString (B));  // Prints exam
	char[] C = extractEven (A);
	System.out.println (Arrays.toString (C));  // Prints fever
	char[] D = join (B, C);
	System.out.println (Arrays.toString (D));  // Prints examfever

	// Second test:
	char[] A2 = {'l', 'g', 'u', 'o', 'c', 'o', 'k', 'd'};
	char[] B2 = extractOdd (A2);
	System.out.println (Arrays.toString (B2));  
	char[] C2 = extractEven (A2);
	System.out.println (Arrays.toString (C2));  
	char[] D2 = join (B2, C2);
	System.out.println (Arrays.toString (D2));  

    }

    static char[] extractOdd (char[] a) 
    { 
         int size = 0;
 
         for (int i=0; i<a.length; i++) { 
             if (i%2 != 0) { 
                size++;
             }
         }
  
         int index = 0;
         char[] b = new char [size]; 
          
         for (int i=0; i<a.length; i++) { 
             if (i%2 != 0) { 
                b[index] = a[i]; 
                index++; 
             }
        }
        return b;
   }

   static char[] extractEven (char[] a)
   { 

       int size1 = 0; 

       for (int i=0; i<a.length; i++) { 
           if (i%2 == 0) { 
              size1++;
           }
       }

       int index1 = 0;
       char[] c = new char [size1];

       for (int i=0; i<a.length; i++) { 
           if (i%2 == 0) { 
              c[index1] = a[i];
              index1++; 
           }
       }
       return c; 
   }

   static char[] join (char[] b, char[] c)
   { 
       int index3 = 0;
       char[] d = new char [b.length + c.length]; 
 
       for (int i=0; i<b.length; i++) { 
           d[index3] = b[i]; 
           index3++; 
       }

       for (int i=0; i<c.length; i++) { 
           d[index3] = c[i]; 
           index3++;
       }

       return d;
   }

}

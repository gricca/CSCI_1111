import java.util.*;

public class FlipCharArray {

    public static void main (String[] argv) 
    {
	char[] A = {'s','w','a','p'};
        char[] B = flip (A);
	System.out.println (Arrays.toString(B));
	// Should print paws

        char[] A2 = {'d','e','l','i','v','e','r'};
        char[] B2 = flip (A2);
	System.out.println (Arrays.toString(B2));
	// Should print reviled
    }

    static char[] flip (char[] a) 
    { 
        char[] flipped =  new char [a.length];

        int size = a.length-1; 

        for (int i=0; i<a.length; i++) {
            flipped[size] = a[i];
            size--; 
        }

        return flipped; 
   }
}

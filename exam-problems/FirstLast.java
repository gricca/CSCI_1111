
public class FirstLast {

    public static void main (String[] argv)
    {
	int[] A = {1,2,3,4,5,6,7,1,2,3};
	boolean yes = isFirstLast (A, 3);
	System.out.println (yes);
	// Should print true

	int[] A2 = {1,2,3,4,5,6,7,1,2,3,4};
	boolean yes2 = isFirstLast (A2, 4);
	System.out.println (yes2);
	// Should print true

	boolean yes3 = isFirstLast (A, 2);
	System.out.println (yes3);
	// Should print false
    }

    static boolean isFirstLast (int[] a, int k)
    { 
        boolean isFirstLast = false;
        int size = a.length - k;
        int count = 0;

        for (int i=0; i<k; i++) {
            if (a[i] == a[(size+i)]) {
               isFirstLast = true;
            }
        }

        return isFirstLast;
   }            
}

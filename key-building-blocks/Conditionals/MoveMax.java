public class MoveMax {

   public static void main (String[] argv)
   {
       int [] A = {13, 5, 2, 0, 3, 1, 21, 1, 8};

       for (int k=0; k<A.length-1; k++) {

       int maxPosition = k;

       for (int i=k+1; i<A.length; i++) {
           if (A[i] > A[maxPosition]) {
              maxPosition = i;
           }
        }

        int temp = A[k];
        A[k] = A[maxPosition];
        A[maxPosition] = temp;

        }

        for (int i=0; i<A.length; i++) {
            System.out.println (A[i]);
        }
   }
}


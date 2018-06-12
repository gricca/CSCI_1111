public class MoveMin {

   public static void main (String[] argv)
   {
       int [] A = {13, 5, 2, 0, 3, 1, 21, 1, 8};

       int min = A[0];
       int minPosition = 0;

       for (int i=1; i<A.length; i++) {
           if (A[i] < min) {
              min = A[i];
              minPosition = i;
           }
        }

        int temp = A[0];
        A[0] = A[minPosition];
        A[minPosition] = temp;

        for (int i=0; i<A.length; i++) {
            System.out.println (A[i]);
        }
    }

}

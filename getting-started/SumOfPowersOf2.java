public class SumOfPowersOf2 {

   public static void main (String[] argv)
   {
       int n = 4;

       int s = 1;
       for (int k=1; k<=n; k++) {

           int p = 1;
           for (int i=1; i<=k; i++) {
               p *= 2;
           }

           s += p;
        }

        System.out.println (s);
    }

}

public class ComputePi {

   public static void main (String[] argv)
   {
       int n = 30;
       for (int k=1; k<=n; k++) {
           double sum = 0; 
           double sign = 1;
           for (int i=1; i<=k; i++) {
               sum += sign / (2*i - 1);
               sign = -sign;
           }
           double xk = 4 * sum;
           System.out.println (xk);
        }
    }

}

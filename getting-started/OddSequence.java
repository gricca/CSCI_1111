public class OddSequence {

   public static void main (String[] argv)
   {
       for (int n=1; n<=20; n++) {
           double x = 2*n-1;

       double power = 1;
       for (int j=1; j<=n; j++) {
           power = power * x;
       }

       System.out.println ("n-th power of xn=" + power);
        }
   }
  
}

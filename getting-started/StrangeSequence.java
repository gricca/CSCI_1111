public class StrangeSequence {

   public static void main (String[] argv) 
   {
       for (int n=15; n<=35; n++) {
           double x = 1.0 + 1.0/n;

       double power = 1;
       for (int j=1; j<=n; j++) {
           power = power * x;
       }

       System.out.println ("n-th power of xn=" + power);
       }
    }

}

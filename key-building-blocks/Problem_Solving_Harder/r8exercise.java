public class r8exercise {

   public static void main (String[] argv)
   {
       int p = 3;
       int q = factorial (factorial(p)) * factorial(p-3) + factorial (-3);
       System.out.println (q);
   }

   static int factorial (int n)
   {
       if (n < 0) {
           System.out.println ();
           return 0;
       }
       else if (n == 0) {
            System.out.println ();
            return 1;
       }

       int k = 1;
       for (int i=1; i<=n; i++) {
           k = k * i;
       }
       System.out.println ();
       return k;
   }

}

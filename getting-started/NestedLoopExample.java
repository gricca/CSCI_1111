public class NestedLoopExample {

   public static void main (String[] argv)
   {
       int n = 500;
       double sum = 0;
       for (int k=0; k<=n; k++) {
            double power = 1;
            for (int i=0; i<k; i++) {
                 power *=0.5;
            }
            sum += power;
       }
       System.out.println (sum);
   }

}

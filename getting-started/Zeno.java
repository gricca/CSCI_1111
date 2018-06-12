public class Zeno {

   public static void main (String[] argv)
   {
       int n = 10;
       
       double xn = 0;
       for (int k=1; k<=n; k++) {

           double power = 1;
           for (int i=1; i<=k; i++) {
                power *= 0.5;
           }

           xn += power;    
       }
       
       System.out.println (xn);
   }

}

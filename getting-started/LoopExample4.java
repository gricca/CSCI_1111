public class LoopExample4 {

   public static void main (String[] argv)
   {
       double product = 1;
       for (double x=0.1; x<=1.0; x+=0.1) {
           product *=x;
       }
       System.out.println (product);
   }

}

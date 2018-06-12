public class TestSequence {

   public static void main (String[] argv)
   {
       double x = 1.05;

       for (int n=2; n<=20; n++) {
           System.out.println (x);
           x = 1.05 * x;
       }
    }

}

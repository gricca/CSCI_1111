public class StrangeSequence {

   public static void main (String[] argv)
   {
      int n = 6;
      int prev = 1;
      for (int i=2; i<=n; i++) {
          int current = prev*prev + prev;
          System.out.println (current);
      }
   }

}

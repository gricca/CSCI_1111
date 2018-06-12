public class PowerOf2 {

   public static void main (String[] argv)
   {
      int n = 30;
      int p = 1;
      for (int i=1; i<=n; i++) {
          p = p * 2;
      }
      System.out.println (p);
   }

}

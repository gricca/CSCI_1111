public class StringExample2 {

   public static void main (String[] argv)
   {
      String s = "";

      int last = 10;
      for (int i=1; i<=last; i++) {
          for (int j=1; j<=i; j++) {
              s += "*";
          }
          s += "\n";
      }
      System.out.println ("A triangle with base=" + last + ":\n" + s);
   }

}

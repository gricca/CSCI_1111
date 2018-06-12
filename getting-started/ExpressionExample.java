public class ExpressionExample { 

   public static void main (String[] argv) 
   {
      int j = 10;
      for (int i=1; i<=10; i++) {
          int k = j % i;
          int q = j / i; 
          System.out.println (k);
          System.out.println (q); 
      }
   }

}

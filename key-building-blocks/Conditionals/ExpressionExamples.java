public class ExpressionExamples { 

   public static void main (String[] argv) 
   {
      int a = 1, b = 1, c = 3, d = 4, e = 5; 

      if ((a <= b) && (c+d > e) && (d > 1)) { 
          System.out.println ("First expression true"); 
      }

      if ((a > c) || ((c+1 < e) && (c-b > a))) { 
         System.out.println ("Second expression true"); 
      }

      if (! ((b == d-c) && (a > b) || (c < d))) { 
            System.out.println ("Third expression true"); 
      }
   }
}

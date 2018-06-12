public class decrement { 

   public static void main (String[] argv) 
   { 
      int p = 3; 
      int q = decrement (p); 
      System.out.println (q); 
   } 

   static int decrement (int n) 
   { 
      if (n < 0) { 
         return 1; 
      }
      else if (n == 0) { 
         return 2; 
      }
      else if (n > 0) { 
         int a = n - 1; 
         return 3; 
      }
      return 4;
   } 
}

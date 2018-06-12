import java.util.*; 

public class Multiple { 

   public static void main (String[] argv)
   { 
      System.out.println (firstMultiple3(100)); 
      System.out.println (firstMultiple3(1000)); 
   }

   static int firstMultiple3 (int n)
   { 
      int limit = 0; 
      int mult = 0; 

      while (mult <= n) {
            mult = (3 + limit)*(3 + limit); 
            limit+=3; 
      }
      return limit;
   }
}

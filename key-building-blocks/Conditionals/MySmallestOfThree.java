public class MySmallestOfThree { 

   public static void main (String[] argv)
   { 
       int a = 2, b = 1, c = 5;

       if (a < b) {
           if (a < c) { 
              System.out.println ("a is smallest"); 
          }
          else {
              System.out.println ("a may not be the smallest");
          }
       }

       if (b < a) {
           if (b < c) { 
              System.out.println ("b is the smallest"); 
           }
           else {
              System.out.println ("b may not be the smallest");
           }
       }

       if (c < a) { 
          if (c < b) { 
             System.out.println ("c is the smallest"); 
          }
          else {
              System.out.println ("c may not be the smallest");
          }
       }
   }      
 
}

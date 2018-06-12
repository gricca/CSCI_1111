public class MySmallestOfThree3 { 

   public static void main (String[] argv) 
   { 
       int a = 3, b = 4, c = 5; 

       if ((a < b) && (a < c)) {
           System.out.println ("a is the smallest"); 
       }

       if ((b < a) && (b < c)) {
           System.out.println ("b is the smallest"); 
       }

       if ((c < a) && (c < b)) {
           System.out.println ("c is the smallest"); 
       }
    }
}

public class FindSmallestAmong5 { 

   public static void main (String[] argv) 
   { 
       int p=3, q=4, r=5, s=2, t=6; 
       int small = findSmallest (p, q, r);
       int small2 = findSmallest (small, s, t);
       if (small < small2) {
          System.out.println (small); 
          }
       else {
          System.out.println (small2); 
       }
   }

   static int findSmallest (int a, int b, int c)
   { 
       if ( (a < b) && (b < c) ) {
          return a; 
       }

       if ( (b < a) && (a < c) ) {
          return b; 
       }

       if ( (c < a) && (a < b) ) {
          return c; 
       }
       return -1;  
   }

}

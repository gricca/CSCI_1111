public class r1exercise {

   public static void main (String[] argv)
   {
       int x=7, y=6, z=5;
       int c = 'b';

       System.out.println ("1");
       if (x < y) {
           x = x +10;
       }
       System.out.println ("2");

       else if (x > y) {
           System.out.println ("3");
           if ( ( x > 0) && (x + y > z) ) {
              if (c == 'a') {
                  System.out.println ("Yes, a");
               }
              else {
                   if (c == 'b') {
                       System.out.println ("No, it's b");
                   }
                   System.out.println ("6");
               }
               System.out.println ("7");
            }
            else {
                 System.out.println ("Boo");
            }
            System.out.println ("8");
         }
         else {
              System.out.println ("Ok, that's enough");
         }
         System.out.println ("9");
        }
    }
}

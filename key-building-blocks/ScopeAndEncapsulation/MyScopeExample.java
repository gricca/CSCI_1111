public class MyScopeExample { 

    static double x = 0.5;
    static int y = 2;

    public static void main (String[] argv) 
    { 
        System.out.println (x);
        System.out.println (y); 
        squareIt (); 
        System.out.println (x);
        System.out.println (y); 
        multbythree (); 
        System.out.println (x);
        System.out.println (y); 
        dividebytwo ();
        System.out.println (x);
        System.out.println (y);
   }
   static void squareIt ()
   { 
        x = x * x;
   }
   static void multbythree ()
   { 
        x = x * 3; 
        y = y * 3;
   }
   static void dividebytwo ()
   { 
        x = x / 2; 
        y = y / 2;
   }
}

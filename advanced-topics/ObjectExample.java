class Money { 

   int dollars = 0; 
   int cents = 0; 

   void set (int d, int c)
   { 
      dollars = d; 
      cents = c;
   } 

   void add (int d, int c) 
   { 
      dollars += d; 
      int temp = cents + c;
      if (temp >= 100) { 
         cents = temp - 100;
         dollars++;
      }
   }

   void sub (int d, int c)
   { 
       dollars = dollars -  d; 
       int temp = cents - c; 
       if (temp < 0) { 
          cents = 100 + temp; 
          dollars--; 
       }
   }

   void print ()
   {
      System.out.println ("$ " + dollars + "." + cents); 
   }
}

public class ObjectExample { 

   public static void main (String[] argv) 
   { 
       Money m = new Money (); 
       
       m.set (1, 50); 
       m.add (2, 75); 
       m.print (); 
       m.sub (1, 50); 
       m.print ();
   }
}

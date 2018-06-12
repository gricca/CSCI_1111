public class IfElseExample { 

   public static void main (String[] argv) 
   { 
       int x = 9, y = 6; 

       if (x > y) { 
           System.out.println ("Hey, x is bigger"); 
       }
       else if (x < y) { 
            System.out.println ("Who said x is bigger?"); 
            System.out.println ("In fact, y is bigger"); 
       }
       else { 
            System.out.println ("Actually, they are equal"); 
       }

       System.out.println ("Ok, we're done"); 
    }
}

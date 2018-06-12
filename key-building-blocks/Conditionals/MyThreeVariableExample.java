public class MyThreeVariableExample { 

   public static void main (String[] argv) 
   { 
       int x = 5, y = 4, z = 3; 

       if (x > y) { 
           System.out.println ("x is bigger than y"); 
       } 

       else { 
           System.out.println ("X is not the largest");
       }
   
       if (x > z) { 
           System.out.println ("x is bigger than z"); 
           System.out.println ("So, x is the largest");
       }

       else {
           System.out.println ("X is not the largest");
       }
           
   }
}

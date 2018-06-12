public class MyNotExample { 

   public static void main (String[] argv) 
   {
       int x = 5, y = 6, z = 7; 

       if ((x != y) && (x !=z)) { 
           System.out.println ("x is different from y and z"); 
       }

       if ((y != x) && (y !=z)) { 
           System.out.println ("y is different from x and z");
       }

       if ((z != x) && (z !=y)) {
           System.out.println ("z is different from x and y");
       }
   }
}

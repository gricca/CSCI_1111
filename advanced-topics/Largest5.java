public class Largest5 { 

   public static void main (String[] argv)
   { 
       int a=3, b=1, c=0, d=5, e=2;
       largestOfThree (a, b, c);
       largestOfThree (c, d, e); 
   }

   static int largestOfThree (int x, int y, int z) 
   { 
       int largest = 0; 
       
       if (x > y && x > z) { 
          largest = x;
          System.out.println (x); 
       }
       else if (y > x && y > z) { 
          largest = y;
          System.out.println (y); 
       }
       else if (z > x && z > y) { 
          largest = z;
          System.out.println (z);
       }
       return largest;
   }
}
     

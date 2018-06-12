public class FunctionMinMax { 

   public static void main (String[] argv) 
   {
       double min = 100;
       double max = 0;  

       double xvalue1 = 0;
       double xvalue2 = 0;
 
       for (double x=0; x<=1; x+=0.1) { 
           double f = 20 + 100 * (x*x*x - x*x); 
           if (f < min) {
               min = f;
               xvalue1 = x; 
           }
           if (f > max) { 
               max = f; 
               xvalue2 = x; 
           }
           System.out.println ("x is " + x); 
           System.out.println ("f is " + f); 

        }

        System.out.println ("min value of f = " + min); 
        System.out.println ("x where min value of f occurs: " + xvalue1); 
        System.out.println ("max value of f = " + max); 
        System.out.println ("x where max value of f occurs: " + xvalue2); 

   }

}

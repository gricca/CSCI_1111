public class MyFunctionMinimum {

   public static void main (String[] argv) 
   {
       double min = 100; 

       double xvalue = 0; 
       for (double x=0; x<=1; x+=0.1) { 
           double f = 20 + 100 * (x*x*x - x*x); 
           if (f < min) {
              min = f;
              xvalue = x; 
           }
           System.out.println ("x is " + x);
           System.out.println ("f is " + f);
           
       }
       
       System.out.println ("min value of f = " + min);
       System.out.println ("x where min value of f occurs: " + xvalue);
       
        
   }

}

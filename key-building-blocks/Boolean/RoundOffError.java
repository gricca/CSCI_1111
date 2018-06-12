public class RoundOffError { 

   public static void main (String[] argv) 
   { 
       double x = Math.sqrt (2); 
       double y = x * x;  
       if ( (y > 1.999) && (y < 2.001) ) { 
           System.out.println ("They're equal"); 
       }
   }

}

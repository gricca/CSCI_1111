public class MyNegativeElement { 

   public static void main (String[] argv) 
   { 
       double[] data = {4.0, 5.0, -2.0, 1.0, 3.0};
       boolean hasNegative = hasNegativeElement (data); 
       if (hasNegative) {
           System.out.println ("Yeah!");
           } 
       else { 
           System.out.println ("Nah!"); 
            }
        
    }

    static boolean hasNegativeElement (double[] A)
    {
       int negativecount = 0;
       for (int i=0; i<A.length; i++) { 
           if (A[i] < 0) { 
              negativecount ++; 
              }
           }
        if (negativecount > 0) {
          boolean hasNegative = true; 
           }
     }
}



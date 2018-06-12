public class OddOrEven { 

   public static void main (String[] argv) 
   { 
       int n = 10; 

       for (int i=1; i<=n; i++) {
            if ((i % 2) == 0) { 
                System.out.print (i); 
                System.out.println (" is even"); 
             }
             if ((i % 2) == 1) { 
                System.out.print (i); 
                System.out.println (" is odd"); 
             }
        }
   }

}             

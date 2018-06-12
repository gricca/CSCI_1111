public class MyArrayPrint { 

   public static void main (String[] argv)
   { 
       String[][] A = { 
             {"(0,0)", "(0,1)", "(0,2)", "(0,3)", "(0,4)"},
             {"(1,0)", "(1,1)", "(1,2)", "(1,3)", "(1,4)"},
             {"(2,0)", "(2,1)", "(2,2)", "(2,3)", "(2,4)"},
             {"(3,0)", "(3,1)", "(3,2)", "(3,3)", "(3,4)"},
       };

       for (int i=0; i<A.length; i++) { 
           for (int j=0; j<A[i].length; j++) { 
               System.out.printf (" %6s", A[i][j]); 
            }
            System.out.println (); 
       }
   }
}    

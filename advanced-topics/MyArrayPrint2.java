public class MyArrayPrint2 {

   public static void main (String[] argv)
   {
       String[][] A = {
             {"(0,0)", "(0,1)", "(0,2)", "(0,3)", "(0,4)"},
             {"(1,0)", "(1,1)", "(1,2)", "(1,3)", "(1,4)"},
             {"(2,0)", "(2,1)", "(2,2)", "(2,3)", "(2,4)"},
             {"(3,0)", "(3,1)", "(3,2)", "(3,3)", "(3,4)"},
       };
    
       for (int y=A[0].length-1; y>=0; y--) { 
           for (int x=0; x<A.length; x++) { 
               System.out.printf (" %6s", A[x][y]); 
           }
           System.out.println (); 
       }
   }
}

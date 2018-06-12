public class MyEqualWords { 

   public static void main (String[] argv)
   { 
       char[] word = {'*', 'i', '*', 'e', 'r'}; 
       char[] word2 = {'r', 'i', 'v', 'e', 'r'}; 
       char[] word3 = {'t', 'i', 'g', 'e', 'r'}; 
       System.out.println ( isApproxEqual (word, word2) ); 
       System.out.println ( isApproxEqual (word, word3) );
   }

   static boolean isApproxEqual (char[] A, char[] B)
   { 
       if (A.length != B.length) { 
          return false; 
       } 

       for (int i=0; i<A.length; i++) { 
           if ( (A[i] != B[i]) && (A[i] != '*') && (B[i] != '*') ) { 
                 return false;
           }
       }
       return true; 
   }
}

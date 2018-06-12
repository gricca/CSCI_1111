public class MyWordSearch { 

   public static void main (String[] argv) 
   { 
       char[] sentence = { 
       'n', 'e', 'v', 'e', 'r', ' ' , 'o', 'd', 'd', ' ', 'o', 'r', ' ', 'e', 'v', 'e', 'n'
       };
       char[] word = {'o', 'd', 'd'}; 
       int position = wordSearch (word, sentence); 
       System.out.println (position); 
   }

   static int wordSearch (char[] A, char[] B) 
   { 
        char new = ' '; 

        for (int i=0; i<B.length-A.length; i++) { 
            boolean match = true;
            for (int j=0; j<A.length; j++) { 
                if ( (A[j] != B[i+j]) && (B[i+j-1] != new ) && (B[i+j+1] != new) ) { 
                   match = false; 
                } 
            } 
            if (match) { 
               return i; 
            } 
        }
     
        return -1; 
   } 
}

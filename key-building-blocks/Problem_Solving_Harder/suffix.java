public class suffix { 

   public static void main (String[] argv)
   { 
       char[] word = {'n', 'e', 'v', 'e', 'r'}; 
       char[] word2 = {'r', 'i', 'v', 'e', 'r'}; 
       char[] word3 = {'e', 'v', 'e', 'r'}; 
       char[] suffix = commonSuffix (word, word2); 
       printArray (suffix); 
       suffix = commonSuffix (word, word3); 
       printArray (suffix); 
   } 

   static char[] commonSuffix (char[] A, char[] B) 
   {
      int size = 0;
      int diff = A.length - B.length;

      for (int i=A.length-1; i>0; i--) {
              if (A[i] == B[i-diff]) { 
              size ++ ;
              } 
      }
      char[] suffix = new char [size]; 
      
      for (int i=A.length-1; 0>size; i--) { 
          suffix[i-diff] = A[i];
      }
      return suffix; 
            
   }
   static void printArray (char[] print)
   { 
      for (int i=0; i<print.length; i++) { 
          System.out.println (print[i]); 
      }
   } 
}       

public class Klingon2 { 

   public static void main (String[] argv) 
   { 
       String[] words = WordTool.getKlingonWords (); 

       int numWordsWithU = 0; 

       for (int i=0; i<words.length; i++) {
           int uCount = 0; 
           for (int j=0; j<words[i].length(); j++) { 
               char c = words[i].charAt (j); 
               if (c == 'u') { 
                  uCount ++; 
               }
           }

           if (uCount > 0) { 
              numWordsWithU ++; 
           }
       }

       System.out.println ("Total number of words: " + words.length); 
       System.out.println ("Number of words with u's: " + numWordsWithU);
       double wordstotal = (int) words.length; 
       double utotal = (int) numWordsWithU; 
       double ratio = (utotal / wordstotal) * 100; 
       System.out.println ("The ratio of words with u to all words is: " + ratio);  
   }

} 



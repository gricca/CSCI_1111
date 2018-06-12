public class MyWordSquare2 { 

   public static void main (String[] argv) 
   { 
       char[][] letters = { 
           {'b', 'a', 'r', 'd'},
           {'a', 'r', 'e', 'a'}, 
           {'r', 'e', 'a', 'r'}, 
           {'d', 'a', 'r', 't'}
       }; 
       System.out.println (isWordSquare(letters) ); 
       printWordSquare(letters);
       printDiag(letters);
   }
  
   static boolean isWordSquare (char[][] letters) 
   { 
       for (int i=1; i<letters.length; i++) { 
           for (int j=0; j<letters.length; j++) { 
               if (letters[i][j] != letters[j][i]) { 
                  return false; 
               }
           }
       }
      
       return true; 
   }

   static void printWordSquare (char[][] letters)
   {
       for (int i=1; i<letters.length; i++) { 
           for (int j=0; j<letters.length; j++) { 
               System.out.print (letters[i][j]); 
           }
     
           System.out.println ();
       }
   }
    
   static void printDiag (char[][] letters)
   {
       for (int i=0; i<letters.length; i++) { 
           System.out.print (letters[i][i]); 
        } 
        System.out.println (); 

        int n = 3; 
        for (int i=0; i<letters.length; i++) { 
             System.out.print (letters[n][i]); 
             n--;
        }
        System.out.println ();
   }

}

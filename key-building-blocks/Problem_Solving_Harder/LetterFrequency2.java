import java.util.*; 
import java.io.*; 

public class LetterFrequency2 { 

   public static void main (String[] argv) 
   { 
       IOTool.openFileByChar ("macbeth.txt"); 
       int k = IOTool.getNextChar (); 

       char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};       
       int total = 0;
        
       while ( k >= 0) {
             char c = (char) k;
             for (int i=0; i<alphabet.length; i++) {  
                 if (c == alphabet[i]) { 
                 total++; 
                 }
              }
              k = IOTool.getNextChar ();
      }
      System.out.println ("This is the total number of characters a through z: " + total);

           
           
      while ( k >= 0) { 
            char c = (char) k;
            for (int i=0; i<alphabet.length; i++) { 
                int count = 0; 
                for (int j=0; j<=total; j++) {
                    if (c == alphabet[i]) { 
                       count++;
                    }
                    System.out.println (c + " : " + count);
                }
                k = IOTool.getNextChar ();
            } 

      } 

   }
}      
             

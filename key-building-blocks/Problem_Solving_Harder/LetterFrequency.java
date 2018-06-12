import java.util.*; 
import java.io.*; 

public class LetterFrequency { 

   public static void main (String[] argv) 
   { 
      IOTool.openFileByChar ("macbeth.txt"); 
    
      int k = IOTool.getNextChar (); 
      
      try { 
           Scanner fileScanner = new Scanner ("macbeth.txt");            
            int total = 0; 
            char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            while (fileScanner.hasNextChar()) { 
                  char c = fileScanner.nextChar (); 
                  for (int i=0; i<alphabet.length; i++) { 
                      if (c == alphabet[i]) {
                         total++; 
                      }
                  }
            }
            catch (IOException e) {
            }
      }
      while (k >= 0) { 
            char c = (char) k; 
            int count = 0;
            for (char i='a'; i<= 'z'; i++) { 
                count = 0; 
                for (int j=0; j<=i; j++) { 
                    if (c == i) { 
                       count++; 
                    } 
                } 
            if (count != 0) { 
               System.out.println (i +": " + count);
            } 

           k = IOTool.getNextChar (); 
       } 
       
   }

 } 
   
}

import java.util.*; 
import java.io.*; 

public class ReadFileByChar { 

   static Scanner fileScanner = null; 
   static String line = null; 
   static int currentPositionInLine = 0; 

   public static void main (String[] argv) 
   { 
      openFile ("somefile.txt"); 

      int i = getNextChar (); 
      while (i >=0) { 
            char c = (char) i; 
            System.out.println (c); 
            i = getNextChar (); 
      }
      System.out.println (); 
   } 

   static void openFile (String filename) 
   { 
       try { 
           fileScanner = new Scanner (new File (filename)); 
        
           if (fileScanner.hasNextLine()) { 
              line = fileScanner.nextLine (); 
           }
       } 
       catch (IOException e) { 
             System.out.println ("Could not open file: " + filename); 
             System.exit (0); 
       } 
   }

   static int getNextChar ()
   { 
       if (currentPositionInLine >= line.length()) { 
          if (fileScanner.hasNextLine()) { 
             line = fileScanner.nextLine (); 
             currentPositionInLine = 0; 
             System.out.println (currentPositionInLine);
          }
          else { 
               return -1; 
          }
       }
      
      char c = line.charAt (currentPositionInLine); 
      System.out.println (currentPositionInLine); 
      currentPositionInLine ++; 
      return (int) c; 
  }
 
}

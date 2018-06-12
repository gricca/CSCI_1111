import java.util.*; 
import java.io.*; 

public class CharCode {

    public static void main (String[] argv)
    {
	// Use IOTool to read char-by-char. Then identify
	// the int value of the opening and closing quote chars.

        IOTool.openFileByChar ("textsample.txt"); 

        int k = IOTool.getNextChar ();
        while (k >= 0) { 
              k = IOTool.getNextChar ();  
              if (k >= 127) { 
                 System.out.println (k + " " + (char)k); 
              } 
        }
   }

}

import java.util.*; 

public class consecutivechars { 

   public static void main (String[] argv) 
   { 
       String s = "den"; 
       boolean a = consecutive(s); 
   }

   static boolean consecutive (String s) 
   { 
        boolean consecutive = false; 
        char[] word = s.toCharArray(); 

        int k = 0;
        int m = 0;  
        for (int i=0; i<word.length; i++) { 
            k = (int) word[i];
            m = (int) word[i+1];  
            if ( (k+1) == m) { 
            consecutive = true; 
            }
        }
        return consecutive; 
   }
}               

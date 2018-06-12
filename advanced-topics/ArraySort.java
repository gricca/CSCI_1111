import java.util.*; 

public class ArraySort { 

   public static void main (String[] argv)
   { 
      char[] letters = {'g', 'r', 'e', 'e', 't', 'i', 'n', 'g', 's'};
      
      int m = 0; 
      char x = 'a'; 
      for (int i=0; i<letters.length; i++) {
          for (int j=i; j<letters.length; j++) { 
              if (letters[j] > x) { 
                 x = letters[j]; 
                 m = j; 
              }
          }
          char temp = letters[i]; 
          letters[i] = x; 
          letters[m] = temp; 
          x = 'a'; 
      }
      System.out.println (Arrays.toString(letters)); 
   }
} 

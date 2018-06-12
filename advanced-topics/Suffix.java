import java.util.*; 

public class Suffix { 

   public static void main (String[] argv)
   { 
      System.out.println (isSuffix("ran", "bran")); 
      System.out.println (isSuffix("ran", "brain")); 
   }

   static boolean isSuffix (String a, String b)
   { 
       boolean isSuffix = true; 

       char[] suffix = a.toCharArray(); 
       char[] word = b.toCharArray(); 
       int size = word.length - suffix.length;
       int count = 0;
       
       for (int i=0; i<suffix.length; i++) { 
           if (suffix[i] == word[size]) { 
              count++; 
              size++;
           }
       }

       if (count != suffix.length) { 
          isSuffix = false; 
       }
       
       return isSuffix; 
   }
}

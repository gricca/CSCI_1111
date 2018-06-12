public class MyCharArrayExample4 { 

   public static void main (String[] argv) 
   { 
       char[] word = {'f', 'a', 'c', 'e', 't', 'i', 'o', 'u', 's'}; 
       char[] vowels = {'a', 'e', 'i', 'o', 'u'};
       int vowelCount = 0; 

       for (int i=0; i<word.length; i++) { 
           for (int j=0; j<vowels.length; j++) { 
               if (word[i] == vowels[j]) { 
                   vowelCount ++; 
               }
           }
       }
      
       System.out.println ("Number of vowel's: " + vowelCount);
   }

} 

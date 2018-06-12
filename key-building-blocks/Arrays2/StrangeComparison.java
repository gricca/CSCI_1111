public class StrangeComparison { 

   public static void main (String[] argv) 
   { 
       String w1 = "verbose"; 
       char[] letters1 = w1.toCharArray (); 
       String w2 = "observe"; 
       char[] letters2 = w2.toCharArray (); 

       // Sort first string
       for (int i=0; i<letters1.length-1; i++) { 
           char smallest1 = letters1[i];
           int smallestIndex1 = i; 
           for (int j=i+1; j<letters1.length; j++) { 
               if (letters1[j] < smallest1) {
                  smallest1 = letters1[j]; 
                  smallestIndex1 = j; 
               }
            }

            char templetters1 = letters1[i]; 
            letters1[i] = letters1[smallestIndex1]; 
            letters1[smallestIndex1] = templetters1;          
           
         }

         // Sort second string
         for (int i=0; i<letters2.length-1; i++) {
           char smallest2 = letters2[i];
           int smallestIndex2 = i;
           for (int j=i+1; j<letters2.length; j++) { 
               if (letters2[j] < smallest2) {
                  smallest2 = letters2[j];
                  smallestIndex2 = j;
               }
            }

            char templetters2 = letters2[i];
            letters2[i] = letters2[smallestIndex2]; 
            letters2[smallestIndex2] = templetters2;
 
         }
         int anagram = 0; 
         for (int i=0; i<letters1.length; i++) {
             if (letters1[i] == letters2[i]) {
                  anagram ++;
              }
          }
             
           if (anagram > 0) {
                  System.out.println ("These words are anagrams!");
          }   
       
   }

}

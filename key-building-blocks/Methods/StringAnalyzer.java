public class StringAnalyzer {

   static int numSpaces = 0; 
   static boolean hasApostrophe = false; 

   public static void main (String[] argv) 
   {
       String testString = "hey, aren't globals cool?"; 
       analyze (testString); 
       System.out.println ("# spaces = " + numSpaces + " hasApostrophe = " + hasApostrophe); 
   }

   static void analyze (String s) 
   { 
      char[] letters = s.toCharArray ();
      int L = letters.length;
     
      for (int i=0; i<L; i++) { 
          if (letters[i] == ' ') { 
             numSpaces++; 
             }
      }

      for (int i=0; i<L; i++) { 
          if (letters[i] == '\'') {
             hasApostrophe = true;
          }
      }

   }      
}

              

           
           
           

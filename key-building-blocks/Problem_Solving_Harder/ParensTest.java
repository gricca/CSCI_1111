public class ParensTest { 

   public static void main (String[] argv)
   {
       String s = "(a(bc)d)(e)f";
       System.out.println (checkBalanced (s));
       s = "What I said (I mean ... (really?)) was (I'm not sure now) that it's true";
       System.out.println (checkBalanced (s));
       s = ")(";
       System.out.println (checkBalanced (s));
       s = "()(()()(";
       System.out.println (checkBalanced (s));
   }
  
   static  boolean checkBalanced (String s)
   {
       char[] letters = s.toCharArray ();
       int numLeft = countChar (letters, '(');
       int numRight = countChar (letters, ')');

       System.out.println ("numLeft=" + numLeft + " numRight=" + numRight);
       if (numLeft != numRight) {
           return false;
       }

       int k = findFirstRight (letters); 
       while (k > 0) { 
             System.out.print (k);
             int n = findFirstLeft (letters, k-1);
             System.out.print (n); 
             if (n < 0) { 
                return false;
             }
             else { 
                  letters[n] = ' '; 
                  letters[k] = ' ';
             }
             System.out.println (letters);         
     
             k = findFirstRight (letters); 
       }
       return true;      
   }

   static int countChar (char[] letters, char c)
   { 
      int numLeft = 0; 
      int numRight = 0; 

      for (int i=0; i<letters.length; i++) {
          if (c == '(') { 
             numLeft ++; 
           }
           if (c == ')') { 
              numRight ++;
            } 
      }
      return -1;
   }

   static int findFirstRight (char[] letters) 
   {
       for (int i=0; i<letters.length; i++) { 
           if (letters[i] == ')') { 
              return i;
           }
       }
       return -1;
   }

   static int findFirstLeft (char[] letters, int k)
   {
       for (int i=k; 0<k; i--) {
           if (letters[i] == '(') {
           return i;
           }
       }
       return -1;
   }
 
}

public class MyCaesar2 { 

   public static void main (String[] argv) 
   { 
       char[] plain = {'a', 't', 't', 'a', 'c', 'k', 'a', 't', 'd', 'a', 'w', 'n'}; 
       int shift = 2; 

       char[] encrypted = caesarShift (plain, shift); 
       System.out.println ( Arrays.toString(encrypted) ); 

       char[] decrypted = caesarShift (encrypted, -shift); 
       System.out.println ( Arrays.toString(decrypted) ); 
   } 

   static char[] caesarShift (char[] text, int shift)
   { 
        int size = text.length;
        char[] new = new int [size]; 
    
        char[] new = shiftChar (
           



   } 

   static char shiftChar (char ch, int shift)
   { 
       int base = (int) 'a'; 
       int offset = (int) ch - base; 
       int shifted = (offset + shift + 26) % 26; 
       return (char) (base + shifted); 
   }

public class MyVigenere { 

   public static void main (String[] argv) 
   { 
       char[] plain = {'a', 't', 't', 'a', 'c', 'k', 'a', 't', 'd', 'a', 'w', 'n'}; 
 
       char[] key = {'b', 'a', 'd', 'c', 'a', 'f', 'e'}; 

       char[] encrypted = vigenereEncrypt (plain, key); 
       System.out.println ( Array.toString(encrypted) ); 
 
       char[] decrypted = vigenereDecrypt (encrypted, key); 
       System.out.println ( Arrays.toString(decrypted) ); 
   } 

   static char[] vignereEncrypt (char[] text, char[] key)
   { 
       int n = text.length; 

       char encrypted = new char [n]; 
       int[] shift = computeShifts (key, n); 
       
       for (int i=0; i<n; i++) { 
           encrypted[i] = shiftChar (text[i], shift[i]); 
       }

       return encrypted; 
   } 

   static char[] vignereDecrypt (char[] text, char[] key)
   { 
       int n = text.length;
       char[] decrypted = new char [n]; 
       int[] shift = computeShifts (key, n); 

       for (int i=0; i<n; i++) { 
           decrypted[i] = shiftChar (text[i], -shift[i]); 
       } 

       return decrypted; 
   } 

   static int[] computeShift (char[] key, char[] n)
   { 
       for (int i=0; i<key.length; i++) { 
           int 
                  

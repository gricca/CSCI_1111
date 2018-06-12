import java.util.*; 

public class MyCaesar { 

   public static void main (String[] argv)
   { 
       char[] plain = {'a', 't', 't', 'a', 'c', 'k', 'a', 't', 'd', 'a', 'w', 'n'}; 

       int shift = 2; 

       char[] encrypted = caesarEncrypt (plain, shift); 
       System.out.println ( Arrays.toString(encrypted) ); 

       char[] decrypted = caesarDecrypt (encrypted, shift); 
       System.out.println ( Arrays.toString(decrypted) ); 
   }

   static char[] caesarEncrypt (char[] text, int shift) 
   { 
       int n = text.length; 
       char[] encrypted = new char [n]; 
       int base = (int) 'a'; 

       for (int i=0; i<n; i++) { 
           int offset = (int) text[i] - base; 
           int shifted = (offset + shift) % 26; 
           encrypted[i] = (char) (base + shifted);
       } 

       return encrypted;
   }
  
   static char[] caesarDecrypt (char[] text, int shift)
   { 
       int n = text.length; 
       char[] decrypted = new char [n];
       int base = (int) 'a';

       for (int i=0; i<n; i++) {
           int offset = (int) text[i] - base;
           int shifted = (offset - shift) % 26;
           decrypted[i] = (char) (base + shifted);
       }

       return decrypted;
   }
}

public class MyTranspose { 

   public static void main (String[] argv) 
   { 
       char[] text = {'a', 't', 't', 'a', 'c', 'k', 'a', 't', 'd', 'a', 'w', 'n'}; 

       System.out.println ((transposeEncrypt (text)));
        

   } 

   static char[] transposeEncrypt (char[] text) 
   { 
       int n = text.length; 
       char[] encrypted = new char [n]; 

       int k = 0; 
       for (int i=0; i<n; i+=2) { 
           encrypted[k++] = text[i]; 
       } 

       
       int j = 0; 
       
       for (int i=1; i<n; i+=2) { 
           encrypted[j++] = text[i]; 
       }
       
       return encrypted;  
   }
}

public class MyCharExample3 {

   public static void main (String[] argv) 
   { 
       char[] word = {'d', 'e', 'r', 'e', 'f', 'e', 'r', 'e', 'n', 'c', 'e'};
       int ecount = 0; 

       for (int i=0; i<word.length; i++) { 
           if (word[i] == 'e') { 
              ecount ++;
           }
        
       }
       System.out.println (ecount); 
    }

}

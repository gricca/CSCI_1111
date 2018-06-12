public class MyCharExample2 { 

   public static void main (String[] argv) 
   {
       char[] word = {'a', 'l', 'o', 'h', 'a'}; 
       
       for (int i=0; i<word.length; i++) { 
            if (word[i] == 'a') { 
                System.out.println ("Found 'a'"); 
            }
       }
   }

}

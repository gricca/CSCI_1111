public class FirstLetters { 

   public static void main (String[] argv) 
   { 
       int N = IOTool.readIntFromTerminal ("Type here:" );
       String print = "";

       for (int i=1; i<=N; i++) {
           String noun = WordTool.getRandomNoun ();
           System.out.println ("Word #" + i + " is " + noun);
           char first = noun.charAt(0);
           
          // for (int j=0; j<i; j++) {
               print += first;    
               
        }
       System.out.println (print);
   }

}


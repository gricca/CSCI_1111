public class WordAnalysis {

   public static void main (String[] argv) 
   {
      int n = 1000;
      int totalnoun = 0;
      int totalverb = 0;

      for (int i=1; i<=n; i++) {
          String noun = WordTool.getRandomNoun ();
          int lengthnoun = noun.length ();
          totalnoun += lengthnoun;
          }
          int printnoun = totalnoun / n;
          System.out.println (printnoun);
       
      for (int i=1; i<=n; i++) {
          String verb = WordTool.getRandomVerb (); 
          int lengthverb = verb.length ();
          totalverb += lengthverb;
          }
          int printverb = totalverb / n;
          System.out.println (printverb); 
    }

} 

public class RandomSentence {

   public static void main (String[] argv)
   {
       String adj = WordTool.getRandomAdjective ();
       String noun = WordTool.getRandomNoun ();
       String noun2 = WordTool.getRandomNoun ();
       String verb = WordTool.getRandomVerb ();
       String prep = WordTool.getRandomPreposition (); 

       verb = verb + "ed";

       String sentence = "The " + adj + " " + noun + " " + verb + " " + prep + " a " + noun2;

       System.out.println (sentence); 
   }

} 


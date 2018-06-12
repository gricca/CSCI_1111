public class MyRandomSentence {

   public static void main (String[] argv)
   {
       String adj1 = WordTool.getRandomAdjective ();
       String noun1 = WordTool.getRandomNoun ();
       String verb1 = WordTool.getRandomVerb (); 
       String adv = WordTool.getRandomAdverb (); 
       String noun2 = WordTool.getRandomNoun ();
       String verb2 = WordTool.getRandomVerb ();      
       String adj2 = WordTool.getRandomAdjective ();

       String perfectsentence = "Rebel against " + adj1 + " " + noun1 + " " + "that " + verb1 + " " + adv + " " + "and fight " +  adj2 + " " + noun2;

       System.out.println (perfectsentence);
   }

}

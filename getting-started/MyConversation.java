public class MyConversation {
   public static void main (String[] argv)
   {
       String name = IOTool.readStringFromTerminal ("Hello! This is so embarrassing, but I forgot your name! Please type it here: ");

       System.out.println ("Oh, " + name + ", " + "of course! How are you doing today?");
       System.out.println ("Rate your mood on a scale of 1-5!");
       System.out.println ("1 is like waiting 30 minutes in line at Whole Foods, and 5 is like finding your favorite study spot open during finals.");

       int mood = IOTool.readIntFromTerminal ("Enter a value of 1-5 here: ");

       String noun = WordTool.getRandomNoun ();
       String adj = WordTool.getRandomAdjective ();
       String verb = WordTool.getRandomVerb ();
       String period = ".";
       String responsegood = "That's great! Well, here's a funny sentence to make your day even better! I love to " + verb + " with the " + adj + " " + noun + period;
       String responsebad = "Oh, no! Well, here's a funny sentence to cheer you up! I love to " + verb + " with the " + adj + " " + noun + period;
 
       for (int i=4; i<=mood; i+=2) {
           System.out.println (responsegood);
           }
 
      for (int i=3; mood<=i; i-=3) {
          System.out.println (responsebad);
          }
        
   }

}

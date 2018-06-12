import java.util.*;

public class MyBigWordAnalysis2 {

   static int numWords;

   public static void main (String[] argv)
   {
      int bigWordLength = 7;
      ArrayList<String> bigWords1 = getBigWords ("huckfinn.txt", bigWordLength);
      ArrayList<String> bigWords2 = getBigWords ("sherlockholmes.txt", bigWordLength);      

      for (String s: bigWords2) { 
          if (bigWords1.contains(s)) { 
             System.out.println (s); 
          } 
      }

   }

   static ArrayList<String> getBigWords (String filename, int wordSize)
   {
       IOTool.openFileByWord (filename);

       ArrayList<String> bigWords = new ArrayList<String> ();

       String w = IOTool.getNextWord ();
       numWords = 0;

       while (w != null) {
             numWords++;
             if (w.length() >= wordSize) {
                bigWords.add (w);
             }
             w = IOTool.getNextWord ();
       }

       return bigWords;
   }

}


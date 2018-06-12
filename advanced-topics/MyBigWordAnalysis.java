import java.util.*; 

public class MyBigWordAnalysis { 

   static int numWords; 

   public static void main (String[] argv) 
   { 
      int bigWordLength = 7; 
      ArrayList<String> bigWords = getBigWords ("sherlockholmes.txt", bigWordLength); 

      double fogIndex = (100 * (double) bigWords.size()) / numWords; 

      System.out.println ("# big words: " + bigWords.size()); 
      System.out.println ("fog index: " + fogIndex); 
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
   

import java.util.*;

public class ThreeLetters {
    
    public static void main (String[] argv)
    {
        threeLetterFinder("conserve");
    }
    
    public static int threeLetterFinder (String inputWord)
    {
        int permutations = 0; 
        int valid = 0;  
        
        ArrayList<String> words = WordTool.getUnixWordsAsList();
        ArrayList<String> save = new ArrayList<String>();
    
        for (int i= 0; i < inputWord.length(); i++) {
            for (int j = i+1; j < inputWord.length(); j++) {
                for (int k = j+1; k < inputWord.length(); k++) {
                   
                    char[] l = {inputWord.charAt(i), inputWord.charAt(j), inputWord.charAt(k)};
                    String m = new String(l); 
                     permutations ++;
                   
                    if (words.contains(m)) {
                        if (!save.contains(m)) {
                           save.add(m); 
                           valid ++;
                           System.out.println (m);

                        }
                        
                    }
                }
             }
        }
        System.out.println ("There are " +  valid + " three-letter subwords for '" + inputWord +"' out of " + permutations + " combinations");
        return 0;
    }
}

  


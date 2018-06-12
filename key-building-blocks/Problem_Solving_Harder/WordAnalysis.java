
public class WordAnalysis {

    public static void main (String[] argv)
    {
	String[] words = WordTool.getAllWords ();

	String longestMono = "";
	String longestUni = "";

	for (String w: words) {
	    // Call methods to see if w is monotonic, unimodal etc.

	    // If it's unimodal, is it longer than the longest so far?

	    // If it's monotonic, is it longer than the longest so far?
	}

	System.out.println ("Longest monotonic word: " + longestMono);
	System.out.println ("Longest unimodal word: " + longestUni);
    }

    // Methods ...

}

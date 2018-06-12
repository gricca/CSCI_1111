
public class VowelDensity {

    public static void main (String[] argv)
    {
	char[] vowels = {'a', 'e', 'i', 'o', 'u'};

	// First, English.
	String[] englishWords = WordTool.getUnixWords ();
	// Set up counters:
	int numVowels = 0;
	int numConsonants = 0;

	// Loop through all English words.
	for (int i=0; i<englishWords.length; i++) {
	    // For each word, we'll count the number of vowels:
	    int v = 0;
	    for (int j=0; j<englishWords[i].length(); j++) {
		// Compare the j-th letter with all vowels
		for (int k=0; k<vowels.length; k++) {
		    if ( vowels[k] == englishWords[i].charAt(j) ) {
			v++;
		    }
		}
	    }
	    numVowels = numVowels + v;
	    numConsonants = numConsonants + (englishWords[i].length() - v);
	    // Note: if the word length is N, there are N-v consonants.
	}
	
	double englishFraction  = (double) numVowels / (double) (numConsonants + numVowels);
	System.out.println ("Fraction for English: " + englishFraction);

	// Next, Klingon (without comments embedded)
	String[] klingonWords = WordTool.getKlingonWords ();
	numVowels = 0;
	numConsonants = 0;
	for (int i=0; i<klingonWords.length; i++) {
	    int v = 0;
	    for (int j=0; j<klingonWords[i].length(); j++) {
		for (int k=0; k<vowels.length; k++) {
		    if ( vowels[k] == klingonWords[i].charAt(j) ) {
			v++;
		    }
		}		    
	    }
	    numVowels = numVowels + v;
	    numConsonants = numConsonants + (klingonWords[i].length() - v);
	}

	double klingonFraction  = (double) numVowels / (double) (numConsonants + numVowels);
	System.out.println ("Fraction for Klingon: " + klingonFraction);

	// A 3rd language?
        // ...
    }

}

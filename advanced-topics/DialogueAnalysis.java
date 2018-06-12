
import java.util.*;

public class DialogueAnalysis {

    // CHANGE the numbers in here to the correct ones.
    static int openDouble = 8220;
    static int closeDouble = 8221;

    public static void main (String[] argv)
    {
	//IOTool.openFileByChar ("huckfinn.txt");
	IOTool.openFileByChar ("sherlockholmes.txt");
	//IOTool.openFileByChar ("textsample.txt");

	// Counters:
	int numCharInQuotes = 0;
	int numCharOutsideQuotes = 0;

	boolean inQuote = false;

	int k = IOTool.getNextChar ();

	while (k >= 0) {
              if (inQuote == true) {
                 numCharInQuotes++; 
                 if (k == closeDouble) { 
                    inQuote = false; 
                    //quoteData.add(numCharInQuotes); 
                    //numCharInQuotes = 0; 
                 }
                 }
                 else {
                      numCharOutsideQuotes++; 
                      if (k == openDouble) {
                      inQuote = true; 
                      //quoteData.add(numCharOutsideQuotes); 
                      //numCharOutsideQuotes = 0; 
                      }
 
                 }
            

	    k = IOTool.getNextChar ();
	}
	System.out.println ("In quotes:      " + numCharInQuotes);
	System.out.println ("Outside quotes: " + numCharOutsideQuotes);
    }

}

// to build histogram 

//for (int x : quoteData) { 
     // if ( x > max)
     // max = x; 
  //}
 // hist[max + 1]
  //for (int y : quoteData) 
     // hist[y]++; 

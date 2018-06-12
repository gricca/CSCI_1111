
import java.util.*;

public class DialogueAnalysis2 {

    // CHANGE the numbers in here to the correct ones.
    static int openDouble = 8220;
    static int closeDouble = 8221;

    static ArrayList<Integer> quoteData;

    public static void main (String[] argv)
    {
	// First analyze the text to pull out the dialogue-length data.
	analyzeText ("sherlockholmes.txt");

	// Build a histogram:
	int[] histogram = makeHistogram (quoteData);

	// Then plot part of the histogram:
	plotHistogram (histogram, 100);
    }

    static void analyzeText (String filename)
    {
	IOTool.openFileByChar (filename);

	// Counters:
	int numCharInQuotes = 0;
	int numCharOutsideQuotes = 0;

	// Initialize list to contain data.
	quoteData = new ArrayList<Integer> ();

	boolean inQuote = false;
	int quoteLength = 0;

	int k = IOTool.getNextChar ();

	while (k >= 0) {
               if (inQuote == true) {
                 numCharInQuotes++; 
                 if (k == closeDouble) { 
                    inQuote = false; 
                    quoteData.add(numCharInQuotes); 
                    numCharInQuotes = 0;
                 }
                 }
                 else {
                      numCharOutsideQuotes++; 
                      if (k == openDouble) {
                      inQuote = true; 
                      quoteData.add(numCharOutsideQuotes); 
                      numCharOutsideQuotes = 0; 
                      }
 
                 }

	    k = IOTool.getNextChar ();
	}
	
	System.out.println ("In quotes:      " + numCharInQuotes);
	System.out.println ("Outside quotes: " + numCharOutsideQuotes);
    }

    static int[] makeHistogram (ArrayList<Integer> data)
    {
	// INSERT YOUR CODE HERE.

	// First find the maximum value in the data (in max)
	int max = 0;
	// INSERT code for finding max here.
        for (int x : quoteData) { 
            if ( x > max) {  
               max = x; 
            }
        }

	// Make an array at least that large.
	int[] hist = new int [max+1];

        // Then scan the data and build the histogram.
	// INSERT the building of the histogram here.
        
        //hist [max + 1];
        for (int y : quoteData) { 
            hist[y]++;
         } 

	// Return the histogram
	return hist;
    }

    static void plotHistogram (int[] hist, int n)
    {
	// Plot the first n entries of the histogram
	int height = 0;
	for (int i=0; i<n; i++) {
	    if (hist[i] > height) {
		height = hist[i];
	    }
	}

	DrawTool.display ();
	DrawTool.setXYRange (0,n, 0,height);
	for (int i=0; i<n; i++) {
	    DrawTool.drawRectangle (i-1,hist[i], 1,hist[i]);
	}
    }

}

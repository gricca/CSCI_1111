public class five { 

    public static void main (String[] argv)
    {
	String[] words = WordTool.getAllWords ();
        String longestMono = "";
	String longestUni = "";

        int n = words.length;
        int max = 0; 
        int max2 = 0;        
	for (String w: words) {
             System.out.println (w);
             boolean isUni = isUnimodal (w); 
             System.out.println ("isUnimodal=" + isUni);
             if (isUni && n > max) { 
                max = n; 
                longestUni = w;
             } 
             boolean isMono = isMonotonic (w);
             System.out.println ("isMonotonic=" + isMono);
             if (isMono && n > max2) {
                max2 = n;
                longestMono = w;
             }
	}

	System.out.println ("Longest monotonic word: " + longestMono);
	System.out.println ("Longest unimodal word: " + longestUni);
    }

    static boolean isUnimodal (String w) 
   { 
       char[] y = w.toCharArray ();
       int unimodal = 0;
       for (int i=1; i<y.length-1; i++) { 
           if ( (y[i] >  y[i+1]) && (y[i] > y[i-1]) || (y[i] <  y[i+1]) && (y[i] < y[i-1])) { 
              unimodal++;
           } 
       }       
       if ( (unimodal !=0) ) { 
          return true;
       }
       return false; 
   }                   
       

   static boolean isMonotonic (String w) 
   { 
      char[] y = w.toCharArray ();
      if (y.length <= 2) { 
         return true; 
   }
   boolean increasing = true; 
   boolean decreasing = true; 
   for (int i=1; i<y.length; i++) { 
       if (y[i-1] > y[i]) { 
          increasing = false;
       }
       else if (y[i-1] < y[i]) { 
          decreasing = false; 
       }
       if (!increasing && !decreasing) { 
          return false; 
       }
    }
    return true;
  }
  
}

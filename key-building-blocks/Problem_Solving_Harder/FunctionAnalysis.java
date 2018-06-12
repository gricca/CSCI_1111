
public class FunctionAnalysis {

    public static void main (String[] argv)
    {
	int N = 20;
	double interval = 10.0 / N;
	double[] x = new double [N];
	for (int i=0; i<N; i++) {
	    x[i] = i*interval;
	}

	// Change function1 to function2, up through function5
	double[] y = function4 (x);

	boolean isMono = isMonotonic (y);
	System.out.println ("isMonotonic=" + isMono);

	boolean isUni = isUnimodal (y);
	System.out.println ("isUnimodal=" + isUni);

        boolean isNeither = isNeither (y); 
        System.out.println ("isNeither=" + isNeither); 
    }

   static boolean isUnimodal (double[] y) 
   { 
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

   static boolean isMonotonic (double[] y) 
   { 
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

  static boolean isNeither (double[] y)
  { 
     if (!isMonotonic (y) && !isUnimodal (y)) { 
        return true;
     }
     return false;
  }


    static double[] function1 (double[] x)
    {
	// Monotonic increasing
	double[] y = new double [x.length];
	for (int i=0; i<x.length; i++) {
	    y[i] = 0.2 * x[i] + 5.0 - 1.0 / Math.sqrt(x[i]);
	}
	return y;
    }

    static double[] function2 (double[] x)
    {
	// Unimodal "up"
	double[] y = new double [x.length];
	for (int i=0; i<x.length; i++) {
	    y[i] = 8.0 - 0.3 * Math.pow (5.0 - x[i], 2);
	}
	return y;
    }

    static double[] function3 (double[] x)
    {
	// Neither monotonic nor unimodalUp
	double[] y = {2, 1, 2, 3, 4, 5};
	return y;
    }

    static double[] function4 (double[] x)
    {
	// Not monotonic but unimodalUp
	double[] y = {2, 3, 4, 5, 7, 6};
	return y;
    }



}

public class FunctionExamples {

    public static void main (String[] argv)
    {
	// Number of points:
	int N = 20;

	// Make N evenly spaced x values on x axis:
	double interval = 10.0 / N;
	double[] x = new double [N];
	for (int i=0; i<N; i++) {
	    x[i] = i*interval;
	}
	
	DrawTool.display ();
	DrawTool.setXYRange (0, 10, 0, 10);

	// Plot function1
	double[] y = function1 (x);
	for (int i=0; i<x.length; i++) {
	    DrawTool.drawPoint (x[i], y[i]);
	}

	// Plot function2
	DrawTool.setPointColor ("blue");
	y = function2 (x);
	for (int i=0; i<x.length; i++) {
	    DrawTool.drawPoint (x[i], y[i]);
	}

    }


    static double[] function1 (double[] x)
    {
	double[] y = new double [x.length];
	for (int i=0; i<x.length; i++) {
	    y[i] = 0.2 * x[i] + 5.0 - 1.0 / Math.sqrt(x[i]);
	}
	return y;
    }

    static double[] function2 (double[] x)
    {
	double[] y = new double [x.length];
	for (int i=0; i<x.length; i++) {
	    y[i] = 8.0 - 0.3 * Math.pow (5.0 - x[i], 2);
	}
	return y;
    }

}

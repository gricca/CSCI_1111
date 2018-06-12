
public class FunctionExample {

    public static void main (String[] argv)
    {
	DrawTool.display ();
	DrawTool.setXYRange (0, 10, -2, 2);
	DrawTool.setPointColor ("Blue");

	// 20 points along the x-axis between 0 and 10
	int N = 100;
	double spacing = 10.0 / N;
	for (double x=0; x<=10; x+=spacing) {
	    // Compute f at the x-value of x
	    double f = Math.sin (x);
	    System.out.println ("x=" + x + " f=" + f);
	    // Plot the point x, f(x)
	    DrawTool.drawPoint (x, f);
	}
    }

}

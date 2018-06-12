
public class RandomWalk2D {

    public static void main (String[] argv)
    {
	DrawTool.display ();
	DrawTool.setXYRange (0,10, 0,10);
	DrawTool.startAnimationMode ();

	double x=5, y=5;
	int numSteps = 0;

	while ( (x>=0) && (x<=10) && (y>=0) && (y<=10) ) {

	    DrawTool.drawCircle (x,y,0.1);
	    DrawTool.animationPause (500);

	    double r = Math.random ();
             if ((r > 0.0) && (r < 0.25)) { 
                y ++;
             } 
             if ((r > 0.25) && (y < 0.5)) { 
                y --; 
             } 
             if ((r > 0.5) && (y < 0.75)) { 
                x ++; 
             } 
             else { 
                  x --; 
             }

	    numSteps++;
	}

	DrawTool.endAnimationMode ();
	System.out.println ("#steps=" + numSteps);
    }

}


public class SimulationStudy {

    public static void main (String[] argv)
    {
	//study1 ();
	study2 ();
    }

    static void study1 ()
    {
	// This study should plot the average #steps to infect
	// half the population as the population N various
	// between 10 and 100 (steps of 10). Use a 1000 samples
	// for each data point. Because there are 10 data points,
	// put these in an array.
	DrawTool.display ();
	DrawTool.setXYRange (0,100, 0, 100);
	double[] population = new double [10];
	double[] avgSteps = new double [10];

           // Simulation mysim = new Simulation(); 

            int k = 0; 
            for (int N=10; N<=100; N+=10) { 
		int numSamples = 1000;
                double total = 0;

                for (int j=0; j<=numSamples; j++) {
                    total += Simulation.simulateNumSteps(N, 0.5, N/2);
                }   
            double avg = total / numSamples;            
	    population[k] = N;  avgSteps[k] = avg;
	    k++;
            System.out.println (N + " and " + avg); 
	    }

	// Plot the results:
	DrawTool.drawCurve (population, avgSteps);
    }

    static void study2 ()
    {
	// This study will use a fixed population of 10 particles.
	// It will study the number infected as the number of steps
	// increases from 10 to 100 in steps of 10.
	DrawTool.display ();
	DrawTool.setXYRange (0,100, 0, 10);
	double[] numSteps = new double [10];
	double[] numInfected = new double [10];

	// Perform the simulations.
	int k=0;
	int numParticles = 10;
	for (int nSteps=10; nSteps<=100; nSteps+=10) {
            int numSamples = 1000;
            double total = 0;
            for (int j=0; j<=numSamples; j++) {
                    total += Simulation.simulateNumInfected(numParticles, 0.5, nSteps);
            }

	    double avg = total / numSamples;
	    numSteps[k] = nSteps;  numInfected[k] = avg;
	    k++;
	}

	// Plot the results.
	DrawTool.drawCurve (numSteps, numInfected);
    }

}


public class MakeSquares {

    public static void main (String[] argv)
    {
	for (int i=1; i<=2; i++) {
		printProgram();
           
        }
    }

    public static void newLine ()
    {
        System.out.println ();
    }

    public static void printSixStars ()
    {
        System.out.print ("******");
    }

    public static void printSixSpaces ()
    {
        System.out.print ("      ");
    }
   
    public static void printOdd () 
    {
	for (int i=1; i<=4; i++) {
 	    printSixStars (); 
            printSixSpaces (); 
            printSixStars (); 
	    newLine ();
	 } 
    }

    public static void printEven ()
    { 
        for (int i=1; i<=4; i++) {
            printSixSpaces (); 
	    printSixStars (); 
	    printSixSpaces ();
	    printSixStars ();  
	    newLine ();
	} 
    }

    public static void printProgram ()
    {
	printOdd (); 
	printEven (); 
    } 
}

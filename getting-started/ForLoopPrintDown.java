public class ForLoopPrintDown { 

   public static void main (String[] argv)
   { 
	for (int i=5; 1<=i; i--) {
	    for (int j=0; j<i; j++) {
		System.out.print (i); 
	    }
	    System.out.println (); 
	}
    }
}

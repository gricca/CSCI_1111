public class BiggerList {

   public static void main (String[] argv) 
   {        

       int N = IOTool.readIntFromTerminal ("Type here: "); 

       for (int i=1; i<N; i++) {
            System.out.print ("Numbers bigger than " + i + ": ");

           for (int j=i+1; j<=N; j++) {
                System.out.print (j);

           }
           System.out.println ();
       }
    }
}


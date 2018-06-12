import java.util.*;
import java.io.*;

public class LineAverages {

    public static void main (String[] argv)
    {
        
        
        try {
            Scanner fileScanner = new Scanner (new File ("data1.txt"));
         
            double sum = 0;
            while (fileScanner.hasNextLine()) {
            String s = fileScanner.nextLine();

               String[] stringArray = s.split(" ");
               double[] doubleArray = new double[stringArray.length];
               for (int n=0; n<stringArray.length; n++) {
                    Scanner stringScanner = new Scanner (s);
                    double x1 = Double.parseDouble(stringArray[n]);
                       sum = sum + x1;
               }
               double avg = sum / stringArray.length;
                     
                     System.out.println ("Average= " + avg + " for " + Arrays.toString(stringArray));
                     sum = 0;
    
           }
            
            
            fileScanner = new Scanner (new File("data1.txt"));
        }
        catch (IOException e) {
        }
    }

}


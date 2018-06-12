import java.util.*;
import java.io.*; 

public class MyFileExample2 { 

   public static void main (String[] argv) 
   { 
       try { 
           Scanner fileScanner = new Scanner (new File ("file2.data")); 
           int n = fileScanner.nextInt (); 
           double[] x = new double [n]; 
           double [] y = new double [n]; 
           while (fileScanner.hasNextInt()) { 
                 double x = fileScanner.nextDouble (); 
                 double y = fileScanner.nextDouble (); 
                 x[i] = x1; 
                 y[i] = y1; 
                 System.out.println ("Point: (" + x1 + "," + y1 + ")"); 
           } 
       }
       catch (IOException e) { 
       } 
   }
}

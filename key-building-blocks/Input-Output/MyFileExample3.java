import java.util.*; 
import java.io.*; 

public class MyFileExample3 { 

   public static void main (String[] argv) 
   { 
       try {
           Scanner fileScanner = new Scanner (new File ("file3.data")); 
     
           int n = 0; 
           while (fileScanner.hasNextLine()) { 
                 String s = fileScanner.nextLine (); 
                 n++; 
                 System.out.println (s);
           } 

           double[] x = new double [n]; 
           double[] y = new double [n]; 

           fileScanner = new Scanner (new File ("file3.data")); 
           int i = 0; 
           for (i=0; i<n; i++) { 
                 String s = fileScanner.nextLine ();
                 Scanner stringScanner = new Scanner (s); 
                 double x1 = stringScanner.nextDouble (); 
                 double y1 = stringScanner.nextDouble (); 
                 x[i] = x1; 
                 y[i] = y1;
                 System.out.println ("Point: (" + x1 + "," + y1 + ")"); 
                 i++;
                 System.out.println (s);    
          }
      }
      catch (IOException e) { 
      }
   } 
}
     

import java.util.*;

public class OddArray {

   public static void main (String[] argv)
   { 
      int[] odds = makeConsecutiveOdds (5); 
      System.out.println (Arrays.toString(odds)); 
   }

   static int[] makeConsecutiveOdds (int n)
   { 
       int[] newodds = new int [n]; 
       
       int odd = 1; 
       for (int i=0; i<=n-1; i++) { 
           newodds[i] = odd; 
           odd+=2; 
       }
       return newodds;
   }
}

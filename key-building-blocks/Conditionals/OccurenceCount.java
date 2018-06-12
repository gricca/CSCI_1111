public class OccurenceCount { 

   public static void main (String[] argv) 
   { 
       int[] A = {2, 9, 2, 6, 4, 3, 3, 2}; 
       int max = 9; 
       int [] occurenceCount = new int [max+1]; 
       for (int i=0; i<A.length; i++) { 
           occurenceCount[A[i]] ++; 
       } 
       for (int k=0; k<occurenceCount.length; k++) { 
           if (occurenceCount[k] > 0) { 
               System.out.println (k + " occurs " + occurenceCount[k] + " times"); 
           }
       }
   }

}

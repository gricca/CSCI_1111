public class Ex1_47 { 

   public static void main (String[] argv) 
   { 
       int[] A = {7, -6, -5, 4, 3, 2, -1}; 

       for (int i=A.length-1; i>0; i--) {
           if (A[i] > 0) { 
               System.out.println (A[i]); 
           } 
       }
   }

} 

import java.util.*; 

public class Array2D { 

   public static void main (String[] argv)
   { 
      int[][] A = {
          {1,2,3,4,5},
          {2,3,4,1,6},
          {3,4,1,2,7}, 
          {4,1,2,3,8}
      };
      
      System.out.println (arraySum2D(A,1,2)); 
   }

   static int arraySum2D (int[][] A, int row, int col)
   { 
      int sumrow = 0; 
      int sumcol = 0;    

      for (int i=0; i<A[0].length; i++) {
          sumrow+= A[row][i];
      }
      for (int j=0; j<A.length; j++) { 
           sumcol += A[j][col]; 
      }
      int total = sumrow + sumcol;
      return total; 
   }
}

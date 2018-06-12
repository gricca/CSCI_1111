public class StrangeAverage2D { 

   public static void main (String[] argv) 
   { 
       double[][] A = { 
           {0,1,0,1,0,1}, 
           {1,0,1,0,1,0},
           {0,1,0,1,0,1}
       }; 
   
       print (strangeAverage(A)); 

       double[][] A2 = { 
           {1,2,3,4}, 
           {5,6,7,8}, 
           {9,10,11,12}, 
           {13,14,15,16}
       }; 

       print (StrangeAverage(A2)); 
   }

   static void print (double[][] A) 
   { 
       for (int i=0; i<A.length; i++) { 
           for (int j=0; j<A[i].length; j++) { 
               System.out.printf (" %6.3f", A[i][j]); 
           }
           System.out.println (); 
       }
   }

   public static double[][] strangeAverage (double[][] A)
   { 
      double[][] B = new double [A.length][A[0].length]; 

      for (int i=0; i<A.length; i++) { 
          for (int j=0; j<A.length; j++) { 
              B[i][j] = boxAverage (A, i, j); 
          }
      }

      return B; 
   }

   static double boxAverage (double[][] A, int i, int j) 
   { 
       double sum = 0; 
       double average = 0;
       double count = 0;
       
       for (int m=i-1; m<=i+1; m++) { 
           for (int n=j-1; n<=j+1; n++) {
               if (isValidElement (A,m,n) ) {  
                   sum += (A[m][n]);
                   count++; 
               }
           }
       }
 
       average = sum / count; 
       return average; 
   }

   static void boolean isValidElement (double[][] A, int m, int n)
   { 
       for (int m=i-1; m<i

}

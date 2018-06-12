import java.util.*; 

public class DivisibleExercise { 

   public static void main (String[] argv)
   { 
       int[] A = {1, 4, 5, 10, 11, 15, 12, 10};
       int[] B = copyOverDivisibleBy5 (A); 
      
       System.out.println (Arrays.toString(B)); 
   }

   static int[] copyOverDivisibleBy5 (int[] A) 
   { 
       int size = 0; 

       for (int i=0; i<A.length; i++) { 
           if (A[i]%5 == 0) { 
              size++;
           }
       }
   
       int[] newarray = new int [size]; 

       int m = 0;        
       for (int i=0; i<A.length; i++) { 
               if (A[i]%5 == 0) { 
                  newarray[m] = A[i];
                  m++;  
               }
       }
       return newarray;      
   }
}

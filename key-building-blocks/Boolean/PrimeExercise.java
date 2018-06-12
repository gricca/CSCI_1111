public class PrimeExercise { 

   public static void main (String[] argv) 
   { 
       int n = 100;
       boolean[] isPrime = new boolean [n+1]; 

       for (int i=1; i<=n; i++) { 
           isPrime[i] = true; 
       }

       for (int i=3; i<=n; i++) { 
           if ((i % 2 == 0) || (i % 3 == 0)) { 
               isPrime[i] = false; 
           }
       }        

       int count = 0; 
       for (int i=3; i<=n; i++) { 
            if (isPrime[i]) {
                count ++;
            }
       }
          
       System.out.println (count);
   }

}

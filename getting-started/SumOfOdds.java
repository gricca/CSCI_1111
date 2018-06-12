public class SumOfOdds { 

   public static void main (String[] argv)
   { 
      int s = 0;
      for (int N=1; N<=10; N++) { 
           for (int i=1; i<=N; i++) {
                s = s + (2*i - 1);
            }
            System.out.println (s);
      } 
   }

}

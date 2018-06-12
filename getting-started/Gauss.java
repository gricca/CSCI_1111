public class Gauss { 

   public static void main (String[] argv)
   {

      int n = 10; 
      int s = 0; 
      int d = 0; 
 
      for (int i=1; i<=n; i++) {
          int a = i; 
          int b = n-i+1;
          d = d + (a + b);

          s = s + i; 
      }

      System.out.println (s); 
      System.out.println (d/2);

      int f = n*(n+1)/2;
      System.out.println (f);
   }

}

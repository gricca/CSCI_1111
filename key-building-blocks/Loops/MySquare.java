public class MySquare { 

   public static void main (String[] argv)
   { 
      int i = 0; 
      for (i=0; i*i<1000; i++) { 
          i++;
      } 
      System.out.println (i*i);
   }
}

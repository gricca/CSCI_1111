public class NullExample { 

   static int[] A; 

   public static void main (String[] argv) 
   {
      print (A); 
   }

   static void print (int[] B)
   {
       for (int i=0; i<B.length; i++) { 
           System.out.println (B[i]); 
       }
   }

}

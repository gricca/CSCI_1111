public class CharExample3 {

   public static void main (String[] argv)
   {
       char first = 'a';

       int i = (int) first; 
       System.out.println (i); 

       int j = i+2;

       char third = (char) j;

       System.out.println (third);
   }

}

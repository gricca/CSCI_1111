public class FirstLast3 {

   public static void main (String[] argv)
   {
       String[] words = WordTool.getUnixWords ();
       int n = 0;

       for (String w: words) {
           int lastIndex = w.length() - 1;
           int secondlastIndex = w.length() - 2;
           int thirdlastIndex = w.length() - 3; 
           if ( (w.charAt(0) == w.charAt(lastIndex)) && (w.charAt(1) == w.charAt(secondlastIndex)) && (w.charAt(2) == w.charAt(thirdlastIndex))  ) {
              System.out.println (w);
              n++;
           }
       }
   }
}

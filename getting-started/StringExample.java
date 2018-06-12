public class StringExample {

   public static void main (String[] argv)
   {
      String s = "The quick brown fox jumps over the lazy dog";
      System.out.println (s);

      int k = s.length (); 
      System.out.println (k);

      char c = s.charAt(0);
      System.out.println (c);

      String s1 = "The";
      String s2 = "quick";
      String s3 = s1 + s2;

      String s4 = "brown";
      String s5 = s1 + " " + s2 + " " + s4;
      System.out.println (s5); 

      String allLetters = "";
      for (char ch='a'; ch<='z'; ch++) {
          allLetters = allLetters + ch;
      }
      System.out.println ("The alphabet: " + allLetters);

      String num1to10 = "";
      for (int i=1; i<=10; i++) {
          num1to10 = num1to10 + " " + i;
      }
      System.out.println ("Numbers 1 to 10: " + num1to10);
  }

}

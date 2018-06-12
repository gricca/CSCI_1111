public class MyStringArray3 { 

   public static void main (String[] argv) 
   {
       String[] someStrings = {"alfafa", "river", "edge", "nope"};
       
       for (int i=0; i<someStrings.length; i++) {
           int L = someStrings[i].length(); 
              if (someStrings[i].charAt(0) == someStrings[i].charAt(L-1)) { 
                  System.out.println (someStrings[i]); 
               }
           }
   }

}

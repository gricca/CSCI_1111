public class MyWordSquare { 

   public static void main (String[] argv)
   { 
       String[] words = {"bard", "area", "rear", "dart"}; 
       System.out.println ( isWordSquare(words) ); 
   } 
  
   static boolean isWordSquare (String[] w) 
   {
       boolean isWordSquare = true; 
       for (int i=0; i < w.length; i++) { 
           for (int j=0; j < w.length; j++) { 
              if (w[i].charAt(j) != w[j].charAt(i)) {
                 isWordSquare = false; 
              }
           }
       }
       if (isWordSquare == true) {  
           System.out.println ("This is a word square!"); 
        }
        else if (isWordSquare == false) { 
           System.out.println ("This is not a word square!");
        }
        return isWordSquare;
    }
}
        
   

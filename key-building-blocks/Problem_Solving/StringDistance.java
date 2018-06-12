public class StringDistance { 

   public static void main (String[] argv) 
   { 
       String a = "bold"; 
       String b = "bald";
       String c = "boy";  
       String d = "old"; 
       distance (a, b); 
       distance (a, c);
       distance (a, d);  

   }

   static int distance (String a, String b)
   { 
      int min = Math.min (a.length(), b.length()); 
      int max = Math.max (a.length(), b.length()); 

      int mismatches = 0; 
      for (int i=0; i<min; i++) { 
          if ( a.charAt(i) != b.charAt(i) ) { 
             mismatches ++; 
          } 
      } 

      mismatches += (max - min); 

     return mismatches; 
   }
}

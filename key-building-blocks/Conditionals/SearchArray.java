public class SearchArray { 

   public static void main (String[] argv) 
   {
       int[] A = {-5, 2, 3, -9, 12, 4, -30};

       int searchItem = 4; 

       int present = 0; 
       for (int i=0; i<A.length; i++) {
           if (A[i] == searchItem) {
              present  ++; 
            }
           
          } 
          if (present > 0) { 
             System.out.println ("Yes, " + searchItem + " exists in the array");
           
          }
          else {
               System.out.println ("Heck, no. " + searchItem + " is not in the array");
            }
    }
}

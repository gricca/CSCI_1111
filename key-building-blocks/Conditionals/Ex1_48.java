public class Ex1_48 { 

   public static void main (String[] argv) 
   { 
       int[] A = {7, -6, -5, 4, 3, 2, -1}; 
       int searchValue = 4; 
       boolean found = false;
 
       for (int i=0; i<A.length; i++) { 
           if (A[i] == searchValue) { 
               found = true;
           }

        } 

        if (found == true) { 
            System.out.println ("True"); 
        }
        else { 
             System.out.println ("Not found"); 
        }
   }
}

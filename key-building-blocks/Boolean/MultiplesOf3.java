public class MultiplesOf3 { 

   public static void main (String[] argv) 
   { 
       int[] someNumbers = {1, 4, 9, 16, 26}; 

       boolean containsMultiplesOf3 = false; 
       for (int i=0; i<someNumbers.length; i++) { 
            if (someNumbers[i] % 3 == 0) { 
                containsMultiplesOf3 = true;
                }
             }
        
        if (containsMultiplesOf3) { 
            System.out.println ("This array has multiples of 3");
            }
    }

}

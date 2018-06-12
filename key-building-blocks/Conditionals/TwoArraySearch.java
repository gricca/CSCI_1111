public class TwoArraySearch { 

   public static void main (String[] argv) 
   { 
       int[] recentData = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19}; 
       int[] existingData = {2, 3, 5, 7, 11, 13, 17, 19}; 

       for (int i=0; i<recentData.length; i++) { 
           for (int j=0; j<existingData.length; j++) { 
               if (recentData[i] == existingData[j]) {
                   System.out.println (existingData[j]);
                   }
            }
        }
   }

}

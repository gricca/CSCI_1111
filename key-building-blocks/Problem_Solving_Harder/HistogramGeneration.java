public class HistogramGeneration { 

   public static void main (String[] argv) 
   { 
       double[] data = {8.5, 6.6, 2.7, 2.1, 9.4, 0.9, 2.1, 6.2, 8.3, 1.2, 2.2, 0.3, 9.3, 2.6, 3.8, 2.5, 6.8, 8.1, 8.8, 9.5, 1.8, 8.2, 1.5, 2.9, 8.9, 3.1, 2.9, 4.6}; 
       countarray (data);
   }

   static void countarray (double[] data)
   { 
       int zerotoone = 0;
       int onetotwo = 0;
       int twotothree = 0;
       int threetofour = 0;
       int fourtofive = 0;
       int fivetosix = 0;
       int sixtoseven = 0;
       int seventoeight = 0;
       int eighttonine = 0;
       int ninetoten = 0;

       for (int i=0; i<data.length; i++) { 
           if ( (0 <= data[i]) && (data[i] <= 1) ) { 
              zerotoone ++;
             // System.out.println (zerotoone); 
           }
           if ( (1 <= data[i]) && (data[i] <= 2) ) { 
              onetotwo ++;
             // System.out.println (onetotwo);
           }
           if ( (2 <= data[i]) && (data[i] <= 3) ) { 
              twotothree ++;
             // System.out.println (onetotwo);
           } 
           if ( (3 <= data[i]) && (data[i] <= 4) ) { 
              threetofour ++;   
             // Count's seem to be right, no no more prints
           } 
           if ( (4 <= data[i]) && (data[i] <= 5) ) { 
              fourtofive ++; 
           }
           if ( (5 <= data[i]) && (data[i] <= 6) ) { 
              fivetosix ++;
           }
           if ( (6 <= data[i]) && (data[i] <= 7) ) { 
              sixtoseven ++;
           } 
           if ( (7 <= data[i]) && (data[i] <= 8) ) { 
              seventoeight ++;
           }
           if ( (8 <= data[i]) && (data[i] <= 9) ) { 
              eighttonine ++;   
           } 
           if ( (9 <= data[i]) && (data[i] <= 10) ) { 
              ninetoten ++; 
           } 
      }
      int[] countarray = {zerotoone, onetotwo, twotothree, threetofour, fourtofive, fivetosix, sixtoseven, seventoeight, eighttonine, ninetoten}; 

       DrawTool.display (); 
       for (int i=0; i<countarray.length; i++) { 
           DrawTool.drawRectangle (0.2 + i, countarray[i], .7, countarray[i]);
       }
   }
}

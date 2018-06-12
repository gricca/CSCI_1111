public class MyBrownian { 

   static int N = 10; 
   static int x = 5, y = 5; 
   static int[][] grid = new int [N][N];

   public static void main (String[] argv)
   { 
       grid[x][y] = 1; 
       int numSteps = 0; 
     
       while (numSteps < 100) { 
             numSteps++; 
             moveRandom (); 
             print (numSteps); 
       } 
   } 

   static void print (int numSteps) 
   { 
       System.out.println ("After " + numSteps + ": "); 
       
       for (int y=grid[0].length-1; y>=0; y--) { 
           for (int x=0; x<grid.length; x++) { 
               System.out.printf (" %1d", grid[x][y]);
           }
           System.out.println (); 
       }
   }
   
   static void moveRandom ()
   { 
       int nextX = x, nextY = y; 
       
       double r = Math.random (); 

       if (r < 10) { 
          nextX++; 
          nextY++;
       }        

       if ( (nextX >= 0) && (nextX < N) && (nextY >= 0) && (nextY < N) ) { 
          grid[x][y] = 0; 
          grid[nextX][nextY] = 1; 
          x = nextX; y = nextY; 
      }
   }
}

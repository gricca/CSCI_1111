public class TouchingTriangles { 

  public static void main (String[] argv)
  { 
     // Left side triangle 
     // i is rows
     // j is number of *
     for (int i=1; i<=11; i++) {
        for (int j=0; j<i; j++) {
           System.out.print ("*"); 
          }
        System.out.println (" "); 
      }

      // Right side triangles 
      // can't use i, k is rows
      // j is number of spaces/*
      for (int k=1; k<=11; k++) {
         for (int j=1; j<=11-k; j++) {
            System.out.print (" "); 
           }
         for (int j=1; j<=k; j++) {
            System.out.print ("*"); 
           }
        System.out.println (" ");
      }
   }
}
// this is the closest i ever got. Managed to make the right triangle,
// but was unable to put them together.  

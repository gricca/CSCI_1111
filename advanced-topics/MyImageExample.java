public class MyImageExample { 

   public static void main (String[] argv) 
   { 
       ImageTool imTool = new ImageTool (); 
       int[][] pixels = imTool.imageFileToGreyPixels ("eniac.jpg"); 
       imTool.showImage (pixels, "ENIAC"); 

       System.out.println ("Image size: " + pixels.length + " by " + pixels[0].length); 

       int N = 10; 
       
       for (int i=0; i<N; i++) { 
           for (int j=0; j<N; j++) { 
                //System.out.println("i = " + i + "j = " + j);
		pixels[i][j] = 255;
                //System.out.printf (" %3d", pixels[i][j]);
           }
           System.out.println ();
       }
       imTool.showImage (pixels, "ENIAC"); 
   }
}

public class FunctionData {

   public static void main (String[] argv)
   {
       DrawTool.display ();
       DrawTool.setXYRange (0, 110, 0, 20000);

       double x = 8.33;
       double f = 1666.67;
       DrawTool.drawPoint (x,f);

       x = 22.2; f = 3666.67;
       DrawTool.drawPoint (x,f);

       x = 23.61; f = 4833.33;
       DrawTool.drawPoint (x,f);

       x = 30.55; f = 5000;
       DrawTool.drawPoint (x,f);

       x = 36.81; f = 5166.67;
       DrawTool.drawPoint (x,f);

       x = 47.22; f = 8000;
       DrawTool.drawPoint (x,f);

       x = 69.44; f = 11333.33;
       DrawTool.drawPoint (x,f);

       x = 105.56; f = 19666.67;
       DrawTool.drawPoint (x,f);
 
       DrawTool.drawLine (0,0, 110, 190*110);

   }

}

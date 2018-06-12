public class Area {

   public static void main (String[] argv)
   {
       Double radius = IOTool.readDoubleFromTerminal ("Hi! To find the area of your circle, type its radius here: ");  
       Double pi = 3.14159;

       double area = pi * (radius*radius);
       System.out.println (area);

   }

}

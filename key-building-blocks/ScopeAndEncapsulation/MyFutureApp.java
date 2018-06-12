public class MyFutureApp { 

   public static void main (String[] argv) 
   { 
       int[] A = {9, 4, 1, 16, 25}; 
       ArrayTool.print (A); 
       int sum = ArrayTool.findSum (A);
       System.out.println ("The sum of the array is: " + sum);
   }
}

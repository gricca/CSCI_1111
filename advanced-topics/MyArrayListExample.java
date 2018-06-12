import java.util.*; 

public class MyArrayListExample { 

   public static void main (String[] argv) 
   { 
       IOTool.openFileByChar ("macbeth.txt"); 

       ArrayList<Character> anySizeList = new ArrayList<Character> (); 
  
       int k = IOTool.getNextChar (); 
       while (k >= 0) { 
             char c = (char) k; 
             anySizeList.add (c); 
             k = IOTool.getNextChar (); 
       }

       for (char c: anySizeList) { 
           System.out.print (c); 
       } 
       System.out.println (); 
       System.out.println (anySizeList.size() + " chars in file"); 

   }
}

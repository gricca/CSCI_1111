public class MyArrayExample { 

   public static void main (String[] argv)
   { 
       IOTool.openFileByChar ("macbeth.txt"); 
 
       char[] fixedSizeArray = new char [1000]; 

       int k = IOTool.getNextChar (); 
       int count = 0; 
       while (k >= 0) { 
             char c = (char) k; 
             fixedSizeArray[count++] = c; 
             k = IOTool.getNextChar (); 
       }
 
       for (int j=0; j<count; j++) { 
           System.out.print (fixedSizeArray[j]); 
       } 
       System.out.println (); 
       System.out.println (count + " chars in file"); 
   }
}

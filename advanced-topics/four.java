import java.util.*; 

public class four { 

   public static void main (String[] argv) 
   { 
      char[] c = {'e', 'm', 'b', 'e', 'd', 'd', 'e', 'd'}; 
      char[] d = createarray(c,2,4);
      System.out.println (Arrays.toString(d));
      System.out.println (c.charAt[0]);   
   }

   static char[] createarray (char[] c, int a, int b) 
   { 
      int size = b-a+1;
      char[] newarray = new char [size]; 
      int index = 0; 

      for (int i=0; i<c.length; i++) { 
          if (i == a) { 
             newarray[index] = c.charAt(i); 
             index++; 
          }
      }
      return newarray; 
   }
}

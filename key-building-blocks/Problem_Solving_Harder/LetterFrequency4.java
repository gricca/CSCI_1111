import java.util.*; 
import java.io.*; 

public class LineAverages2 { 

   public static void main (String[] argv) 
   { 
       Scanner fileScanner = new Scanner (new File ("data1.txt")); 

       int k = IOTool.getNextChar (); 
      
      try { 
           Scanner fileScanner = new Scanner ("macbeth.txt");            
            int total = 0; 
            char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            while (fileScanner.hasNextChar()) { 
                  char c = fileScanner.nextChar (); 
                  for (int i=0; i<alphabet.length; i++) { 
                      if (c == alphabet[i]) {
                         total++; 
                      }
                  }
            }
            catch (IOException e) {
            }
      }

      String s = new Scanner ("macbeth.txt"); 
      char[] countarray = s.toCharArray();
      int[] count = new int[26]; 
      for (int i = 0; i < countarray.length; i++) {
            if (countarray[i] == 'a') {
                count[0] = count[0] + 1;
            } else if (countarray[i] == 'b') {
                count[1] = count[1] + 1;
            } else if (countarray[i] == 'c') {
                count[2] = count[2] + 1;
            } else if (countarray[i] == 'd') {
                count[3] = count[3] + 1;
            } else if (countarray[i] == 'e') {
                count[4] = count[4] + 1;
            } else if (countarray[i] == 'f') {
                count[5] = count[5] + 1;
            } else if (countarray[i] == 'g') {
                count[6] = count[6] + 1;
            } else if (countarray[i] == 'h') {
                count[7] = count[7] + 1;
            } else if (countarray[i] == 'i') {
                count[8] = count[8] + 1;
            } else if (countarray[i] == 'j') {
                count[9] = count[9] + 1;
            } else if (countarray[i] == 'k') {
                count[10] = count[10] + 1;
            } else if (countarray[i] == 'l') {
                count[11] = count[11] + 1;
            } else if (countarray[i] == 'm') {
                count[12] = count[12] + 1;
            } else if (countarray[i] == 'n') {
                count[13] = count[13] + 1;
            } else if (countarray[i] == 'o') {
                count[14] = count[14] + 1;
            } else if (countarray[i] == 'p') {
                count[15] = count[15] + 1;
            } else if (countarray[i] == 'q') {
                count[16] = count[16] + 1;
            } else if (countarray[i] == 'r') {
                count[17] = count[17] + 1;
            } else if (countarray[i] == 's') {
                count[18] = count[18] + 1;
            } else if (countarray[i] == 't') {
                count[19] = count[19] + 1;
            } else if (countarray[i] == 'u') {
                count[20] = count[20] + 1;
            } else if (countarray[i] == 'v') {
                count[21] = count[21] + 1;
            } else if (countarray[i] == 'w') {
                count[22] = count[22] + 1;
            } else if (countarray[i] == 'x') {
                count[23] = count[23] + 1;
            } else if (countarray[i] == 'y') {
                count[24] = count[24] + 1;
            } else if (countarray[i] == 'z') {
                count[25] = count[25] + 1;
            }

        }
        
        double[] percentage = new double[26];
        for (int i = 0; i <count.length; i++) {
               percentage[i]=((count[i]/total)*100);
               percentage[i]=Math.round(percentage[i]);
        }
        


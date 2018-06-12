public class LetterFrequency3 { 

   public static void main (String[] argv) 
   { 
       IOTool.openFileByChar ("macbeth.txt"); 
       int k = IOTool.getNextChar (); 

       char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};       
       int total = 0;
        
       while ( k >= 0) {
             char c = (char) k;
             for (int i=0; i<alphabet.length; i++) {  
                 if (c == alphabet[i]) { 
                 total++; 
                 }
              }
              k = IOTool.getNextChar ();
      }
      System.out.println ("This is the total number of characters a through z: " + total);

        
     
      Scanner fileScanner = new Scanner (new File ("macbeth.txt"));
       while (fileScanner.hasNextChar()) {
               char ch = fileScanner.nextChar();

      char ch; 
      int count=0;
        for(char i='a'; i<='z'; i++)
            {
                count = 0;
                for(int j=0; j<total; j++)
                {
                    ch=s.charAt(j);
                    if(ch==i) 
                       count++; 
                }
                if(count!=0)
                {
                    System.out.println(i+"\t\t"+count);
                }
            }
       }
    }
}
      



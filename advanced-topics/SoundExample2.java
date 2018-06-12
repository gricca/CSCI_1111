public class SoundExample2 { 

   public static void main (String[] argv) 
   { 
       byte[] rawSamples = SoundTool.getBytesMusic ("CDEFGABC"); 
       System.out.println ("# bytes: " + rawSamples.length); 

       for (int i=0; i<100; i++) { 
           System.out.println (rawSamples[i]); 
       } 
   }
}

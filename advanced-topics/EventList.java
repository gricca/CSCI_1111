public class EventList { 

   public static void main (String[] argv) 
   { 
       printEventList (8); 
   }

   static void printEventList (int n) 
   { 
      for (int i=0; i<=n; i+=2) {
          System.out.print ("Even numbers between " + i + " and " + n + ": "); 
          for (int j=i; j<=n; j+=2) { 
              System.out.print (" " + j); 
          }
          System.out.println (); 
      }
   }
} 
       

public class four { 

   public static void main (String[] argv) 
   { 
       double[] y = {2, 3, 4, 5, 7, 6}; 
       boolean isUni = isUnimodal (y); 
       System.out.println ("isUnimodal=" + isUni); 
       boolean isMono = isMonotonic (y); 
       System.out.println ("isMonotonic=" + isMono);
       boolean isNeither = isNeither (y); 
       System.out.println ("isNeither=" + isNeither);  
         
   }

   static boolean isUnimodal (double[] y) 
   { 
       int unimodal = 0;
       for (int i=1; i<y.length-1; i++) { 
           if ( (y[i] >  y[i+1]) && (y[i] > y[i-1]) || (y[i] <  y[i+1]) && (y[i] < y[i-1])) { 
              unimodal++;
           } 
       }       
       if ( (unimodal !=0) ) { 
          return true;
       }
       return false;
   }                   
       

   static boolean isMonotonic (double[] y) 
   { 
      if (y.length <= 2) { 
         return true; 
   }
   boolean increasing = true; 
   boolean decreasing = true; 
   for (int i=1; i<y.length; i++) { 
       if (y[i-1] > y[i]) { 
          increasing = false;
       }
       else if (y[i-1] < y[i]) { 
          decreasing = false; 
       }
       if (!increasing && !decreasing) { 
          return false; 
       } 
    }
    return true;
  }

  static boolean isNeither (double[] y)
  { 
     if (!isMonotonic (y) && !isUnimodal (y)) { 
        return true;
     }
     return false;
  }
     
}

   

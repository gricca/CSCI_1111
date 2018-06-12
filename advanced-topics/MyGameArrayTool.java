import java.util.*;
import java.util.Random;
import java.util.Arrays;

public class MyGameArrayTool {

    public static void main (String[] argv)
    {
	// Tests for method implementations. 

	int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	int[] B = shiftedArray (3);
	if (! Arrays.equals(A,B) ) {
	    System.out.println ("Error: shiftedArray() not working");
	    System.exit (0);
	}

	int[] C = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	shuffle (C);
	int[] D =  Arrays.copyOf (C,C.length);
	Arrays.sort (D);
	if ( (Arrays.equals(C,A)) || (! Arrays.equals(A,D)) ) {
	    System.out.println ("Error: shuffle() not working");
	    System.exit (0);
	}

	
	int n = 4;
	int[][] b = new int [n][n];
	int[] E = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	putNumbersOnBoard (b, E);
	int k = 0;
	for (int i=0; i<n; i++) {
	    for (int j=0; j<n; j++) {
		if (b[j][i] != k) {
		    System.out.println ("ERROR: putNumbersOnBoard() not working");
		    System.exit (0);
		}
		k++;
	    }
	}



	System.out.println ("MyGameArrayTool appears to be working");
    }

    // Use this method to get a random number between low and high
    // So, a call to randomInt(0,4) will return either 0,1,2,3,4.

    static int randomInt (int low, int high)
    {
	Random r = new Random ();
	int k = r.nextInt (high-low+1);
	// k is now a random number between 0 and high-low (inclusive)
	// So, low+k will be between low and high inclusive.
	return (low + k);
    }

    public static int[] shiftedArray (int N)
    {
	// This needs to return an array with 1,2,...,N as the values.
	// INSERT YOUR CODE HERE
        
        int size = N*N; 
        int shiftarray[] = new int [size]; 
        for (int i=1; i<=size; i++) {
            shiftarray[(i-1)] = i;
        }
        return shiftarray;

    }

    public static void shuffle (int[] numbers)
    {
	// This needs to shuffle the numbers.
	// INSERT YOUR CODE HERE

        Random shuffle = new Random(); 
 
        for (int i = numbers.length-1; i>0; i--) { 
            int j = shuffle.nextInt(i); 
            int temp = numbers[i]; 
            numbers[i] = numbers[j]; 
            numbers[j] = temp; 
        }
        System.out.println (numbers);             
        
        
    }

    public static void putNumbersOnBoard (int[][] board, int[] numbers)
    {
	// This needs put the numbers in the second array (M of them)
	// on the N*N board. M=N*N. However, it needs to put them
	// in Cartesian order going left to right starting at the bottom.
	// INSERT YOUR CODE HERE
 
        int length = board.length;
        int j = 0;  
        for (int k=0; k<length; k++) { 
            for (int m=0; m<length; m++) { 
                board[m][k] = numbers[j];
                j++; 
              }
        }

    }

    public static boolean isPrime (int n)
    {
	// Is n a prime number?
	// INSERT YOUR CODE HERE.

        for(int i = 2; i<n; i++){
            if(n % i == 0){
               System.out.println(n + " isn't a  prime");
               return false;
            }
        }
        System.out.println(n + " is a prime");
        return true; 
    }

    public static void printBoard (int[][] board)
    {
	// INSERT YOUR CODE HERE for a Cartesian print

        for (int y=board[0].length-1; y>=0; y--) { 
            for (int x=0; x<board.length; x++) { 
                System.out.printf (" %6d", board[x][y]); 
            }
            System.out.println ();
        } 
    }

}

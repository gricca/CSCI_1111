
public class TestChessBoard {

    public static void main (String[] argv)
    {
	//Test 1:
	int[][] A = {
	    {0,1,0,1},
	    {1,0,1,0},
	    {0,1,0,1},
	    {1,0,1,0}
	};
	System.out.println ("Test 1: " + CheckChessBoard.isValidChessBoard(A));

	// Test 2:
	//int[][] A2 = {
	   // {0,1,0,1,0,1,0,1},
	   // {1,0,1,0,1,0,1,0},
	   // {0,1,0,1,0,1,0,1},
	   // {1,0,1,0,1,0,1,0},
	   // {0,1,0,1,0,1,0,1},
	   // {1,0,1,0,1,0,1,0},
	   // {0,1,0,1,0,1,0,1},
	   // {1,0,1,0,1,0,1,0}
	//};
	//System.out.println ("Test 2: " + CheckChessBoard.isValidChessBoard(A2));

	// Test 3:
	//int[][] A3 = {
	   // {0,1,0,1},
	   // {1,0,1},
	   // {0,1},
	   // {1}
	//};
	//System.out.println ("Test 3: " + CheckChessBoard.isValidChessBoard(A3));

	// Test 4:
	//int[][] A4 = {
	   // {0,1,0,1},
	   // {0,1,0,1},
	   // {1,0,1,0},
	   // {1,0,1,0}
	//};
	//System.out.println ("Test 4: " + CheckChessBoard.isValidChessBoard(A4));
    }

}

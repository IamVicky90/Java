
package array;


public class Array {


    public static void main(String[] args) {
        	int[][] uneven = { { 1, 9, 4 }, { 0, 2}, { 0, 1, 2, 3, 4 } }; 
		// print out the array 
		for ( int row=0; row < uneven.length; row++ ) // uneven.length=3
		{ 
			System.out.print("Row " + row + ": "); 
			for ( int col=0; col < uneven[row].length; col++ ) 

/* 1st time, uneven[row].length=3,     2nd time, uneven[row].length=2,      
   3rd time, uneven[row].length=5  */
				System.out.print( uneven[row][col] + " "); 				System.out.println(); 
                }
    }
    
}

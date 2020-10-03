public class Sudoku {
	
	public static void main(String args[]) {
		//Given Sudoku in form of 2D array, 
		//Note: '0' represents empty place.
		int[][] grid = { 
				 {0, 0, 8, 3, 1, 9, 4, 0, 2}, 
		         {0, 0, 1, 4, 5, 2, 3, 0, 0}, 
		         {2, 3, 4, 6, 0, 0, 5, 9, 1}, 
		         {6, 1, 9, 0, 0, 4, 0, 0, 0}, 
		         {0, 2, 5, 0, 9, 0, 0, 0, 0}, 
		         {4, 0, 0, 2, 0, 0, 9, 1, 5}, 
		         {1, 4, 3, 0, 0, 7, 0, 5, 9}, 
		         {0, 0, 6, 9, 0, 3, 1, 0, 0}, 
		         {9, 7, 2, 1, 0, 5, 8, 3, 0} };
		
		if (solveSudoku(grid) == false) {
			System.out.println("No solution exists!!");
		}
		else 
			printSudoku(grid);
	}
	
	public static boolean isSafe(int[][] grid, int row, int col, int n) {
		int rowStart = -1, colStart = -1;
		
		// check the same row
		for (int j = 0; j < grid.length; j++) {
			if (j == col) continue;
			if (grid[row][j] == n) return false;
		}
		
		//check same column
		for (int i = 0; i < grid.length; i++) {
			if (i == row) continue;
			
			if (grid[i][col] == n) return false;
		}
		
		//check same 3 x 3 grid
		rowStart = row - row % 3;
		colStart = col - col % 3;
		
		for (int i = 0; i < 3; i++) {
			colStart = col - col % 3;
			for (int j = 0; j < 3; j++) {
				if (rowStart == row && colStart == col) continue;
				
				if (grid[rowStart][colStart] == n) return false;
				
				colStart++;
			}
			rowStart++;
		}
		
		//This means, it is safe to place the number 'n' at position grid[row][col]
		return true;
	}
	
	public static boolean solveSudoku(int[][] grid) {
		int row = -1, col = -1;
		boolean res = true;
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if (grid[i][j] == 0) {
					row = i;
					col = j;
					res = false;
					break;
				}
			}
			if (!res)
				break;
		}
		
		//If res is true, it means there isn't any '0' present in our Sudoku, hence the Sudoku is solved!
		if (res)
			return true;
		
		for (int n = 1; n <= 9; n++) {
			if (isSafe(grid, row, col, n)) {
				grid[row][col] = n;
				if (solveSudoku(grid))
					return true;
				else
					//backtrack and initialize the current position with '0' as before
					grid[row][col] = 0;
			}
		}
		
		return res;
	}
	
	public static void printSudoku(int[][] grid) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}

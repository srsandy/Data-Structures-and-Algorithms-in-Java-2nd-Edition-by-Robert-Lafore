import java.util.*;

class ValidSuduko {
    public static void main(String[] args) {
        char[][] grid = new char[][]{ 
            {'8','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println(isValidSudoku(grid));
    }

    public static boolean isValidSudoku(char[][] grid) {
        int n = grid.length;
    
        Set<String> set = new HashSet<String>();
    
        for (int row = 0; row < n ; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] != '.' && !set.add(grid[row][col] + " in row " + row))
                    return false;
                if (grid[row][col] != '.' && !set.add(grid[row][col] + " in col " + col))
                    return false;
                if (grid[row][col] != '.' && !set.add(grid[row][col] + " in square " + row/3 + " " + col/3))
                    return false;
            }
        } 
        
        return true;  
    }

}
import java.util.*;

class KnightsPossibleMoves {
    public static void main(String[] args) {

        int board[][] = { 
                        { 1, 0, 1, 0 }, 
                        { 0, 1, 1, 1 }, 
                        { 1, 1, 0, 1 }, 
                        { 0, 1, 1, 1 } 
                    }; 
  
        int p = 2, q = 2; 
  
        System.out.println(findMoves(board, p, q)); 
    }

    public static int findMoves(int[][] board, int p, int q) {

        int n = board.length;
        int m = board[0].length;

        // All valid moves of a knight 
        int X[] = { 2, 1, -1, -2, -2, -1, 1, 2 }; 
        int Y[] = { 1, 2, 2, 1, -1, -2, -2, -1 }; 


        int count = 0;

        for (int i = 0; i < 8; i++) { 
  
            int x = p + X[i]; 
            int y = q + Y[i]; 
  
            if (x >= 0 && y >= 0 && x < n && y < m && board[x][y] == 0) 
                count++; 
        } 
         
        return count; 
        
    }

}
/*
    Solved By: Joshua (https://github.com/monst12)
    Modification: Sandeep Ranjan (1641012352)

    
    Solution for Programming Project
    6.1
*/

class RecursiveMultiplication {
    public static void main(String[] args) {
        int x = 2, y = 4;
        System.out.println("2 * 4: " + mult(x, y));
    }

    public static int mult(int x, int y) {
        if(y == 0) return 0;
        if(y == 1) return x;
        return x + mult(x, (y - 1));
    }
}

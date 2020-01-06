import java.util.*;

class SquareDiagonals {
    public static void main(String[] args) {
        int mat[][] = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                    };

        square(mat);
    }

    public static void square(int[][] mat) {
        int size = mat.length;
        int d1[] = new int[size];
        int d2[] = new int[size];

        int x = 0, y = 0;
        int r = size - 1;

        for(int i=0; i<size; i++) {
            d1[x++] = mat[i][i]*mat[i][i];
            d2[y++] = mat[i][r]*mat[i][r];
            r--;
        }

        for(int i=0; i<size; i++) {
            System.out.print(d1[i] + " ");
        }

        System.out.println();
        
        for(int i=0; i<size; i++) {
            System.out.print(d2[i] + " ");
        }

    }

}
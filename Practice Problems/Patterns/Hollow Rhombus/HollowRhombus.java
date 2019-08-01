import java.util.*;

class HollowRhombus {
    public static void printPattern(int rows) {


        for(int i = 0; i<rows; i++) {
            int j;    

            for(j = rows; j> i; j--) { 
                System.out.print(" ");
            }

            for(j=0; j<rows; j++) {
            
                if(i==0 || i==rows-1 || j==0 || j==rows-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printPattern(n);
    }
}

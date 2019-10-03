import java.util.Scanner;
public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1,first=n,last=(2*n)-1;row<=n;row++,first--,last--){
            for(int col=1;col<=last;col++){
                if(col < first) System.out.print("  ");
                else if (row == 1 || row == n) System.out.print("* ");
                else if (col == first || col == last) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}

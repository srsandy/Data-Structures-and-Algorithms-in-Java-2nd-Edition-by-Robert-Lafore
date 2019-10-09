import java.util.Scanner;
public class GaneshasPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printGaneshasPattern(n);
    }
    private static void printGaneshasPattern(int n){
        if(n%2==1){
            int first=1, middle=(n+1)/2, last=n;

            for(int row=1; row<=n; row++){
                for(int col=1; col<=n; col++){
                    if(row<middle){
                        if(col<middle) 
                            if (col == first) 
                                System.out.print("*");
                        else 
                            System.out.print(" ");

                        if(col==middle) 
                            System.out.print("*");
                        if(col>middle) 
                            if (row == first) 
                                System.out.print("*");

                    } else if(row==middle) 
                        System.out.print("*");
                    else if (col < middle) 
                        if (row == last) 
                            System.out.print("*");
                        else 
                            System.out.print(" ");

                    else if (col == middle) 
                        System.out.print("*");
                    else if (col == last) 
                        System.out.print("*");
                    else 
                        System.out.print(" ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Enter odd digit");
        }
    }
}


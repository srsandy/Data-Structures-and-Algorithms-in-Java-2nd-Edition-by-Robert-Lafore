import java.util.Scanner;
 
public class RightAlphabeticTriangle
{            
    public static void main(String[] args)
    {
        int alphaCode = 65; // ASCII Code for 'A' alphabet
        
        System.out.println("Enter number of rows to print: ");
        Scanner input = new Scanner(System.in);

        int numRow = input.nextInt();

        for (int i = 0; i <= numRow; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) (alphaCode + j) + " ");
            }
            System.out.println("");
        }
    }
}
  
import java.util.*;
import java.io.*;

public class Sandglass
{
    public static void main(String[] args)
    {   
        System.out.println("Enter number of rows you want to print: ");
        
        Scanner input = new Scanner(System.in);
        int numRow = input.nextInt();            
        
        for (int i= 0; i<= numRow-1 ; i++)
        {
            for (int j=0; j <i; j++)
            {
                System.out.print(" ");
            }

            for (int k=i; k<=numRow-1; k++) 
            { 
                System.out.print("* "); 
                    
            } 
                
            System.out.println(""); 
        } 
        for (int i= numRow-1; i>= 0; i--)
        {
            for (int j=0; j< i ;j++)
            {
                System.out.print(" ");
            }
            for (int k=i; k<=numRow-1; k++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        input.close();
    }
}
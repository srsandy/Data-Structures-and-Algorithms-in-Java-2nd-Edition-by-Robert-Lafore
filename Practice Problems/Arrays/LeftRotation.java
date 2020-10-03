import java.util.*;
import java.lang.System;

public class LeftRotation {
    
    public static int[] rotateArray(int[] arr, int d){
        // Because the constraints state d < n, we need not concern ourselves with shifting > n units.
        int n = arr.length;
        
        // Create new array for rotated elements:
        int[] rotated = new int[n]; 
        
        // Copy segments of shifted elements to rotated array:
        System.arraycopy(arr, d, rotated, 0, n - d);
        System.arraycopy(arr, 0, rotated, n - d, d);

        return rotated;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] numbers = new int[n];
        
        // Fill initial array:
        for(int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }
        
        // Rotate array by d elements:
        numbers = rotateArray(numbers, d);
        
        // Print array's elements as a single line of space-separated values:
        for(int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        scanner.close();
    } 
        
}

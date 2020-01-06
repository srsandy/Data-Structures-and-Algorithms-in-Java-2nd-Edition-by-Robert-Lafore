import java.util.*;

class ProductArray {
    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        int n = arr.length;

        int[] prod = productArray(arr, n);

        for (int i = 0; i < n; i++) 
            System.out.print(prod[i] + " "); 
    }

    public static int[] productArray(int[] arr, int n) {
        if (n == 1) { 
            return new int[]{0}; 
        }

        int left[] = new int[n]; 
        int right[] = new int[n]; 
        int prod[] = new int[n]; 

        left[0] = 1; 
  
        right[n - 1] = 1; 
  
        for (int i = 1; i < n; i++) 
            left[i] = arr[i - 1] * left[i - 1]; 
  
        for (int i = n - 2; i >= 0; i--) 
            right[i] = arr[i + 1] * right[i + 1]; 
  
        for (int i = 0; i < n; i++) 
            prod[i] = left[i] * right[i]; 
  
        return prod; 
        
    }

}
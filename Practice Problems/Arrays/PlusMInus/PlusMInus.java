import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    
    static void plusMinus(int[] arr) {
      
      int dimension = arr.length;
        double positives = 0;
        double negatives = 0;
        double zeros = 0;

        for (int i = 0; i < dimension; i++) {
            if (arr[i] > 0) {
                positives++;
            } else if (arr[i] < 0) {
                negatives++;
            } else {
                zeros++;
            }
        }
        
        positives /= dimension;
        negatives /= dimension;
        zeros /= dimension;

        System.out.printf("%.6f\n%.6f\n%.6f\n", positives, negatives, zeros);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class SumTriplet {
//find triplet with sum =x 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		if (sc.hasNext()) {
			n = sc.nextInt();
		}
		
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int x = sc.nextInt();
		for (int i = 0; i < n - 2; i++) {//loop for a fix number and rest like sum pair
			int l = i + 1;
			int h = n - 1;
			while (l < h) {
				int s = a[i] + a[l] + a[h];
				if (s == x) {
					System.out.println(a[i] + ", " + a[l] + " and " + a[h]);
					l++;
					h--;
				} else if (s > x) {
					h--;
				} else {
					l++;
				}
			}

		}
	}

}

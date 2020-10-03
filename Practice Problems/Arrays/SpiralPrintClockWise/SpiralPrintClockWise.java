
import java.util.Scanner;

public class SpiralPrintClockWise {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = 0;
		if (sc.hasNext()) {
			m = sc.nextInt();
		}
		int n = 0;
		if (sc.hasNext()) {
			n = sc.nextInt();
		}
		int[][] a = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int top, bottom, left, right, count, direction;
		top = 0;
		bottom = a.length - 1;
		left = 0;
		right = a[top].length - 1;
		count = (bottom + 1) * (right + 1);
		direction = 1;

		while (left <= right && top <= bottom) {
			if (count > 0) {
				if (direction == 1) {
					for (int i = left; i <= right; i++) {
						System.out.print(a[top][i] + ", ");
						count--;
					}
					direction = 2;
					top++;
				}
			}
			if (count > 0) {
				if (direction == 2) {
					for (int i = top; i <= bottom; i++) {
						System.out.print(a[i][right] + ", ");
						count--;
					}
					direction = 3;
					right--;
				}
			}
			if (count > 0) {
				if (direction == 3) {
					for (int i = right; i >= left; i--) {
						System.out.print(a[bottom][i] + ", ");
						count--;
					}
					direction = 4;
					bottom--;
				}
			}
			if (count > 0) {
				if (direction == 4) {
					for (int i = bottom; i >= top; i--) {
						System.out.print(a[i][left] + ", ");
						count--;
					}
					direction = 1;
					left++;
				} 
			}

		}
		System.out.println("END");

	}

}

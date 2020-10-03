import java.util.Scanner;

public class PainterProblem {
//find the minimum time to paint n board with different length and 1 unit length take 1 unit time by k painter
//	painter can only paint continous block
//	1 painter will paint 1 block only
	public static int pno(int[] a, int n, long mid) {
		long s = 0;
		int p = 1;
		for (int i = 0; i < n; i++) {
			s += a[i];
			if (s > mid) {
				s = a[i];
				p++;
			}
		}
		return p;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = -1;
		if (sc.hasNext()) {
			k = sc.nextInt();
		}
		int n = sc.nextInt();
		int[] a = new int[n];
		long s = 0;//sum
		int m = 0;//max
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			s += a[i];
			m = Math.max(m, a[i]);
		}

		long l = m;//lowest time = max block length in array
		long h = s;//maximum time  = sum of all board length
		while (l < h) {
			long mid = (l + h) / 2;
			if (pno(a, n, mid) <= k) {//if it is possible to paint in this time
				h = mid;//try to search for more lower value therefore dec h
//				we cant do h= mid -1 as we need a answer and mid was possible
			} else {
				l = mid + 1;//it wasn't possible then search in upper half and inc l
			}
		}
		System.out.println(l);

	}

}

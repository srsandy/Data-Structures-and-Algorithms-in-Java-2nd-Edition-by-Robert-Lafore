import java.util.Arrays;
import java.util.Scanner;

public class BookAllocationProblem {
	//we need to minimize the maximum number of pages alloted to a  student i.e. we need to minimize the stress on students
		public static boolean isValid(int[] a,int n,int m,int mid) {
			int s=0;
			int c=1;
			for(int i=0;i<n;i++) {
				s+=a[i];
				if(s>mid) {
					s=a[i];
					c++;
				}			
			}
			if(c>m) {
				return false;
			}else {
				return true;
			}
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = 0;
		if (sc.hasNext()) {
			t = sc.nextInt();
		}
		while (t-- != 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] a = new int[n];
			int s = 0;//sum of array elements
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				s += a[i];
			}
			if(n<m) {
				System.out.println("-1");
				System.exit(0);
			}
			Arrays.sort(a);
			int l = a[n - 1];//minimum pages is maximum of array as each student will read minimum 1 book
			int h = s;//maximum number of pages is equal to the sum of all elements in the array
			int r=-1;
			while (l <= h) {
				int mid = (l + h) / 2;
				if(isValid(a,n,m,mid)) {//if we were successful in able to allocate book 
					r=mid;//result
					h=mid-1;//try to minimize further
				}else {
					l = mid+1;//if we werent able, search in lower half
				}

			}
			System.out.println(r);

		}
	}

}

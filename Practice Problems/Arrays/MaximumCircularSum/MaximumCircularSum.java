import java.util.Scanner;

public class MaximumCircularSum {
//form the maximum continous sum possible in circular array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			
//			circular sum = Math.max(max subarray,total sum-minimum sum)
			
//			max subarray= if the maximum lies in between i.e. no point of circular array
//			use normal kadne theorem
			int mxc = a[0];
			int mxg = a[0];
			for (int i = 1; i < n; i++) {
				mxc = Math.max(a[i], mxc + a[i]);
				if (mxc > mxg) {
					mxg = mxc;
				}
			}
			
			//if subarray is circular i.e. wrapped therefore find lowest sum with the help of same array and subtract from total
//			min subarray
			int mic = a[0];
			int mig = a[0];
			for (int i = 1; i < n; i++) {
				mic = Math.min(a[i], mic + a[i]);
				if (mic < mig) {
					mig = mic;
				}
			}
			
			
			int to = 0;
			for(int i= 0;i<n;i++) {
				to+=a[i];
			}
			System.out.println(Math.max(mxg, to-mig));		
	}

}

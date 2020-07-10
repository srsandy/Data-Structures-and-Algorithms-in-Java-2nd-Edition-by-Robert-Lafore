import java.util.*;

class Zsum {

	static long mod = 10000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(1 == 1) {
			long N = sc.nextLong();
			long K = sc.nextLong();

			if(N ==0 && K == 0) {
				return;
			}

			long ans = 2 * power(N - 1, K) + power(N, K) + 2 * power(N - 1, N - 1) + power(N, N);

			ans = ans % mod;
			System.out.println(ans);
		}
	}

	static long power (long a, long n) {
		long result = 1;

    	a %= mod;

    	while (n > 0) {
    		if(n % 2 == 1)
            	result = (result * a )% mod;
        	n >>= 1;
    		a = (a * a) % mod;

    	}
    	return result;
	}
}
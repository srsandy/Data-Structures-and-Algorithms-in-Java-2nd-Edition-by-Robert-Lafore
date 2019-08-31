class MaximunSubarray {
	public static void main(String[] args) {

		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3}; 

		System.out.println(maxSubArray(arr));
	}

	public static int maxSubArray(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = arr[0];
        int max = dp[0];

        for(int i = 1; i < n; i++) {
            dp[i] = arr[i] + ( dp[i-1] > 0 ? dp[i-1] : 0);
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}

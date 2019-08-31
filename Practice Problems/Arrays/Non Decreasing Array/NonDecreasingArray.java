class NonDecreasingArray {
	public static void main(String[] args) {

		int[] nums = {-1, 4, 2, 3};

		System.out.println(checkPossibility(nums))
	}

	public static boolean checkPossibility(int[] nums) {
        
        int n = nums.length;
        int prev = nums[0];
        boolean c = false;
        
        for(int i=1; i<n; i++) {
            if(nums[i] >= prev) {
                prev = nums[i];
                continue;
            }
            
            if(c) return false;
            c = true;
            
            if (i == 1 || nums[i] >= nums[i - 2]) {
                 prev = nums[i];
            }
        }
        
        return true;
    }
}

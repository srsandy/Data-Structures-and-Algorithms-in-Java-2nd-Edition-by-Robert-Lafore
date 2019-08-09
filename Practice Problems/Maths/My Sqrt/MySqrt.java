class MySqrt {
    public static void main(String[] args) {
        int n = 8;

        System.out.println(mySqrt(n));
    }


    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int left = 1;
        int right = x;
        int ans = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;

			if (mid == x / mid) {
                return mid;
            }

            if (mid < x / mid) {
                left = mid + 1;
                ans = mid;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
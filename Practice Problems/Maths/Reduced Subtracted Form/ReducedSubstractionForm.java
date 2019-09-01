class ReducedSubstractionForm {
    public static void main(String[] args) {
        int num = 5271;

        int ans = num;
        while(ans >= 99) {
            ans = reduce(ans);      
        }

        System.out.println(ans);
    }

    public static int reduce(int num) {
        int ans = 0;

        int prev = num%10;
        num = num/10;

        int i = 0;
        
        while(num > 0) {
            int curr = num%10;
            int n = Math.abs(curr - prev);

            ans += n*Math.pow(10, i);
            i++;

            num = num/10;
            prev = curr;
        }

        return ans;
    }
}

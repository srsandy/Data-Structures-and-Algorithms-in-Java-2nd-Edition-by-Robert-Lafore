class PowerxTon {
    public static void main(String arg[]) {
        int x = 2;
        int n = 2;
        double result = myPow(x, n);
        System.out.println(result);
    } 

    public static double myPow(double x, int n) {
        if(n == 0) {
            return 1;
        }
        
        if(Double.isInfinite(x)) {
            return 0;
        }
        
        if(n < 0) {
            n = -n;
            x = 1 / x;
        }
        
        return n % 2 == 0 ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }
}
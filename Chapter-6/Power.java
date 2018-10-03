
class Power { 
    /* Function to calculate a raised to the power n */
    public static int power(int a, int n) 
    { 
        if (n == 0) 
            return 1; 
        else if (n % 2 == 0) 
            return power(a, n / 2) * power(a, n / 2); 
        else
            return a * power(a, n / 2) * power(a, n / 2); 
    } 
  
    /* Program to test function power */
    public static void main(String[] args) 
    { 
        int a = 2; 
        int n = 3; 
  
        System.out.printf("%d", power(a, n)); 
    } 
} 
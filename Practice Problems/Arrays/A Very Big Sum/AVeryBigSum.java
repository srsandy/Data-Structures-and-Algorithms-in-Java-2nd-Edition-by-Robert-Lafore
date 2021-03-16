import java.util.*;
public class AVeryBigSum {
	
    static long aVeryBigSum(long[] ar) {
    	long sum = 0;
    	for(Long i : ar)
    		sum+=i;
    	return sum;
    }
	
    public static void main(String[]args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	long ar[] = new long[a];
    	for(int i=0;i<a;i++)
    		ar[i] = sc.nextLong();
    	System.out.println(aVeryBigSum(ar));
    	sc.close();  		
    }
}

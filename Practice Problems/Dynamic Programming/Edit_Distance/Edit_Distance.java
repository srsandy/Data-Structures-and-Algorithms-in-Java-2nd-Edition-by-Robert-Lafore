import java.util.Scanner;

public class Edit_Distance {
	
	// Recursive :
	private static int edit(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();
		if(m == 0 || n == 0) {
			// if we are reaching here means that one part of the array is completely done so
            // we need to just delete after that part !! or you can add your choice !!
			if(m>0)
                return m;
        	return n;
		}
		if(s1.charAt(0) == s2.charAt(0))
			return edit(s1.substring(1),s2.substring(1));
		
		// option 1 : insert same element 
		int op10 = 1 + edit(s1,s1.charAt(0) + s2);
		// Here we don't need to make two choices because the result obtained by delete's two are just the
		// same after equal char's
		//int op11 = 1 + edit(s2.charAt(0) + s1,s2);
		//int op1 = Math.min(op10, op11);
		
		// option 2 : Delete element  
		int op20 = 1 + edit(s1,s2.substring(1));
		//int op21 = 1 + edit(s1.substring(1),s2);
		//int op2 = Math.min(op20, op21);
		// here also the solution is found to be repeating in future call as it deletes and get same  answer again!
		
		// option 3 : Replace element
		int op30 = 1 + edit(s1,s1.charAt(0) + s2.substring(1));
		// here replacing results in same answer for both after there first chars are found equal
		// therefore op30 and op31 are just same 
		//int op31 = 1 + edit(s2.charAt(0) + s1.substring(1),s2);
		//int op3 = Math.min(op30, op31);
		
		return Math.min(op10, Math.min(op20, op30));
	}
	
	// Memoization :
	public static int editM(String s1,String s2) {
		int dp[][] = new int[s1.length() + 1][s2.length() + 1];
		return editM(s1,s2,dp);
	}
	
	private static int editM(String s1, String s2, int[][] dp) {
		int m = s1.length();
		int n = s2.length();
		if(m == 0 || n == 0) {
			if(m>0) {
				dp[m][n] = m;
                return dp[m][n];
			}
			dp[m][n] = n;
        	return dp[m][n];
		}
		if(dp[m][n] != 0)
			return dp[m][n];
		if(s1.charAt(0) == s2.charAt(0)) {
			dp[m][n] = editM(s1.substring(1),s2.substring(1),dp);
			return dp[m][n];
		}
		int op1 = 1 + editM(s1.substring(1),s2,dp);
		int op2 = 1 + editM(s1,s2.substring(1),dp);
		int op3 = 1 + editM(s1.substring(1),s2.substring(1),dp);
		dp[m][n] = Math.min(op1, Math.min(op2, op3));
		return dp[m][n];
	}
	
	// DP :
	public static int editDP(String s1,String s2) {
		int m = s1.length();
		int n = s2.length();
		int dp[][] = new int[m+1][n+1];
		
		for(int i=0 ; i<=m ; i++)
			dp[i][0] = i;
		for(int j=1 ; j<=n ; j++)
			dp[0][j] = j;
		
		for(int i=1 ; i <= m ; i++) {
			for(int j=1 ; j<= n ; j++) {
				if(s1.charAt(m-i) == s2.charAt(n-j))
					dp[i][j] = dp[i-1][j-1];
				else
					dp[i][j] = 1 +  Math.min(dp[i-1][j],Math.min(dp[i-1][j-1], dp[i][j-1]));
			}
		}
		return dp[m][n];
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		String s2 = s.next();
		System.out.println(editDP(s1,s2));
		System.out.println(editM(s1,s2));
		System.out.println(edit(s1,s2));
		s.close();
	}

}

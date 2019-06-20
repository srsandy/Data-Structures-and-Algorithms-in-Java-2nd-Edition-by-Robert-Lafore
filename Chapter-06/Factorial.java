/*
	Solved By: Sandeep Ranjan (1641012352)
*/

class Factorial {
	public static void main(String[] args) {
		final int FNO = 5;

		System.out.println(FNO + "! is " + fact(FNO));
	}

	public static int fact(int n){
		if(n==1) return 1;
		else
		return( n * fact(n-1) );
	}
}
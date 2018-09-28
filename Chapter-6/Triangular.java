/*
	Solved By: Sandeep Ranjan (1641012352)
*/

class Triangular {
	public static void main(String[] args) {
		final int TNO = 5;

		System.out.println(TNO + " Triangular is " + triangle(TNO));
	}

	public static int triangle(int n){
		if(n==1) return 1;
		else
		return( n + triangle(n-1) );
	}
}
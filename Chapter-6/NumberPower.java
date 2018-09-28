/*
	Solved By: Sandeep Ranjan (1641012352)
	
	Solution for Programming Project
	6.3
*/

class NumberPower {
	public static void main(String[] args) {
		int x = 5;
		int y = 4;

		System.out.println(x + "^" + y + "= " + power(x,y));
		
	}

	public static int power(int x, int y) {
		if (y == 1) {
      		return x;
    	} else {
      		int a = power(x*x, y / 2);
      		if (y % 2 == 1) {
       			 a *= x;
      		}
      		return a;
    	}
	}
}
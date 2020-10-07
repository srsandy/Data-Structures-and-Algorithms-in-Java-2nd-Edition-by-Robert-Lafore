//5
//5 4 3 2 1 0 1 2 3 4 5 
//  4 3 2 1 0 1 2 3 4 
//    3 2 1 0 1 2 3 
//      2 1 0 1 2 
//        1 0 1 
//          0 
//        1 0 1 
//      2 1 0 1 2 
//    3 2 1 0 1 2 3 
//  4 3 2 1 0 1 2 3 4 
//5 4 3 2 1 0 1 2 3 4 5 

import java.util.Scanner;

public class PatternHourGlass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		if (sc.hasNext()) {
			n = sc.nextInt();
		}
		int nr=2*n+1;
		int nst=nr;
		int nsp=0;
		int row=1;
		int val;
		while(row<=nr) {
			if(row<=nr/2+1) {
			val=n-row+1;
			}else {
				val=row-nr/2-1;
			}
			for(int csp = 1; csp<=nsp;csp++) {
				System.out.print(" ");
			}
			for(int cst = 1; cst<=nst;cst++) {
				if(cst<nst/2+1) {
				System.out.print(val--+" ");
				}else if(cst==nst/2+1){					
					System.out.print(val +" ");
				}else {
					System.out.print(++val +" ");
				}
			}
			System.out.println();
			if(row<=nr/2) {
				nsp+=2;
				nst-=2;
			}else {
				nsp-=2;
				nst+=2;
			}
			row++;
			
		}
	}

}

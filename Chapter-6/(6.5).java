import java.lang.*;
import java.util.*;
class Combinations{
   
static void makeCombiUtil(Vector<Integer> tmp, int n, int left, int k) 
{ 
	if (k == 0) { 
		System.out.println(tmp);
		return; 
	} 
 
	for (int i = left; i <= n; ++i) 
	{ 
		tmp.add(i); 
		makeCombiUtil(tmp, n, i + 1, k - 1); 
 
		tmp.remove(tmp.size()-1); 
	} 
} 
 
static void makeCombi(int n, int k) 
{ 
	
	Vector<Integer> tmp=new Vector<>(); 
	makeCombiUtil(tmp, n, 1, k); 
} 


public static void main(String args[]) 
{ 
	// given number 
	Scanner s=new Scanner(System.in);
	int n = s.nextInt(); 
	int k = s.nextInt(); 
	makeCombi(n, k); 
	
} 
}

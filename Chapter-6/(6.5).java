import java.lang.*;
import java.util.*;

// Method 1:
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

//Method 2:
class Comb { 

    static void combination(int arr[], int data[], int start, 
                                int end, int index, int r) 
    { 
        if (index == r) 
        { 
            for (int j=0; j<r; j++) 
                System.out.print(data[j]+" "); 
            System.out.println(""); 
            return; 
        } 
        for (int i=start; i<=end && end-i+1 >= r-index; i++) 
        { 
            data[index] = arr[i]; 
            combination(arr, data, i+1, end, index+1, r); 
        } 
    } 

    static void print(int arr[], int n, int r) 
    { 
        int data[]=new int[r]; 
        combination(arr, data, 0, n-1, 0, r); 
    } 

    public static void main (String[] args) { 
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int i=0,j=0;
	int arr[]=new int[n];
	for(i=1;i<=n;i++)
	{
	    arr[j++]=i;
	}
        int r = s.nextInt(); 
        print(arr, n, r); 
    } 
} 

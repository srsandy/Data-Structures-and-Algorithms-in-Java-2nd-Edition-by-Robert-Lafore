/*
	Solved By: Sandeep Ranjan (1641012352)
	
	Solution for Programming Projects
	3.1, 3.4
*/


class ArrayBub {
	private long[] a;
	private int nElems;

	public ArrayBub(int max) {
		a = new long[max];
		nElems = 0;
	}

	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}

	public void display() {
		for(int j=0; j<nElems; j++)
			System.out.print(a[j] + " "); 
		System.out.println("");
	}

	/*
	In the bubbleSort program, the invariant is that the data items to the right of out are sorted. This remains true throughout the running of the algorithm. (On the first pass, nothing has been sorted yet, and there are no items to the right of out because it starts on the rightmost element.)
	*/

	public void bubbleSort() {
		int out, in;
		for(out=nElems-1; out>1; out--)
			for(in=0; in<out; in++)
				if( a[in] > a[in+1] )
					swap(in, in+1);
	}

	
	public void biDirectionBubbleSort() {
		int out=nElems-1, in, _out=0;
		
		boolean isSwap = true;
		
		while(isSwap) {
			isSwap = false;
			
			for(in=_out; in<out; in++) {
				if( a[in] > a[in+1] ) {
					swap(in, in+1);
					isSwap=true;
				}
			}
			
			for(in=out-1; in>_out; in--) {
				if(a[in] < a[in-1]) {
					swap(in, in-1);
					isSwap=true;
				}
			}
			
			_out++;
			out--;
		}
			
	}
	
	public void oddEvenSort() {
		boolean isSwap=true;
		
		while(isSwap) {
			isSwap = false;
			
			for(int in=1; in<nElems-1; in+=2) {
				if( a[in] > a[in+1] ) {
					swap(in, in+1);
					isSwap=true;
				}
			}
			
			for(int in=0; in<nElems-1; in+=2) {
				if( a[in] > a[in+1] ) {
					swap(in, in+1);
					isSwap=true;
				}
			}
			
		}
		
	}

	private void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;

	}

}

class bubbleSort {
	public static void main(String[] args) {
		int maxSize = 100;
		ArrayBub arr = new ArrayBub(maxSize);

		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);

		arr.display();

		// arr.oddEvenSort();

		// arr.display();
	}
}

class ArraySel {
	private long[] a;
	private int nElems;

	public ArraySel(int max) {
		a = new long[max];
		nElems = 0;
	}

	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}

	public void display() {
		for(int j=0; j<nElems; j++)
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}

	public void selectionSort() {
		int out, in, min;
		for(out=0; out<nElems-1; out++) {
			min = out;
			for(in=out+1; in<nElems; in++)
				if(a[in] < a[min] )
					min = in;
			swap(out, min);
		} 
	} 

	private void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;

	}

}

class selectionSort {
	public static void main(String[] args) {
		int maxSize = 100;
		ArraySel arr = new ArraySel(maxSize);

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

		arr.selectionSort();

		arr.display();
	}
}

/*
    Solved By: Sandeep Ranjan (1641012352)
*/

class ArrayShell {
	private int[] a;
	private int nElems;

	public ArrayShell(int max) {
		a = new int[max];
		nElems = 0;
	}

	public void insert(int value) {
		a[nElems] = value;
		nElems++;
	}

	public void display() {
		for(int j=0; j<nElems; j++)
			System.out.print(a[j] + " "); 
		System.out.println("");
	}

	public void shellSort() {
		// Knuth’s Interval Sequence
		int h = 1;
		while(h <= nElems/3)
			h = h*3 + 1;

		while(h > 0) {
			for(int out=h; out<nElems; out++) {
				int temp = a[out];
				int in = out;

				while(in > h-1 && a[in - h] >= temp) {
					a[in] = a[in-h]; 
					in -= h;
				}

				a[in] = temp;
			}

			// Reducing Knuth’s
			h = (h-1) / 3;
		}

		return;
	}
}

class ShellSort {
	public static void main(String[] args) {
		int maxSize = 11;
		ArrayShell arr = new ArrayShell(maxSize);

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

		arr.shellSort();
		arr.display();

	}
}

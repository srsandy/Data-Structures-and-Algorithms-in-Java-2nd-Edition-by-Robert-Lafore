/*
	Solved By: Sandeep Ranjan (1641012352)

	Solution for Programming Projects
	3.2, 3.3, 3.6
*/

class ArrayIns {
	private long[] a;
	private int nElems;

	public ArrayIns(int max) {
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

	public void insertionSort() {
		int in, out;

		for(out=1; out<nElems; out++) {
			long temp = a[out];
			in = out;
			while(in>0 && a[in-1] >= temp) {
				a[in] = a[in-1];
				--in;
			}

			a[in] = temp;

		} 
	}

	private void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;

	}

	public long median() {
		insertionSort();

		int n = nElems - 1;
 		
        if (n % 2 != 0)
        return a[n / 2];
     
        return (a[(n - 1) / 2] + a[n / 2]) / 2;
	}			  

	

	public void noDups() {
   		insertionSort();

   		int nDel = 0;
   		long comp = a[0];

   		for (int i=1; i<nElems; i++) {

	   		if (a[i]==comp) {
	   			a[i]=-1;
	   			nDel++;
	   		} else { 
	   			comp = a[i];
	   		}

   		}

	   	for (int i=0; i<nElems;i++) {

	   		if (a[i] == -1) {
	   			int j=i+1;
	   			
	   			while(a[j] == -1) {
	   				j++;
	   			}

	   			a[i]=a[j];
	   			a[j]=-1;
	   		}
	   	}

	   	nElems -= nDel;
   }

    public void insertionSort_and_noDups() {
  	 
		int in, out;
		int nDups = 0;
	
		for(out=1; out<nElems; out++) {
			long temp = a[out];
		  	in = out;

		  	while(in > 0 && a[in-1] >= temp) {

		  		if (a[in-1] == temp) {
					temp = -1;
					nDups++;
				}

				a[in] = a[in-1];
				--in;
		  	}

		  a[in] = temp;
		}

		if (nDups != 0) {
		   for (int i = nDups; i < nElems; i++) {
				a[i - nDups] = a [i];
			}
		}

		nElems -= nDups;
   }

}

class insertionSort {
	public static void main(String[] args) {
		int maxSize = 100;
		ArrayIns arr = new ArrayIns(maxSize);

		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(33);
		arr.insert(33);

		// arr.display();

		// arr.insertionSort();

		// System.out.println(arr.median());
		arr.display();
		arr.insertionSort_and_noDups();

	}
}

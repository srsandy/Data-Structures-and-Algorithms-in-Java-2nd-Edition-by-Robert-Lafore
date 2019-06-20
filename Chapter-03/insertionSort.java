/*
	Solved By: Sandeep Ranjan (1641012352)

	Solution for Programming Projects
	3.2, 3.3, 3.5, 3.6
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
	
	public long median() {
		insertionSort();

		int n = nElems;
 		
        if (n % 2 != 0)
        	return a[n / 2];
     
        return (a[(n - 1) / 2] + a[n / 2]) / 2;
	}			  

	public void noDups() {
   		insertionSort();

   		int nDel = 0;
   		for (int i=0, j=1; j<nElems; j++) {

	   		if (a[i]==a[j]) {
	   			nDel++;
	   		} else {
	   			i++;
	   			a[i] = a[j]; 
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
   
  	public void nCopies_nComp() {
	  	int in, out;
		int nComp = 0;
		int nCopies = 0;
		
		for(out=1; out<nElems; out++) {
			long temp = a[out];
			in = out;
			nCopies++;
			
			while(in>0 && a[in-1] >= temp) {
				a[in] = a[in-1];
				nComp++;
				nCopies++;
				--in;
			}
			
			nComp++;
			
			a[in] = temp;
			nCopies++;
			
		} 
		
		System.out.println("Comp: "+ nComp + " Copies: " +nCopies);
  	} 
}

class insertionSort {
	public static void main(String[] args) {
		int maxSize = 100;
		ArrayIns arr = new ArrayIns(maxSize);

		arr.insert(12);
		arr.insert(14);
		arr.insert(20);
		arr.insert(30);
		arr.insert(4);
		arr.insert(67);
		arr.insert(10);
		arr.insert(23);
		arr.insert(40);
		arr.insert(1); 

		arr.display();

		// arr.insertionSort();

		// System.out.println("Median: " + arr.median());
		
		//arr.nCopies_nComp();

	}
}

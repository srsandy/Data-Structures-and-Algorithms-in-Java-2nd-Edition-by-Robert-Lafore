/*
    Solved By: Sandeep Ranjan (1641012352)
    Modified By: Siddhart Saurabh 
    
    Solution for Programming Projects
	7.1,
*/

class ArrayPart {
	private int[] a;
	private int nElems;

	public ArrayPart(int max) {
		a = new int[max];
		nElems = 0;
	}

	public void insert(int value) {
		a[nElems] = value;
		nElems++;
	}

	public int size() {
		return nElems;
	}

	public void display() {
		for(int j=0; j<nElems; j++)
			System.out.print(a[j] + " "); 
		System.out.println("");
	}

	public int doPartition(int l, int r, int pivot) {
		int left = l - 1;
		int right = r + 1;

		while(true) {
			while(left < r && a[++left] < pivot);
			while(right > l && a[--right] > pivot);

			if(left >= right) break;
			else swap(left, right);
		}
		
		return left;
	}
	
	// 7.1
	public int partitionIt(int left, int right) {
    		int pivot = a[right]; 
	 	int leftPtr = left - 1;
	    	int rightPtr = right;

    		while(true) {
      			while(a[++leftPtr] < pivot);

        		while(rightPtr > left && a[--rightPtr] > pivot);
			if(leftPtr >= rightPtr)
        			break;
      			else
        		swap(leftPtr, rightPtr);
		}  
		
    		swap(leftPtr, right);
	    	return leftPtr; 
  	}

	private void swap(int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}

class Partition {
	public static void main(String[] args) {
		int maxSize = 10;
		ArrayPart arr = new ArrayPart(maxSize);

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

		int pivot = 50;
		int partIndex = arr.doPartition(0, arr.size()-1, pivot);
		System.out.println("Pivot: " + pivot);
		System.out.println("Less that Pivot: [0," + (partIndex-1) + "]");
		System.out.println("More that Pivot: [" + partIndex + "," + (arr.size()-1) +"]");
		
		arr.display();
	}
}

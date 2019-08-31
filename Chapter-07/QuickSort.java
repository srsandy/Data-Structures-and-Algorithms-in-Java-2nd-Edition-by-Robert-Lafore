/*
    Solved By: Sandeep Ranjan (1641012352)
*/

class ArrayQuick {
	private int[] arr;
	private int nElems;

	public ArrayQuick(int max) {
		arr = new int[max];
		nElems = 0;
	}

	public void insert(int value) {
		arr[nElems] = value;
		nElems++;
	}

	public void display() {
		for(int j=0; j<nElems; j++)
			System.out.print(arr[j] + " "); 
		System.out.println("");
	}

	public void quickSort(int left, int right) {
		if(right-left <= 0)
			return;

		else {
			int pivot = arr[right];
			int partition = partitionIt(left, right, pivot);

			quickSort(left, partition-1); // sort left side
			quickSort(partition+1, right); // sort right side
		}
	}

	private int partitionIt(int left, int right, int pivot) {
		int leftPtr = left - 1; 
		int rightPtr = right;

		while(true) {
			while( arr[++leftPtr] < pivot );

			while(rightPtr > 0 && arr[--rightPtr] > pivot);

			if(leftPtr >= rightPtr) 
				break;
			else
				swap(leftPtr, rightPtr);
		}

		swap(leftPtr, right);

		return leftPtr;
	}

	private void swap(int indx1, int indx2) {
		int temp = arr[indx1];
		arr[indx1] = arr[indx2];
		arr[indx2] = temp;
	}
}


class QuickSort {
	public static void main(String[] args) {
		int maxSize = 10;
		ArrayQuick a = new ArrayQuick(maxSize);

		a.insert(77);
		a.insert(99);
		a.insert(44);
		a.insert(55);
		a.insert(22);
		a.insert(88);
		a.insert(11);
		a.insert(86);
		a.insert(66);
		a.insert(33);

		a.quickSort(0, maxSize-1);
		a.display();

	}
}
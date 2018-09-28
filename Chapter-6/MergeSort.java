/*
	Solved By: Sandeep Ranjan (1641012352)
*/

class MergeSort {
	static int[] arr;
	static int size;

	public static void main(String[] args) {
		arr = new int[]{14, 2, 52, 36, 34, 78};
		size = arr.length; 

		System.out.println("Before sort");

		for(int i : arr)
			System.out.print(i + " ");  

		System.out.println();

		mergeSort(0,size-1);

		System.out.println("After sort");

		for(int i : arr)
			System.out.print(i + " ");  

	}

	public static void mergeSort(int low, int high) {
		if(low < high) {
			int mid = (low+high) / 2;

			mergeSort(low, mid);
			mergeSort(mid+1, high);

			merge(low, mid, high);
		}
	}

	public static void merge(int low,int mid, int high) {

		int n1 = mid - low + 1; 
        int n2 = high - mid; 

        int[] left = new int[n1]; 
        int[] right = new int[n2]; 

        for (int i=0; i<n1; ++i) 
            left[i] = arr[low + i]; 

        for (int j=0; j<n2; ++j) 
           right[j] = arr[mid + 1+ j];

       	int i = 0, j = 0; 
        int k = low;

        while (i < n1 && j < n2) { 
            if (left[i] < right[j]) { 
                arr[k] = left[i]; 
                i++; 
            } else { 
                arr[k] = right[j]; 
                j++; 
            } 

            k++; 
        } 
  
        while (i < n1) { 
            arr[k] = left[i]; 
            i++; 
            k++; 
        } 
  
        while (j < n2) { 
            arr[k] = right[j]; 
            j++; 
            k++; 
        }
	}
}
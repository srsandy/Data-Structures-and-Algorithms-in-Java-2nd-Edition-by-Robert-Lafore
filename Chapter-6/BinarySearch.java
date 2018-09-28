/*
	Solved By: Sandeep Ranjan (1641012352)
*/

class BinarySearch {
	static int[] arr;
	static int size;

	public static void main(String[] args) {
		arr = new int[]{1, 2, 5, 6, 34, 78};

		size = arr.length;

		int key = 5; //value to be searched

		if( binarySearch(key, 0, size-1) != size ) {
			System.out.println("Found " + key); 
		} else {
			System.out.println("Can't find " + key);
		}

	}


	public static int binarySearch(int key, int low, int high) {
		int mid = (low + high)/2;

		if(arr[mid] == key)
			return mid;

		else if(low > high)
			return size;

		else {
			if(arr[mid] < key) 
				return binarySearch(key, mid+1, high);
			else
				return binarySearch(key, low, mid-1);
		}
	}
}

public class partition {

	private long[] theArray; // ref to array theArray 
	private int nElems; // number of data items

	public partition(int max)
	{
		theArray = new long[max]; nElems = 0;
	}

	public void insert(long value) // put element into array
	{
		theArray[nElems] = value;
		nElems++; // increment size
	}

	public int size() // return number of items 
	{ 
		return nElems; 
	}

	public void display() // displays array contents
	{
		System.out.print("A=");
		for(int j=0; j<nElems; j++) // for each element,
			System.out.print(theArray[j] + " "); // display it 
		System.out.println("");
	}

	public int partitionIt(int left, int right, long pivot)
	{
		int leftPtr = left - 1;
		int rightPtr = right + 1;
		while(true)
		{
			while(leftPtr < right && theArray[++leftPtr] < pivot); // (nop)
			while(rightPtr > left && theArray[--rightPtr] > pivot);
			if(leftPtr >= rightPtr)
				break;
			else
				swap(leftPtr, rightPtr);
		} // end while(true)
		return leftPtr;
	} // end partitionIt()

	public void swap(int dex1, int dex2) {
		long temp;
		temp = theArray[dex1]; 
		theArray[dex1] = theArray[dex2]; 
		theArray[dex2] = temp;
	} // end swap()
} 

// end class partition //////////////////////////////////////////////////////////////// 

class PartitionApp
{
	public static void main(String[] args)
	{
		int maxSize = 16;
		partition arr;
		arr = new partition   (maxSize);
		for(int j=0; j<maxSize; j++) {
			long n = (int)(java.lang.Math.random()*199);
			arr.insert(n);

		}
		arr.display();

		long pivot = 99; // pivot value 
		System.out.print("Pivot is" + pivot);
		int size = arr.size();

		int partDex = arr.partitionIt(0, size-1, pivot);
		System.out.println(", Partition is at index " + partDex);
		arr.display(); // display partitioned array 
	} // end main()

}

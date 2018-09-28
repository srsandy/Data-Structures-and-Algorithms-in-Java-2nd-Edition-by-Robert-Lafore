/*
	Solved By: Sandeep Ranjan (1641012352)
*/

class Anagram {
	static char[] arr;
	static int size;

	public static void main(String[] args) {
		String input = "STOP";
		size = input.length();
		arr = new char[size];

		for(int i=0; i<size; i++) {
			arr[i] = input.charAt(i);
		}

		doAnagram(size);
		
	}

	public static void doAnagram(int newSize) {
		if(newSize == 1)  {
			return;
		}

		for(int i=0; i<newSize; i++) {
			doAnagram(newSize-1); 

			if(newSize==2) {
				displayWord(); 
			}

			rotate(newSize); 
		}
	}

	public static void rotate(int newSize) {
		int j;
		int position = size - newSize; 
		char temp = arr[position]; 

		for(j=position+1; j<size; j++)
			arr[j-1] = arr[j]; 

		arr[j-1] = temp;
	}

	public static void displayWord() {
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}


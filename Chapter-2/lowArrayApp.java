/*
 * Solved by Sumeet Kulkarni (https://github.com/sumeetk321)
 */

class LowArray {
	private long[] a;

	public LowArray(int len) {
		a = new long[len];
	}

	public void set(int index, long val) {
		a[index] = val;
	}

	public long get(int index) {
		return a[index];
	}
}

class lowArrayApp {
	public static void main(String[] args) {
		LowArray arr;
		arr = new LowArray(100);
		int size = 0;
		int j;
		arr.set(0, 12);
		arr.set(1, 2819);
		arr.set(2, 29);
		arr.set(3, 315);
		arr.set(4, 2211);
		arr.set(5, 1);
		arr.set(6, 191);
		arr.set(7, 0);
		arr.set(8, 47);
		arr.set(9, 317);
		size = 10;
		for (j = 0; j < size; j++) {
			System.out.print(arr.get(j) + " ");
		}
		System.out.println("");
		int searchKey = 78;
		for (j = 0; j < size; j++) {
			if (arr.get(j) == searchKey) {
				break;
			}
		}
		if (j == size) {
			System.out.println("Can’t find " + searchKey);
		} else {
			System.out.println("Found " + searchKey);
		}
		for (j = 0; j < size; j++) {
			if (arr.get(j) == 191) {
				break;
			}
		}
		for (int k = j; k < size; k++) {
			arr.set(k, arr.get(k + 1));
		}
		size--;
		for (j = 0; j < size; j++) {
			System.out.print(arr.get(j) + " ");
		}
		System.out.println("");
	}
}

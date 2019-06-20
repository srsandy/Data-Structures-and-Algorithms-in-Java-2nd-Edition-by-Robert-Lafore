/*
	Solved By: Sandeep Ranjan (1641012352)
	
	Solution for Programming Projects
	2.1, 2.2, 2.3, 2.6
*/


import java.util.*;

class HighArray {
	private int[] a;
	private int nEle;
	
	public HighArray(int size) {
		a = new int[size];
		nEle = 0;
	}

	public int getNumEle() {
		return nEle;
	}
 
	public void display() {
		for(int i=0; i<nEle; i++) 
			System.out.print(a[i] + " ");

		System.out.println();
	}

	public void insert(int val) {
		a[nEle] = val;
		nEle++;
	}

	public int search(int val) {
		int i;
		for(i=0; i<nEle; i++) 
			if(a[i] == val) break; 

		if(i == nEle) return (-1);
		else return i;
	}

	public int delete(int val) {
		int index = search(val);
		if(index != -1) {
			for(int k=index; k<nEle-1; k++) { 
				a[k] = a[k+1];
			}
			nEle--;
			return 1;
		}else {
			return 0;
		}	
	}

	public int getMax() {
		if(nEle == 0) return -1;

		int max = a[0];
		for(int i=1; i<nEle; i++) {
			if(a[i] > max) max = a[i];	
		}
		return max;
	}

	public int removeMax() {
		int max = getMax();
		delete(max);
		return max;
	}	

	public void noDups() {
		int value = 0;

		for(int i=0; i<nEle; i++) {
			value = a[i];

			for(int j=i+1; j<nEle; j++) {

				if(a[j] == value) {
					for(int k=j; k<nEle-1; k++) {
						a[k] = a[k+1];
					}
					nEle--;
					j--;
				}
			}
		}
	}
	
}


class highArrayApp {
	public static void main(String[] args) {
		int size = 20;
		HighArray ar = new HighArray(size);
		Scanner sc = new Scanner(System.in);
	
		ar.insert(34);
		ar.insert(56);
		ar.insert(23);
		ar.insert(12);
		ar.insert(90);
		ar.insert(89);
		ar.insert(21);
		ar.insert(77); 
		ar.insert(99); 
		ar.insert(44); 
		ar.insert(55); 
		ar.insert(22); 
		ar.insert(88); 
		ar.insert(11); 
		ar.insert(00); 
		ar.insert(66); 
		ar.insert(33);

		ar.display();
		
		// ELEMENT TO BE SEARCHED
		/*
		System.out.println("Enter the element to be seached");
		int sarch = sc.nextInt();

		if(ar.search(sarch) != -1) {
			System.out.println("Element found");
		} else {
			System.out.println("Element not found");
		}
		*/

		// ELEMENT TO BE DELETED
		/*
		System.out.println("Enter the element to be deleted");
            int del = sc.nextInt();

		ar.delete(del);
		*/

		// SORT ARRAY IN DESC ORDER
		/*
		HighArray ar2 = new HighArray(size);
		
		int len = ar.getNumEle();

		for(int i=0; i<len; i++) {
			int ele = ar.removeMax();
			ar2.insert(ele);
		}

		ar2.display();
		*/

		// REMOVE DUPLICATES
		/*
		ar.noDups();
		ar.display();
		*/
	}
}

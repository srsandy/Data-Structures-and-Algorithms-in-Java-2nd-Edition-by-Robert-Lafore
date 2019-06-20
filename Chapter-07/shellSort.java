/*
Shellsort is based on the insertion sort.

Here’s the problem with the insertion sort. Suppose a small item is on the far right, where the large items should be. 
To move this small item to its proper place on the left, all the intervening items (between the place where it 
is and where it should be) must be shifted one space right. This step takes close to N copies, just for one item. 
Not all the items must be moved a full N spaces, but the average item must be moved N/2 spaces, which takes N times 
N/2 shifts for a total of (N^2)/2 copies. Thus, the performance of insertion sort is O(N^2)
*/

class Shell
{ 
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 

    int sort(int arr[]) 
    { 
        int n = arr.length; 
  
        for (int gap = n/2; gap > 0; gap /= 2) 
        { 
            for (int i = gap; i < n; i += 1) 
            { 
                int temp = arr[i]; 
                int j; 
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) 
                    arr[j] = arr[j - gap]; 
 
                arr[j] = temp; 
            } 
        } 
        return 0; 
    } 

    public static void main(String args[]) 
    { 
        int arr[] = {12, 34, 54, 2, 3}; 
        System.out.println("Array before sorting"); 
        printArray(arr); 
  
        ShellSort ob = new ShellSort(); 
        ob.sort(arr); 
  
        System.out.println("Array after sorting"); 
        printArray(arr); 
    } 
}

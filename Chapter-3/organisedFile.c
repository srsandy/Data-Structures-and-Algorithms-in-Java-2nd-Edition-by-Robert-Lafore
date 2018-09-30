#include <stdio.h>  //header file
#include<time.h>    //header file
#include<stdlib.h>  //header file

//prototypes for mergesort  operation
void merge(int [], int, int, int);
void mergeSort(int [], int, int);
double finalMergeSort(int[], int);

//prototypes for quicksort operation
void quicksort (int [], int, int);
double finalQuickSort(int [],int);

//prototypes for heapsort operation
void heapsort(int [],int);
void heapify(int [],int);
void adjust(int [],int);
double finalHeapSort(int [],int);

//driver function for the entire program
int main()
{
    int n,i;
    double x,y,z;
    system("clear");    //clears the console
    printf("enter the size of the array\n");
    scanf("%d",&n);     //n stores the size of the array
    printf("\n-----------------------------------------------------------------\n");
    int list[n+1];      //to avoid any stack overflow

    /* 
    printf("Enter the elements:\n");  _____
    for(i = 0; i < n; i++)                 |
    {                                      |
         scanf("%d", &list[i]);            |--remove comment tag to access user input in array 
	 printf("=======\n");              |
    }                                 _____|
    */ 
                              
    for(i=0;i<n;i++) //add comment tag to access user input in array 
        list[i]=i;   //add comment tag to access user input in array 
    
    //variables x,y,z store the time returned by the functions mergesort,quicksort and heapsort respectively.
    x=finalMergeSort(list,n);
    y=finalQuickSort(list,n);
    z=finalHeapSort(list,n);

    //comparisions to evaluate which sorting algorithim implemented here has a better runtime for the given data.
    if(x<y)
	{
	   if(x<z)
		{
       		 printf("\n-------------------------------------------------------------------\n");
		 printf("Mergesort is fastest.\n");
        	}
           else if(x==z)
		{
       		 printf("\n-------------------------------------------------------------------\n");
		 printf("Mergesort and Heapsort both are fastest as they take same amount of time\n");
		}
   	   else
		{
        	 printf("\n-------------------------------------------------------------------\n");
		 printf("Heapsort is fastest.\n");
   		}
	}
    //_________________________________________________________________________________________________________
    else if(x==y)
	{
           if(x<z)
		{
       		 printf("\n-------------------------------------------------------------------\n");
		 printf("Heapsort is fastest\n");
		}
	   else
		{
       		 printf("\n-------------------------------------------------------------------\n");
		 printf("Mergesort and Quicksort both are fastest as they take same amount of time\n");
		}
	}
    //_________________________________________________________________________________________________________
    else	
	{
         if(y<z)
		{
	   	 printf("\n-------------------------------------------------------------------\n");
	   	 printf("Quicksort is fastest\n");
    		}
         else if(y==z)
		{
       	         printf("\n-------------------------------------------------------------------\n");
		 printf("Quicksort and Heapsort both ae fastest as take same amount of time\n");
		}
	 else
		{
       		 printf("\n-------------------------------------------------------------------\n");
		 printf("Heapsort is fastest\n");			
		}
	}
    //_________________________________________________________________________________________________________
    return 0;
}
//_____________________________________________________________________________________________________________
//start of implementation of mergesort.

//driver function to implement mergesort
double finalMergeSort(int list[],int size)
{
    int i;
    clock_t t;
    t = clock();
    mergeSort(list, 0, size - 1);
    t = clock() - t;
    printf("After applying merge sort:\n");
    for(i = 0;i < size; i++)
    {
         printf("%d   ",list[i]);
    }
    double time_taken = ((double)t)/CLOCKS_PER_SEC; // in seconds
    printf("\n-------------------------------------------------------------------\n");
    printf("Mergeshort took %f seconds to execute \n", time_taken);
    return time_taken;
}

void mergeSort(int arr[], int l, int r)
{
   if (l < r)
   {
      int m = l+(r-l)/2;
      mergeSort(arr, l, m);
      mergeSort(arr, m+1, r);
      merge(arr, l, m, r);
   }
}
 
void merge(int arr[], int l, int m, int r)
{
    int i, j, k;
    int n1 = m - l + 1;
    int n2 =  r - m;
 
    int L[n1], R[n2];
 
    for (i = 0; i < n1; i++)
        L[i] = arr[l + i];
    for (j = 0; j < n2; j++)
        R[j] = arr[m + 1+ j];
 
    i = 0;
    j = 0;
    k = l;
    while (i < n1 && j < n2)
    {
        if (L[i] <= R[j])
        {
            arr[k] = L[i];
            i++;
        }
        else
        {
            arr[k] = R[j];
            j++;
        }
        k++;
    }
 

    while (i < n1)
    {
        arr[k] = L[i];
        i++;
        k++;
    }
 

    while (j < n2)
    {
        arr[k] = R[j];
        j++;
        k++;
    }
}
//end of implementation of mergesort.

//_____________________________________________________________________________________________________________
//start of implementation of quicksort.

//driver function to implement quick sort.
double finalQuickSort(int list[],int size)
{
    int i;
    clock_t t;
    t = clock();
    quicksort(list, 0, size - 1);
    t = clock() - t;
    printf("\nAfter applying quick sort\n");
    for (i = 0; i < size; i++)
    {
        printf("%d   ", list[i]);
    }
    printf("\n");
    double time_taken = ((double)t)/CLOCKS_PER_SEC; // in seconds
    printf("-------------------------------------------------------------------\n");
    printf("Quicksort took %f seconds to execute \n", time_taken);
    return time_taken;

}

void quicksort(int list[], int low, int high)
{
    int pivot, i, j, temp;
    if (low < high)
    {
        pivot = low;
        i = low;
        j = high;
        while (i < j)
        {
            while (list[i] <= list[pivot] && i <= high)
            {
                i++;
            }
            while (list[j] > list[pivot] && j >= low)
            {
                j--;
            }
            if (i < j)
            {
                temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }
        temp = list[j];
        list[j] = list[pivot];
        list[pivot] = temp;
        quicksort(list, low, j - 1);
        quicksort(list, j + 1, high);
    }
}
//end of implementation of quicksort.

//_____________________________________________________________________________________________________________
//start of impementation of heap sort.

//driver program to implement heap sort.
double finalHeapSort(int list[],int size)
{
        int i;
	clock_t t;
        t = clock();
	heapsort(list,size);
	t = clock() - t;
	printf("\nAfter applying heap sort\n");
        for (i = 0; i < size; i++)
    	{
          printf("%d   ", list[i]);
    	}
	printf("\n");
	double time_taken = ((double)t)/CLOCKS_PER_SEC; // in seconds
        printf("-------------------------------------------------------------------\n");
        printf("Heapsort took %f seconds to execute \n", time_taken);
        return time_taken;
}

void heapsort(int a[],int n) {
	int i,t;
	heapify(a,n);
	for (i=n-1;i>0;i--) {
		t = a[0];
		a[0] = a[i];
		a[i] = t;
		adjust(a,i);
	}
}
void heapify(int a[],int n) {
	int k,i,j,item;
	for (k=1;k<n;k++) {
		item = a[k];
		i = k;
		j = (i-1)/2;
		while((i>0)&&(item>a[j])) {
			a[i] = a[j];
			i = j;
			j = (i-1)/2;
		}
		a[i] = item;
	}
}
void adjust(int a[],int n) {
	int i,j,item;
	j = 0;
	item = a[j];
	i = 2*j+1;
	while(i<=n-1) {
		if(i+1 <= n-1)
		   if(a[i] <a[i+1])
		    i++;
		if(item<a[i]) {
			a[j] = a[i];
			j = i;
			i = 2*j+1;
		} else
		   break;
	}
	a[j] = item;
}
//end of implementation of heap sort.
//_____________________________________________________________________________________________________________

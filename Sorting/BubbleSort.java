// Java program for implementation of Bubble Sort

public class BubbleSort
{
	void bubbleSort(int arr[])
	{
		int n = arr.length;
		boolean swapped;
		for (int i = 0; i < n-1; i++){
		swapped=false;
			for (int j = 0; j < n-i-1; j++)
				if (arr[j] > arr[j+1])
				{
					// swap temp and arr[i]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped=true;
				}
		if(!swapped){
		    break;
		}
		}
	}

	/* Prints the array */
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver method to test above
	public static void main(String args[])
	{
		BubbleSort ob = new BubbleSort();
		int arr[] = {5, 2, 9, 1, 7, 3, 4, 505, 200};
		ob.bubbleSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}

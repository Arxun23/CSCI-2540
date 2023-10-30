/**
 * @author Luis Sanjuan-Cruz
 */
package sep30;


public class Quicksort {

	public static void main(String[] args) {
		
		// Sets up the array
		int[] num = {10, 23, 87, 45, 32, 21, 12, 56, 34};
		int length = num.length;
		
		// Displays array for comparison
		System.out.println("Unsorted Array: ");
		printArray(num);
		
		//starts the sorting
		quickSort(num, 0, length - 1);
		
		// Display the end result
		System.out.println("Sorted Array: ");		
		printArray(num);

	}
	
	/**
	 * Displays the arrays
	 * @param arr
	 */
	public static void printArray(int[] arr)
	{
		for(int x = 0; x < arr.length; x++)
		{
			System.out.println(arr[x] + " ");
		}
	}
	
	/**
	 * Will sort the arrays from smallest to largest
	 * @param arr
	 * @param start
	 * @param end
	 * @return
	 */
	public static int partition(int arr[], int start, int end)
	{
		
		//Picks a pivots
		int pivot =  arr[end];
		
		//Starts on the left side of the array
		int i = (start - 1);
		
		for (int j = start; j <= end - 1; j++)
		{
			//If the value is smaller
			if (arr[j] < pivot)
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
		}
		
		int temp = arr[i + 1];
		arr[i+1] = arr[end];
		arr[end] = temp;
		return (i+1);
	}
	
	/**
	 * Is used to set up the pivot
	 * @param arr
	 * @param start
	 * @param end
	 */
	public static void quickSort(int[] arr, int start, int end)
	{
		int pivot = partition(arr, start, end);
			
		quickSort(arr, start, pivot - 1);
		quickSort(arr, pivot + 1, end);
			
	}

}

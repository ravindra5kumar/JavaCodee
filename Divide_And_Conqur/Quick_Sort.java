package Divide_And_Conqur;

public class Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = { 9, 1, 56, -9, 56, 5, 2, 68, 5, 62, 3, 2, 1, 3, 7 };
		int[] arr = { 7, 5, 1, 3, 9, 4 };
		
		QuickSort(arr, 0,arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void QuickSort(int []arr,int low,int hi) {
		if(low>=hi) {
			return;
		}
		int idx=Partition(arr, low, hi);
		QuickSort(arr, low, idx-1);
		QuickSort(arr, idx+1, hi);
	}

	public static int Partition(int[] arr, int low, int hi) {
		int pivot = arr[hi];
		int idx = low;
		for (int i = low; i < hi; i++) {
			if (arr[i] <= pivot) {
				// swaping i,idx
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
				idx++;

			}
		}
		// swapping idx,hi
		int temp = arr[idx];
		arr[idx] = arr[hi];
		arr[hi] = temp;
		return idx;

	}

}

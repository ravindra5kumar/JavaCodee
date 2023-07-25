package Divide_And_Conqur;

public class Pivoit_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 1, 56, -9, 56, 5, 2, 68, 5, 62, 3, 2, 1, 3, 7 };
//		int[] arr = { 7, 5, 1, 3, 9, 4 };
		int idx = Index(arr, 0, arr.length - 1);
		System.out.println(idx);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int Index(int[] arr, int low, int hi) {
		int lastElement = arr[hi];
		int idx = low;
		for (int i = low; i < hi; i++) {
			if (arr[i] <= lastElement) {
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

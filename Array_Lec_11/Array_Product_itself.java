package Array_Lec_11;

public class Array_Product_itself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4 };
	Product(arr);
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}

	}

	public static int[] Product(int[] arr) {
		int n = arr.length;
		int[] left = new int[n];
		int[] right = new int[n];
		// left Array multiply
		left[0] = 1;
		for (int i = 1; i < n; i++) {
			left[i] = left[i - 1] * arr[i - 1];
		}
		// right Array multiply
		right[n - 1] = 1;// last element mein one rakhna h
		for (int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] * arr[i + 1];
		}
		// both Left multiply right
		for (int i = 0; i < right.length; i++) {
			arr[i] = left[i] * right[i];
		}

		return arr;
	}

}

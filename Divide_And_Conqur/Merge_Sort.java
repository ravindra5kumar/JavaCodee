package Divide_And_Conqur;

public class Merge_Sort {
	public static void main(String[] args) {
		int []arr= {7,3,2,15,17,1};
		int []ans1=mergeSort(arr,0,arr.length-1);
		for (int i = 0; i < ans1.length; i++) {
			System.out.print(ans1[i]+" ");
		}
	}

	public static int[] mergeSort(int[] arr,int low,int hi){
		  // TODO Auto-generated method stub
		if(low==hi) {
			int []a=new int[1];
			a[0]=arr[low];
			return a;
			
		}
		int mid=(low+hi)/2;
		int []first=mergeSort(arr,low,mid);
		int []second=mergeSort(arr, mid+1, hi);
		return Merge_twoSorted_Array(first,second);
		
	}

	public static int[] Merge_twoSorted_Array(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int n=arr1.length;
		int m=arr2.length;
		int []ans=new int[n+m];
		int i=0;//arr1
		int j=0;//arr2
		int k=0;//ans

		while (i < n && j < m) {

			if (arr1[i] <= arr2[j]) {
				ans[k] = arr1[i];
				k++;
				i++;
			} else {
				ans[k] = arr2[j];
				j++;
				k++;
			}

		}
		while (i < n) {
			ans[k] = arr1[i];
			k++;
			i++;
		}

		while (j < m) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		return ans;
	}

}

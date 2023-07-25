package Array_Lec_11;

public class Maximum_SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {5,-7,8,3};
		MaxSub(arr);

	}
	public static void MaxSub(int[]arr) {
		int ans=Integer.MIN_VALUE;//-2^31 ye sabse choti value h yahi set kr diye h
		for (int i = 0; i < arr.length; i++) {
			int presum=0;
			for (int j = i; j < arr.length; j++) {
				presum+=arr[j];
				ans=Math.max(ans, presum);
			}
		}
		System.out.println(ans);
	}

}

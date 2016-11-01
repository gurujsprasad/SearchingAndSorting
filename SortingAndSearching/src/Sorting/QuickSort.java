package Sorting;


	public class QuickSort {

	static int [] nums = {3,8,1,4,6,8,6,9,6,1};
	public static void main (String args[]){
		
		quickSort (nums, 0, nums.length-1);
		for(int i = 0;i< nums.length;i++){
			System.out.println(nums[i]);
		}
	}

	private static void quickSort(int[] nums, int p, int r) {
		
		if (p<r){
			int q = partition(nums,p, r);
			quickSort(nums,p, q-1);
			quickSort(nums, q+1, r);
		}
		
	}

	private static int partition(int[] nums, int p, int r) {
		int i = p-1;
		for(int j = p; j < r ; j ++ ){
			if (nums[j] <= nums[r] ){
				
				i = i + 1;
				int temp = nums[i];
				nums[i]= nums[j];
				nums[j] = temp;	
			}
		}
		
		int temp = nums[i+1];
		nums[i+1] = nums[r];
		nums[r] = temp;
		return i+1;
	}

}

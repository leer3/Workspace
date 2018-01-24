
public class ArrayLearning {

	public static void main(String[] args){
		
		int[] nums = {1,2,3,4,5};
		System.out.println(nums.length);
		System.out.println(nums[0]);
		System.out.println(nums[nums.length-2]);
		System.out.println(getMaxElement(nums));//should print 10
		System.out.println(getMinElement(nums));//should print 1
		System.out.println(getArraySum(nums));//should print 7
		System.out.println(getArrayAverage(nums));//should print 4
		
		for(int i = 0; i < nums.length; i++){
			System.out.println(nums[i]);
		}
		
//		int[] vals = new int[1000];
//		
//		for(type variable : collection)
//		for(int val : vals){
//			System.out.println(val);
//		}
	}
	
	//returns the maximum element in the array
	public static int getMaxElement(int[] nums){
		int max = nums[0];
		for(int num : nums){
			max = Math.max(num, max);
		}
		
		/*
		 * for(int i = 0; i < max.length; i++){
		 * 		max = Math.max(max, nums[i];
		 * {
		 */
		return max;
	}
	//returns the minimum element in the array
	public static int getMinElement(int[] nums){
		int min = nums[0];
		for(int num : nums){
			min = Math.min(num, min);
		}
		
		/*
		 * for(int i = 0; i < min.length; i++){
		 * 		min = Math.max(min, nums[i];
		 * {
		 */
		return min;
	}
	//get the sum of the array
	public static int getArraySum(int[] nums){
		int sum = 0;
		for(int num : nums){
			sum += num;
		}
		return sum;
	}
	//returns the average of the array
	public static double getArrayAverage(int[] nums){
		return (getArraySum(nums) / (double) nums.length);
	}
	
}

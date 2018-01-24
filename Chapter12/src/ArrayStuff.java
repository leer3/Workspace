import java.util.Arrays;

public class ArrayStuff {

	public static void main(String[] args) {
		int[] nums = {3,33,333,3333,33333};
		
		System.out.println("****Before For-Each Loop****");
		System.out.println(Arrays.toString(nums)); //shows the array
		
		for(int num : nums){
			num += 5;
		}
		System.out.println("****After For-Each Loop****");
		System.out.println(Arrays.toString(nums));
		
		for(int i = 0; i < nums.length; i++){
			nums[i] += 5;
		}
		System.out.println("****After For Loop****");
		System.out.println(Arrays.toString(nums));
		
	}

}

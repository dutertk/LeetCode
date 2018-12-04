package solution;

public class RotateArraySolutionThree {
	public void rotate(int[] nums, int k) {
		if (k % nums.length == 0 || nums.length ==0) {
			return;
		}
		int[] newArray = new int[nums.length];
		
		for(int i = 0; i < nums.length; i++) {
			newArray[(i + k) % nums.length] = nums[i];
		}
		
		for(int i = 0; i< nums.length; i++) {
			nums[i] = newArray[i];
		}
	}

}

package solution.array;
/**
 * 第二个方法，参考了其他的博客，
 * 这种方法我应该能想到的
 * 但是不知道能不能被leetcode接受
 * 因为这个算法要求的空间复杂度为O(1)
 * ps:什么是空间复杂度需要在以后学习
 * @author TK
 *
 */
public class RotateArraySolutionTwo {
	public void Rotate(int[] nums, int k) {
		if (nums.length == 0 || k%nums.length == 0) {
			return;
		}else {
		
		while(k > 0) {
			int temp = nums[nums.length-1];
					for (int i = nums.length-2; i >= 0; i--) {
						nums[i+1] = nums[i];
					}
					nums[0] = temp;
					k--;
		}
	}}

}

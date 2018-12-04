package solution;
/**
 * 第一次并没有注意到数组去重
 * 只是返回了重复数字的个数
 * 导致submit提交的时候报错
 * 
 * @author TK
 *
 */
public class RemoveDuplicatesFromSortedArraySolution {
	public int removeDuplicates(int[] nums) {
		if (nums.length == 0 || nums == null) return 0;
		int returnValue = 0;
		for(int i = 1; i < nums.length; i++) {
			if(nums[returnValue] != nums[i]) {
				returnValue++;
				nums[returnValue] = nums[i];
			}
		}
		return returnValue+1;
	}

}

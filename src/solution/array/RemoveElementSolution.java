package solution.array;

public class RemoveElementSolution {
	public int removeElement(int[] nums, int val) {
		//多余了这段（选中以后的注释快捷键ctrl+shift+/）
		/*if(nums.length == 0 || nums == null) {
			return 0;
		}*/
		int returnValue = 0;
		for(Integer num : nums) {
			if (num != val) {
				nums[returnValue] = num;
				returnValue++;
			}
		}
		return returnValue;
	}

}

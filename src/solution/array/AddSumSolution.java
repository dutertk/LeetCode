package solution.array;

import java.util.HashMap;
import java.util.Set;

public class AddSumSolution {
	
	public int[] twoSum(int[] nums, int target) {
		
		
		int[] returnIndex = new int[2];
		for(int i = 0; i <= nums.length-1;i++) {
			for (int j = i+1; j <= nums.length-1;j++) {
				if(nums[i] + nums[j] == target) {
					returnIndex[0] = i;
					returnIndex[1] = j;
					break;
				}
			}
		}
		return returnIndex;
	}
}

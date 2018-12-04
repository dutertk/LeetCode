package solution;
/**
 *  通过k步，翻转数组(LeetCode 提交的时候提示Time Limit Exceeded)
 *  查询该问题存在的原因可能是算法不够优化
 */
import java.util.LinkedList;

public class RotateArraySolution {
	public void rotate(int[] nums, int k) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		for(Integer number : nums) {
			linkedList.add(number);
		}
		
		int i = 1;
		int j = 0;
		while(i <= k) {
			linkedList.add(0,linkedList.getLast());
			linkedList.removeLast();
			for(Integer newnumber : linkedList) {
				nums[j] = newnumber;
				j++;
			}
			i++;
			j=0;
		}
	}

}

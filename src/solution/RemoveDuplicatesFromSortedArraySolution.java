package solution;
/**
 * ��һ�β�û��ע�⵽����ȥ��
 * ֻ�Ƿ������ظ����ֵĸ���
 * ����submit�ύ��ʱ�򱨴�
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

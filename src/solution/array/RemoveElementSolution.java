package solution.array;

public class RemoveElementSolution {
	public int removeElement(int[] nums, int val) {
		//��������Σ�ѡ���Ժ��ע�Ϳ�ݼ�ctrl+shift+/��
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

package solution.array;
/**
 * �ڶ����������ο��������Ĳ��ͣ�
 * ���ַ�����Ӧ�����뵽��
 * ���ǲ�֪���ܲ��ܱ�leetcode����
 * ��Ϊ����㷨Ҫ��Ŀռ临�Ӷ�ΪO(1)
 * ps:ʲô�ǿռ临�Ӷ���Ҫ���Ժ�ѧϰ
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

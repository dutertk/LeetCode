package solution;
/**
 *  ͨ��k������ת����(LeetCode �ύ��ʱ����ʾTime Limit Exceeded)
 *  ��ѯ��������ڵ�ԭ��������㷨�����Ż�
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

package solution.array;
/**
 * ѡ�������javaʵ��
 * ���������ҵ���С���Ǹ�����������Ȼ�����һ������
 * ��ʣ�µ��������ҵ���С���Ǹ�����������Ȼ����ڶ�������
 * �Դ�����....
 * 
 * @author TK
 *
 */
public class SelectionSortSolution {
	public void SelectionSort(int[] nums) {
		for(int i=0;i < nums.length-1;i++) {
			int minPosition = i;
			for(int j = i;j < nums.length;j++) {
				if (nums[j] < nums[minPosition]) {
					minPosition = j;
				}
			}
			if (nums[minPosition] != nums[i]) {
				int temp = nums[i];
				nums[i] = nums[minPosition];
				nums[minPosition] = temp;
			}
		}
	}

}

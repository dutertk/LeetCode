package solution.array;
/**
 * 
 * ��������ļ�ʵ��
 * ��δ�������������������һһ�Ƚ�
 * @author TK
 *
 */
public class InsertionSortSolution {
	public void InsertSort(int[] nums) {
		int j, temp;
		for(int i = 1;i < nums.length;i++) {
			j = i;
			//��ǰ��������������бȽϣ���С�򽻻�
			while(j > 0 && nums[j] < nums[j-1]) {
				temp = nums[j-1];
				nums[j-1] = nums[j];
				nums[j] = temp;
				j--;
			}
		}
	}

}

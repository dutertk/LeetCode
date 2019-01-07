package solution.array;
/**
 * 
 * 插入排序的简单实现
 * 将未排序的数字与有序数组一一比较
 * @author TK
 *
 */
public class InsertionSortSolution {
	public void InsertSort(int[] nums) {
		int j, temp;
		for(int i = 1;i < nums.length;i++) {
			j = i;
			//当前数与有序数组进行比较，若小则交换
			while(j > 0 && nums[j] < nums[j-1]) {
				temp = nums[j-1];
				nums[j-1] = nums[j];
				nums[j] = temp;
				j--;
			}
		}
	}

}

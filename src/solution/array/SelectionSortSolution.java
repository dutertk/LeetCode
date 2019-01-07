package solution.array;
/**
 * 选择排序的java实现
 * 从数组中找到最小的那个数的索引，然后与第一个交换
 * 从剩下的数组中找到最小的那个数的索引，然后与第二个交换
 * 以此类推....
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

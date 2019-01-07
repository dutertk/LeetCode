package demo.array;

import solution.array.RemoveElementSolution;

public class RemoveElementSolutionTest {
	public static void main(String[] args) {
		int[] nums = new int[] {0,1,2,2,3,0,4,2};
		int val = 2;
		RemoveElementSolution removeElementSolution = new RemoveElementSolution();
		int length = removeElementSolution.removeElement(nums, val);
		System.out.println(removeElementSolution.removeElement(nums, val));
		for(int i = 0;i < length;i++ ) {
			System.out.println(nums[i]);
		}
	}

}

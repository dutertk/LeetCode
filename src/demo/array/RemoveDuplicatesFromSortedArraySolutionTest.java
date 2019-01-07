package demo.array;

import solution.array.RemoveDuplicatesFromSortedArraySolution;

public class RemoveDuplicatesFromSortedArraySolutionTest {
	public static void main(String[] args) {
		RemoveDuplicatesFromSortedArraySolution solutionTest = new RemoveDuplicatesFromSortedArraySolution();
		int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
		int num = solutionTest.removeDuplicates(nums);
		System.out.println(num);
	}
	

}

package demo;

import solution.InsertionSortSolution;

public class InsertionSortSolutionTest {
	public static void main(String[] args) {
		int[]  nums = new int[] {2,15,8,22,19,3,17,6};
		InsertionSortSolution insertionSortSolution = new InsertionSortSolution();
		insertionSortSolution.InsertSort(nums);
		for(Integer num : nums) {
			System.out.println(num);
		}
	}

}

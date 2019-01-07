package demo.array;

import solution.array.SelectionSortSolution;

public class SelectionSortSolutionTest {
	public static void main(String[] args) {
		int[]  nums = new int[] {2,15,8,22,19,3,17,6};
		SelectionSortSolution selectionSortSolution = new SelectionSortSolution();
		selectionSortSolution.SelectionSort(nums);
		for(Integer num : nums) {
			System.out.println(num);
		}
	}

}

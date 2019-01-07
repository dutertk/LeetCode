package demo.array;

import solution.array.AddSumSolution;

public class AddSumSolutionTest {
	public static void main(String args[]) {
		AddSumSolution addSumSolution = new AddSumSolution();
		int[] nums = {3,3};
		int	target = 6;

		int[] index = addSumSolution.twoSum(nums, target);
		for(Integer indexNumber : index) {
			System.out.println(indexNumber);
			
		}
		
	}
	
}

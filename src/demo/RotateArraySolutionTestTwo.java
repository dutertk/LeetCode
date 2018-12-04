package demo;

import solution.RotateArraySolutionTwo;

public class RotateArraySolutionTestTwo {
	public static void main (String[] args) {
		RotateArraySolutionTwo rotateArraySolutionTwo = new RotateArraySolutionTwo();
		int[] nums = new int[] {-1,-100,3,99};
		rotateArraySolutionTwo.Rotate(nums, 8);
		for(Integer num : nums) {
			System.out.println(num);
		}
		
	}

}

package demo.array;

import solution.array.RotateArraySolutionThree;

public class RotateArraySolutionThreeTest {
	public static void main(String[] args) {
		RotateArraySolutionThree rotateArraySolutionThree = new RotateArraySolutionThree();
		int[] nums = new int[] {-1,-100,3,99};
		
		rotateArraySolutionThree.rotate(nums, 3);
		
		for(Integer num : nums) {
			System.out.println(num);
		}
		
	} 

}

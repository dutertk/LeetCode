package demo;
/**
 * 通过k步，翻转数组
 * 
 */
import solution.RotateArraySolution;

public class RotateArraySolutionTest {
	public static void main(String[] args) {
		RotateArraySolution rotateArraySolution = new RotateArraySolution();
		int[] nums = new int[] {-1,-100,3,99};
		rotateArraySolution.rotate(nums, 2);
		for(Integer num : nums) {
			System.out.println(num);
		}
	}

}

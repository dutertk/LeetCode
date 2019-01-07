package demo.string;

import solution.string.RomanToIntegerSolution;
import solution.string.RomanToIntegerSolutionTwo;

public class RomanToIntegerSolutionTest {
	public static void main (String[] args) {
		RomanToIntegerSolution solution = new RomanToIntegerSolution();
		int returnValue = solution.romanToInterger("III");
		System.out.println(returnValue);
		System.out.println("------------");
		RomanToIntegerSolutionTwo solutionTwo = new RomanToIntegerSolutionTwo();
		returnValue = solutionTwo.romanToInt("MCMXCIV");
		System.out.println(returnValue);
		
	}

}

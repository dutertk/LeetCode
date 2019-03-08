package solution.array;
/**
 * ���õݹ����Fibonacci��
 * ֻ������37���㷨
 * @author TK
 *
 */

import java.util.HashMap;

public class FibonacciNumberSolution {
	HashMap<Integer, Integer> resultHashMap = new HashMap<>();
	public int getFib(int N) {
		
		return N < 2? N : getFib(N-1) + getFib(N-2);
	}
	
	//LeetCode��1 ms submission
	
	public int getFieWithHashMap(int N) {
		
		if(N <= 1) return N;
		if (resultHashMap.containsKey(N)) return resultHashMap.get(N);
	    int result = getFieWithHashMap(N-1) + getFieWithHashMap(N-2);
	    resultHashMap.put(N, result);
	    return result;
	}

}

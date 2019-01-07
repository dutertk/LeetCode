package solution.string;

import java.util.HashMap;

public class RomanToIntegerSolution {
	public int romanToInterger(String string) {
		int returnValue = 0;
		returnValue += getValue(string.charAt(0));
		for (int i = 1; i < string.length(); i++) {
			int pre = getValue(string.charAt(i - 1));
			int cur = getValue(string.charAt(i));
			if (pre < cur) {
				returnValue += cur - pre * 2;
			} else {
				returnValue += cur;
			}
		}

		return returnValue;

	}

	public int getValue(Character c) {
		int value;
		switch (c) {
		case 'V':
			value = 5;
			break;
		case 'X':
			value = 10;
			break;
		case 'L':
			value = 50;
			break;
		case 'C':
			value = 100;
			break;
		case 'D':
			value = 500;
			break;
		case 'M':
			value = 1000;
			break;
		default:
			value = 1;
			break;
		}
		return value;
	}
}

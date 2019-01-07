package solution.string;

import java.util.HashMap;

public class RomanToIntegerSolutionTwo {
	public int romanToInt(String s) {
        if(s.length() == 0)
            return 0;
        int returnValue = 0;
        HashMap<Character,Integer> hashmap  = new HashMap();
        hashmap.put('I',1);
        hashmap.put('V',5);
        hashmap.put('X',10);
        hashmap.put('L',50);
        hashmap.put('C',100);
        hashmap.put('D',500);
        hashmap.put('M',1000);
        returnValue += hashmap.get(s.charAt(0));
        for(int i = 1;i < s.length();i++){
            int previousNumber = hashmap.get(s.charAt(i-1));
            int currentNumber = hashmap.get(s.charAt(i));
            if(previousNumber < currentNumber){
                returnValue += currentNumber - previousNumber * 2;
                
            }else{
                returnValue += currentNumber;
            }
            
        }
        return returnValue;
    }
}

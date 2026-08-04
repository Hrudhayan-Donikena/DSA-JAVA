package Arrays;
import java.util.*;

/*
problem: An array list consists of only String(numbers) and numbers,
return the sum of the list elements.

Approach
1. Traverse elements in the list, find out to what class the elements belong.
2. convert the elements into their particular class.
3. Now convert all elements to Interger class and add to the sum.

Time complexity: O(n)
Space complexity: O(1)
*/

public class SumOfUnknowns {
    public static int addElementsOfUnknownType(List<Object> nums) {
        int eleSum = 0;
        for(Object o : nums) {
            Object currEle = o;
            if(currEle instanceof String){
                Integer element = Integer.parseInt((String)currEle);
                eleSum += element;
            } else if(currEle instanceof Integer){
                Integer ele = (Integer)currEle;
                eleSum += ele;
            }
        }

        return eleSum;

    }

    public static void main(String[] args){
        List<Object> nums = new ArrayList<>();
        nums.add(10);
        nums.add("20");
        nums.add("30");
        nums.add(15);
        nums.add("5");
        int res = addElementsOfUnknownType(nums);
        System.out.println(res);
    }
}

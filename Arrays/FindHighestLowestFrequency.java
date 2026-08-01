package Arrays;

import java.util.HashMap;

/*
Problem: Find Highest and Lowest Frequency Element

Pattern: Frequency Counting
Data Structure: HashMap

Approach:
1. Traverse the array and count frequencies using a HashMap.
2. Traverse the HashMap to identify the highest and lowest frequency elements.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class FindHighestLowestFrequency {
    
    static void highestLowest(int[] arr) {
    
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int leastFeqEle = -1, leastFreq = Integer.MAX_VALUE;
        int highestFreqEle = -1, highestFreq = Integer.MIN_VALUE;

        for(int key : map.keySet()){
            int currentKey = key;
            int currentFreq = map.get(key);
                if(currentFreq > highestFreq) {
                    highestFreq = currentFreq;
                    highestFreqEle = currentKey;
                }
                if(currentFreq < leastFreq) {
                    leastFreq = currentFreq;
                    leastFeqEle = currentKey;
                }
        }

        System.out.println(leastFeqEle+" "+highestFreqEle);
    }

    public static void main(String[] args){
        int[] arr = {1,1,4,4,2,5,2,2,4,4,4};
        highestLowest(arr);
    } 
}

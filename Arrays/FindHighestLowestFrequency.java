package Arrays;

import java.util.HashMap;

public class FindHighestLowestFrequency {
    static void highestLowest(int[] arr) { // SC = O(1);
       // creating a hashmap to store the elements and their freqencies
       // key -> array elements, value -> element frequencies
       HashMap<Integer,Integer> map = new HashMap<>();

       // creating entries of the map
        for(int num : arr) { // TC = O(n); 
            map.put(num, map.getOrDefault(num, 0) + 1);

        }

        int leastFeqEle = -1, leastFreq = Integer.MAX_VALUE;
        int highestFreqEle = -1, highestFreq = Integer.MIN_VALUE;

        // Finding highest and lowest freqency element
        for(int key : map.keySet()){ // TC = O(n);
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

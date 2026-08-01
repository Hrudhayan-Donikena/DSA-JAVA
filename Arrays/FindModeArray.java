package Arrays;
import java.util.*;

public class FindModeArray {

    static int highestFreqEle(int[] arr) {
        // creating a hashmap to store the array elements and their frequencies.
        HashMap<Integer,Integer> freq = new HashMap<>();

        int maxFreqEle = -1;
        int maxFreq = -1;

        // storing each element of the arr in the map
        for(int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);

            // comparing frequencies of each key(element).
            for(int key : freq.keySet()){
                int currentKey = key;
                int currentFreq = freq.get(key);
                if(currentFreq > maxFreq) {
                    maxFreq = currentFreq;
                    maxFreqEle = currentKey;
                }
            }
        }
        return maxFreqEle;
    }


    static void main(String[] args){
        int[] arr = {1,1,4,4,2,5,2,2,4,4,4};
        int ans = highestFreqEle(arr);
        System.out.println(ans);
    }
}

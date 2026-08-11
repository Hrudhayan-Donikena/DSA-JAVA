package Arrays;

import java.util.LinkedHashMap;

/*
Problem : Find first repeating element in an array and return that element.

Pattern : Freqency counting.
Data Structure: LinkedHashMap.

Approach
1) Store each element of given array in a hashmap.
2) Update the freq of the element in the map.
3) Check and return the first element which occured atleast twice.
4) If there is no element which is repeating return -1.

Time complexity : O(n)
Space complextiy : O(n).
*/

public class FirstRepeatingElement {
    public static int findFirstRepeatingElement(int[] arr){
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            int ele = arr[i];
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        } 

        for(Integer key : map.keySet()){
            int freq = map.get(key);
            if(freq > 1){
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {6,10,5,4,9,120,4,6,10};
        int res = findFirstRepeatingElement(arr);
        System.out.println(res);
    }
}

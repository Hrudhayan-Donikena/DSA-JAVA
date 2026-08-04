package Arrays;

/*
problem: An array contains only 0s and 1s,
sort elements such that all 0s are placed before any 1s.

pattern: Two pointer

Approach
1. Traverse the array from left to right and right to left using two pointers.
2. Swap all 0s to the complete left with the 1s to the complete right,


Time Complexity: O(n/2) --> O(n)
Space Complexity: O(1)
 */

public class SortOsAnd1s {
    public static int[] sortingZerosAndOnes(int[] arr) {
        int i = 0;
        int arrLength = arr.length;
        int j = arrLength-1;
        while(i<j) {
            if(arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            } else if(arr[i] == 0) {
                i++;
            } else if(arr[j] == 1) {
                j--;
            }
        }
        return arr;
    }


    public static void main(String[] args){
        int[] arr = {1,1,0,0,0,1};
        int[] res = sortingZerosAndOnes(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}

package Arrays;

/*
problem: Find missing element from the given array with range 1 to n;

Approach
1.Perform Xor between each number in the range.
2.Traverse array and Perform Xor between each element in the array.
3.Now perform Xor between results of step1 & step2.
Note : 
1. a ^ a = 0.
2. a ^ 0 = a.

Time complexity = O(n)
Space complexity = O(1);
*/

public class MissingNumber {
    public static int findMissingNumber(int[] nums, int n) {
        int rangeXor = 0;
        for(int i=1;i<=n;i++){
            rangeXor ^= i;
        }
        int elementXor = 0;
        for(int i=0;i<nums.length;i++){
            elementXor ^= nums[i];
        }
        int missingNumber = rangeXor ^ elementXor;

        return missingNumber;
    }

    public static void main(String[] args){
        int[] nums = {5,2,4,1};
        int res = findMissingNumber(nums,5);
        System.out.println(res);
    }
}

package LeetCode.Arrays;

/*
Problem: Maximum Subarray
Platform: LeetCode #53

Approach: Kadane's Algorithm

Time Complexity: O(n)
Space Complexity: O(1)

Key Idea:
For each element, decide whether to start a new subarray or extend
the previous one. If the previous running sum is negative, discard it
because it would only decrease the sum of any future subarray.
*/

public class MaximumSubArraySum {
    public static int findMaxSubArraySum(int[] nums){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            sum += nums[i];

            if(sum > maxSum){
                maxSum = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int res = findMaxSubArraySum(nums);
        System.out.println(res);
    }
}

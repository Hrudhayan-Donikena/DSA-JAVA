package Arrays;

/*
Problem: The sum of numbers strictly to the left of index i equals
the sum of numbers strictly to the right of index i. 

Pattern: Prefix & Suffix Sum Arrays.

Approach: 
1) Calculate Prefix Sums (Left to Right):
   - Traverse forward to compute running prefix sums including nums[i], storing them in 'ls'.
2) Calculate Suffix Sums (Right to Left):
   - Traverse backward to compute running suffix sums including nums[i], storing them in 'rs'.
3) Find Equilibrium/Pivot Point:
   - Iterate through the array and compare ls[i] and rs[i].
   - The first index where ls[i] == rs[i] is the pivot index (since adding nums[i] to both sides preserves leftSum == rightSum).
   - If no match is found after the loop, return -1.

Time Complexity = O(n) + O(n) + O(n) -> O(n).
Space Complexity = O(n) + O(n) -> O(n). 
*/

public class FindPivotIndex {
    public static int findPivotIndex(int[] nums){
        int n = nums.length;
        int[] ls = new int[n];
        int[] rs = new int[n];

        int leftS = 0;
        for(int i=0;i<n;i++){
            leftS += nums[i];
            ls[i] = leftS;
        }

        int rightS = 0;
        for(int i=n-1;i>=0;i--){
            rightS += nums[i];
            rs[i] = rightS; 
        }

        for(int i=0;i<n;i++){
            if(ls[i] == rs[i]){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args){
        int nums[] = {1,7,3,6,5,6};
        int res = findPivotIndex(nums);
        System.out.println(res);
    }
}

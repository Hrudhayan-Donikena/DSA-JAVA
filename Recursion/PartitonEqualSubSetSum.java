package Recursion;

public class PartitonEqualSubSetSum {
    public static boolean solve(int[] nums,int amt,int i){
        if(amt == 0){
            return true;
        }
        if(amt < 0 || i >= nums.length){
            return false;
        }

        return solve(nums,amt-nums[i],i+1) || solve(nums, amt, i+1);
    }
    public static boolean partitionPossibility(int[] nums){
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        if((sum & 1) == 1){
            return false;
        }

        return solve(nums, sum/2, 0);
    }


    public static void main(String[] args){
        int[] nums = {1,5,11,5};
        System.out.println(partitionPossibility(nums));
    }
}

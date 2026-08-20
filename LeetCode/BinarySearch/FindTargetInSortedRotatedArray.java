package LeetCode.BinarySearch;

/*
Problem: Search in Rotated Sorted array
Platform: LeetCode #33

Pattern: Binary Search.

Goal: Find index of the target element.

Time Complexity: O(log n)
Space Complexity: O(1)

Key Idea:
1) Even though the entire array is not sorted, at least one half
   of the array will always be sorted.
2) Identify which half is sorted.
3) Check whether the target lies within that sorted half.
4) If it does, search that half; otherwise search the other half
*/

public class FindTargetInSortedRotatedArray {
    public static int findPivotIndex(int[] nums){
        int start = 0;
        int end = nums.length-1;
        int pivot = -1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] >= nums[0]){
                pivot = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return pivot;
    }

     public static int searchTarget(int[] nums,int start,int end, int target){
         while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int searchTargetInArray1(int[] nums,int target){
        int pivot = findPivotIndex(nums);
        int start = 0;
        int end = pivot;
        
        int targetIndex = searchTarget(nums, start, end, target);
        return targetIndex;
    }

    public static int searchTargetInArray2(int[] nums,int target){
        int pivot = findPivotIndex(nums);
        int start = pivot+1;
        int end = nums.length-1;

       int targetIndex = searchTarget(nums, start, end, target);
       return targetIndex;
    }

    public static int findTargetInSortedRotatedArray(int[] nums,int target){

        if(nums == null || nums.length == 0){
            return -1;
        }
        if(nums[0] <= nums[nums.length-1]){
            return searchTarget(nums, 0, nums.length-1, target);
        }

        int pivot = findPivotIndex(nums);
        int targetIndex = -1;

        if(target >= nums[0] && target <= nums[pivot]){
             targetIndex = searchTargetInArray1(nums, target);
        } else {
             targetIndex = searchTargetInArray2(nums, target);
        }

        return targetIndex;
    }


    public static void main(String[] args){
        int[] nums = {4,5,6,7,8,1,2,3};
        int res = findTargetInSortedRotatedArray(nums, 2);
        System.out.println("Target index : "+res);
    }
}

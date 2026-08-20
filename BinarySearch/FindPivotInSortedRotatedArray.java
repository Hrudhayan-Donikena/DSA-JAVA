package BinarySearch;

/*
Problem: Find Pivot index in a sorted rotated array

Algorithm: Modified Binary Search

Key Idea: 
There are always two sorted arrays in the given array,Array1 starts
from index 0 and ends at the position from which the order of elements 
changes and Array2 starts from the next postition.
    Array1 elements > Array2 elements
    if arr[mid] >= arr[0] -> we are in Array1, 
    Store mid, move right for another potential element.
    if arr[mid] < arr[0] -> we are in Array2,
    simply move to Array1, which is to left

Time Complexity: O(log n)
Space Complexity: O(1)
*/

public class FindPivotInSortedRotatedArray {
    public static int findPivotIndexInSortedRotatedArray(int[] nums){
        int start = 0;
        int end = nums.length-1;
        int pivotIndex = -1;

        if(nums[0] <= nums[nums.length-1]){
            return -1;
        }

        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] >= nums[0]){
                pivotIndex = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return pivotIndex;
    }

    public static void main(String[] args){
        int[] nums = {4,5,6,7,8,1,2};
        int res = findPivotIndexInSortedRotatedArray(nums);
        System.out.println(res);
    }
}

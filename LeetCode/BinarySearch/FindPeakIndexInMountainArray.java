package LeetCode.BinarySearch;

/*
Problem: Find Peak Value index Of a Mountain Array
Platform: LeetCode #852

Pattern: Binary Search - Peak/Turning Point.

Goal: Find Max value index

Time Complexity: O(log n)
Space Complexity: O(1)

Key Idea:
For each mid value comparision decide whether to search the left half or 
right half, if midvalue < mid+1 value, Max element will be on the
right half, if midvalue >= mid+1 value the mid value can be a potential and 
search for another potential to the left half.
*/

public class FindPeakIndexInMountainArray {
    public static int findingPeakIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            } 
            else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr = {5,10,20,30,40,50,35,25};
        int res = findingPeakIndex(arr);
        System.out.println(res);
    }
}


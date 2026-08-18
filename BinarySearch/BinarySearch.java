package BinarySearch;

/*
Problem: Find target using Binary Search

Algorithm: Binary Search

Approach
1) Initialize start, end, and mid.
2) Compare the target with the middle element and choose the appropriate half.
3) Update start/end and recalculate mid after each iteration.
4) Repeat until the target is found or the search space becomes empty.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

public class BinarySearch {
    public static int findTargetUsingBinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int mid = start + ((end - start) / 2); // avoids overflow

        while(start <= end){
            if(arr[mid] == target){
                return mid;
            } else if(target < arr[mid]){ // Search left
                end = mid-1;
            } else {
                // target > arr[mid]. // Search right
                start = mid + 1;
            }
            mid = start + ((end - start) / 2);
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70,80};
        int res = findTargetUsingBinarySearch(arr, 80);
        System.out.println(res);
    }
}

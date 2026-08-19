package BinarySearch;

/*
Problem: Find Peak Value Of a Mountain Array

Pattern: Binary Search - Peak/Turning Point.

Goal: Find Max value

Approach
1) Initialize start,end and calculate mid for each iteration
2) Our target value is the last value of the ascending order and first value of the descending order
3) Check if the midvalue >= mid+1 value,if true its a potential answer and store it.And search in the left half to mid for another potential answer
4) if mid value < mid+1 value , then the target is in the right half to the mid.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

public class FindPeakValueOfMountainArray {
    public static int findPeakValueOfMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] < arr[mid+1]){
                start = mid+1;
            } else {
                ans = arr[mid];
                end = mid-1;
            }
        }
        return ans;
    }


    public static void main(String[] args){
        int[] arr = {5,10,20,30,40,50,35,25};
        int res = findPeakValueOfMountainArray(arr);
        System.out.println(res);
    }
}

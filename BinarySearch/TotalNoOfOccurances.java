package BinarySearch;

/*
Problem: find total no of occurances of a target.

Algorithm: Binary Search.

Approach
1) Find first occurance index using binary search (LowerBound).
2) Find the index of the first position after the last occurrence using Binary Search (UpperBound).
3) Calculate number of occurances using UpperBound - LowerBound.

Time Complexity: O(log n).
Space Complexity: O(1).
*/

public class TotalNoOfOccurances {
    public static int lowerBound(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        int lB = arr.length;
        
        while(s<=e){
            int mid = s + (e-s)/2; // avoids overflow
            if(arr[mid] >= target){ // Search left
                lB = mid;
                e = mid - 1;
            } else { // Search right
                s = mid + 1;
            }
        }
        return lB;
    }

    public static int upperBound(int[] arr,int target){
        int s = 0;
        int e = arr.length-1;
        int uB = arr.length;

        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid] <= target){ // Search right
                s = mid + 1;
            }
            else { // Search left
                uB = mid;
                e = mid - 1;
            }
        }
        return uB;
    }


    public static void main(String[] args){
        int[] arr = {20,30,30,30,30,50};
        int lowerB = lowerBound(arr, 20);
        int upperB = upperBound(arr, 20);
        System.out.println(upperB-lowerB);
    }
}

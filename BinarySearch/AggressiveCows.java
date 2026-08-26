package BinarySearch;
import java.util.Arrays;

/*
Problem: Place cows(k) in given stalls along a straight line in such a way
that the minimum distance between any two cows is as large as possible.

Pattern: Binary Search on Answer.

Time Complexity: O(n log D).
Space Complexity: O(1).
*/

public class AggressiveCows {
    public static boolean isValidAns(int mid , int k,int[] stalls){
        int cowCount = 1;
        int lastPlaced = 0;

        for(int i=1;i<stalls.length;i++){
            if(stalls[i] - stalls[lastPlaced] >= mid){
                cowCount++;
                lastPlaced = i;
            }
            if(cowCount == k){
                return true;
            }
        }
        return false;
    }
    public static int agressiveCows(int[] stalls,int k){
        Arrays.sort(stalls);
        int n = stalls.length;
        int s = 1;
        int e = stalls[n-1] - stalls[0] + 1; 

        int ans = 0;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(isValidAns(mid,k,stalls)){
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr = {1,2,8,4,9};
        System.out.println(agressiveCows(arr, 3));
    } 
}

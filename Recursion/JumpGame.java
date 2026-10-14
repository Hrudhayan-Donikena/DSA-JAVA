package Recursion;

/*
Problem: Find if it is possible to reach the last index of the given array,
you can move forward at max array[i] steps. 

Algorithm: Recursion

Time Complextiy: O(2^n); 
Space Complextiy: O(n); 
*/

public class JumpGame {
    public static boolean solve(int[] arr,int i){
        if(i == arr.length-1){
            return true;
        }
        if(i >= arr.length){
            return false;
        }
       
        int step = 1;
        while(step <= arr[i]){
            boolean currAns = solve(arr, i+step);
            if(currAns){
                return currAns;
            }
            step++;
        }
        return false;
    }

    public static boolean endReachable(int[] arr){
        int i = 0;
        return solve(arr,i);
    }

    public static void main(String[] args){
        int[] arr = {2,3,1,1,4};
        System.out.println(endReachable(arr));
    }
}

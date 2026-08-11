package Arrays;

/*
Problem : Remove Duplicates from given sorted array of nums(ascending order).
return length of array which contains no duplicates.

Patters : Fast & Slow pointers.

Approach
1) Initialize i at index 0;
2) Initialize j at index 1;
3) Traverse given array and Search for unique values while comparing values
at index i and j, when found increment i and store value at j in i.

Time complexity : O(n);
Space complexity : O(1);
*/

public class RemoveDuplicates {
    public static int removeDuplicatesFromSortedArray(int[] nums){
        int i=0;
        int j=1;
        int n = nums.length;
        while(j<n){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
                j++;
            } else {
                j++;
            }
        }
        return i+1;
    } 

    public static void main(String[] args){
        int nums[] = {1,2,2,2,2,3,3,4};
        int length = removeDuplicatesFromSortedArray(nums);
        System.out.println(length);
    }
}

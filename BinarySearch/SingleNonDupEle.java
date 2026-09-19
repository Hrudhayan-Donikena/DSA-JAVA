package BinarySearch;

/*
Problem: Find the single non repeating element in the array where every other
element repeats exactly twice.

Pattern: BinarySearch.

Time Complexity: O(log n).
Space Complexity: O(1) auxiliary space.
*/

public class SingleNonDupEle {
    public static int findNonDuplicateEle(int[] arr){
        int s = 0;
        int e = arr.length - 1;

        while(s<=e){
            int mid = s + (e-s)/2;

            int previousValue = -1;
            if(mid - 1 >= 0){
                previousValue = arr[mid - 1];
            }
            int nextValue = -1;
            if(mid + 1 < arr.length){
                nextValue = arr[mid + 1];
            }
            

            if(arr[mid] != previousValue && arr[mid] != nextValue){
                return arr[mid];
            }

            if(arr[mid] == previousValue && arr[mid] != nextValue){
                if((mid & 1) == 1){
                    s = mid + 1;
                } else {
                    e = mid + 1;
                }
            } else if (arr[mid] != previousValue && arr[mid] == nextValue){
                if((mid & 1) == 1){
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] arr = {10};
        System.out.println(findNonDuplicateEle(arr));
    }
}

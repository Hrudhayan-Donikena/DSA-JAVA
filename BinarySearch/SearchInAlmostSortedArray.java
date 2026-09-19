package BinarySearch;

/*
Problem: Search an element in an almost sorted array.
Time Complexity: O(log n).
Space Complexity: O(1) auxiliary space.
*/

public class SearchInAlmostSortedArray {
    public static int searching(int[] arr,int target){
        int s = 0;
        int e = arr.length - 1;

        while(s <= e){
            int mid = s + (e-s)/2;

            if(mid - 1 >= 0 && arr[mid - 1] == target){
                return mid - 1;
            }
            if(arr[mid] == target){
                return mid;
            }
            if(mid + 1 < arr.length && arr[mid + 1] == target){
                return mid + 1;
            }


            if(target > arr[mid]){
                s = mid + 2;
            } else {
                e = mid - 2;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] arr = {10,20,40,30,50,60,70};
        System.out.println(searching(arr, 40));
    }
}

package BinarySearch;

/*
Problem: Search target in an Unbounded(infinite) sorted array.

Pattern: BinarySearch, exponential search / doubling

Time Complexity: O(log p).
Space Complexity: O(1) auxiliary space.
*/

public class UnboundedSearch{
    public static int searchTargetInUnboundedArray(int[] infinite,int target){
        int s = -1;
        int e = -1;

        int i = 0;
        if(infinite[i] == target){
                return i;
        }
        else {
            i = 1;
        }

        while(e < 0){
            if(infinite[i] == target){
                return i;
            }
            else if (infinite[i] <= target){
                s = i;
                i = i * 2;
            } else {
                e = i;
            }
        }

        while(s<=e){
            int mid = s + (e-s)/2;

            if(infinite[mid] == target){
                return mid;
            } else if(infinite[mid] < target){
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return -1;
    }


    public static void main(String[] args){
        int[] infinite = {};
        System.out.println(searchTargetInUnboundedArray(infinite, 90));
    } 
}
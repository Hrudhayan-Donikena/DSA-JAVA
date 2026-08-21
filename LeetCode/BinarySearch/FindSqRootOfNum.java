package LeetCode.BinarySearch;

/*
Problem: Find sq root of a number
Platform: LeetCode #69

Pattern: Binary Search on Answer.

Time Complexity: O(log n)
Space Complexity: O(1)

Key Idea:
1) Square root of a number always stays between 0 and the number;
2) Since digits from 0 and number are in order, we can use Binary search
3) Search the range by checking mid * mid, store any potential value and 
move to find next best potential.
*/

public class FindSqRootOfNum {
    public static int findSqRootOfANum(int num){
        int start = 1;
        int end = num;
        int sqRoot = -1;

        if(num == 0){
            sqRoot = 0;
        }

        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid  == num/mid){
                return mid;
            } else if(mid > num/mid){
                end = mid - 1;
            } else {
                sqRoot = mid;
                start = mid + 1;
            }
        }
        return sqRoot;
    }

    public static void main(String[] args){
        System.out.println(findSqRootOfANum(81));
    }
}

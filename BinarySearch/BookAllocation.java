package BinarySearch;

/*
Problem: Book Allocation to Students.

Each array element represents a book,
and its value represents the number of pages in that book.

Pattern: Binary Search on Answer.

Goal: Minimize the maximum number of pages
allocated to any single student.

Approach:
1) The minimum possible answer is the maximum pages
   in a single book.
2) The maximum possible answer is the sum of all pages.
3) Binary search between these two values.
4) For each mid, check whether all books can be
   allocated to the given number of students such that
   no student gets more than mid pages.
5) If allocation is possible, try a smaller maximum.
6) If allocation is not possible, increase the maximum.

Time Complexity: O(n log S) -> s = sum of all pages.
Space Complexity: O(1)
*/

public class BookAllocation {

    public static boolean isValidAns(int[] arr, int mid, int k){
        int studentCount = 1;
        int pages = 0;
        for(int i=0;i<arr.length;i++){
            if(pages + arr[i] <= mid){
                pages += arr[i];
            } else {
                studentCount++;
                if(arr[i] > mid || studentCount > k){
                    return false;
                } else {
                    pages = 0;
                    pages += arr[i];
                }
            }
        }
        return true;
    }
    
    public static int minOfMaxPages(int[] arr,int k){
        if(arr.length < k){
            return -1;
        }

        int start = 1;
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        int end = sum;

        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isValidAns(arr,mid,k)){
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    } 


    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        int ans = minOfMaxPages(arr, 2);
        System.out.println(ans);
    }
}

package BinarySearch;

/*
Problem: Find and return the index of the row in a 2d array.Where each row contains
 either 0,1 or both arranged in a non decreasing order.

Pattern: BinarySearch.

Time Complexity: O(n * log m). n -> no of rows, m -> times mid calculated for each row.
*/

public class RowWithMax1s{
   public static int rowIndexWithMax1s(int[][] matrix){
        int res = -1;
        int max = 0;
        
        int row = 0;

    // Traversing each row
        while(row < matrix.length){
            int count = 0;

            int s = 0;
            int e = matrix[row].length - 1;

            int indexTrack = -1;
        
        // Searching for first occurance of 0 in the array
            while(s<=e){
                int mid = s + (e-s)/2;

                if(matrix[row][mid] == 0){
                    indexTrack = mid;
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        
        // calculating no of times 1 occured in the current row 
            if(indexTrack < 0){
                count = matrix[row].length;
            } else {
                count = (matrix[row].length - indexTrack) - 1;
            }
            
        // comparing current row count with the previous max row count and updating. 
            if(count > max){
                max = count;
                res = row;
            }

            row++;
        }

        return res;
   }


    public static void main(String[] args){
       int[][] matrix = {{1,1,1,1}};
       System.out.println(rowIndexWithMax1s(matrix));
    }
}
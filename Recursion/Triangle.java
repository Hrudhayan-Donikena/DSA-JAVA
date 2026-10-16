package Recursion;
import java.util.*;

/*
Problem: Given triangle array, return min path sum from top to bottom.

Algorithm: Recursion.

Time Complexity: O(2 ^ n). n -> List size.
Space Complexity: O(n).
*/

public class Triangle {
    public static int solve(List<List<Integer>> triangle,int row,int col){
        if(row == triangle.size()-1){
            return triangle.get(row).get(col);
        }

        int below = solve(triangle,row+1,col);
        int diagonal = solve(triangle,row+1,col+1);

        return triangle.get(row).get(col) + Math.min(below,diagonal);
    }

    public static int minPathSum(List<List<Integer>> tri){
        int i = 0;
        int j = 0;
        return solve(tri,i,j);
    }


    public static void main(String[] args){
        List<List<Integer>> tri = List.of(
            List.of(2),
            List.of(3,4),
            List.of(6,5,7),
            List.of(4,1,8,3)
        );
        
        
        System.out.println(minPathSum(tri));
    }
}

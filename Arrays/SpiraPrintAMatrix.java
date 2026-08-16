package Arrays;
import java.util.*;

public class SpiraPrintAMatrix{
    public static List<Integer> spiralMatrix(int[][] arr){
        List<Integer> list = new ArrayList<>();
        int n = arr.length;

        int top = 0;
        int right = n-1;
        int bottom = n-1;
        int left = 0;

        while(top <= bottom && left <= right){
            for(int row=left;row<=right;row++){
                list.add(arr[left][row]);
            }
            top++;

            for(int col=top;col<=bottom;col++){
                list.add(arr[col][bottom]);
            }
            right--;
            
            if(top <= bottom){
                for(int row=right;row>=left;row--){
                list.add(arr[bottom][row]);
            }
                bottom--;
            }

            if(left <= right){
                for(int col=bottom;col>=top;col--){
                list.add(arr[col][left]);
            }
                left++;
            }
            
        }
        return list; 
    } 


    public static void main(String[] args){
        int[][] arr = {
            {1,2,3},
            {4,3,8},
            {9,10,11}
        };
        List<Integer> res = spiralMatrix(arr);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
}

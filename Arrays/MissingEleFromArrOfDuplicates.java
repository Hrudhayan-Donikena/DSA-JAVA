package Arrays;
import java.util.*;

/*
Problem: Find missing element(s) from an array containing duplicate numbers (1 to N).

Pattern: Index Marking / In-Place Hashing.

Approach:
1) Iterate through the array to process each value.
2) Treat `Math.abs(arr[i]) - 1` as an index.
3) Mark the element at that index as negative to indicate the number `(index + 1)` exists.
4) Traverse the array a second time; any index containing a positive value represents a missing number `(index + 1)`.

Time Complexity: O(n).
Space Complexity: O(1).
*/

public class MissingEleFromArrOfDuplicates {
    public static List<Integer> findMissingElementFromArrOfDups(int[] arr){
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            int value = Math.abs(arr[i]);
            int postiton = value - 1;

            // index marking
            if(arr[postiton] > 0){
                arr[postiton] = -arr[postiton];
            }
        }
        
        // finding missing elements
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                list.add(i+1);
            }
        }

        return list;
    }

    public static void main(String[] args){
        int[] arr = {3,2,3,4,5};
        List<Integer> res = findMissingElementFromArrOfDups(arr);
        for(Integer i : res){
            System.out.print(i + " ");
        }
    }
}

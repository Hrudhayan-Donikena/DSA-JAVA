package Sorting;

public class InsertionSort {
    public static int[] insertionSort(int[] arr){
        int n=arr.length;

        // initializing current value and previous value index
        for(int i=1;i<n;i++){
            int currVal = arr[i];
            int preVal = i-1;
            // creating an empty space to insert the current value in its correct index
            while(preVal >= 0 && arr[preVal]>currVal){
                arr[preVal+1] = arr[preVal];
                preVal--;
            }
            // inseting the element
            arr[preVal+1] = currVal;
        }
        return arr;
    } 


    public static void main(String[] args){
        int[] arr = {6,5,1,3,4};
        int[] res = insertionSort(arr);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
}

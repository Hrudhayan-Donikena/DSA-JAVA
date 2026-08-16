package Sorting;

public class SelectionSort {
    public static int[] selectionSort(int[] arr){
        int n=arr.length;
        // no of iterations
        for(int i=0;i<n-1;i++){
            int minValueIndex = i;
            // finding the index of the minimum value
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minValueIndex]){
                    minValueIndex = j;
                }
            }
            // placing the minimum value in its correct position
            int temp = arr[minValueIndex];
            arr[minValueIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    } 


    public static void main(String[] args){
        int[] arr = {5,6,4,1,3};
        int[] res = selectionSort(arr);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
}

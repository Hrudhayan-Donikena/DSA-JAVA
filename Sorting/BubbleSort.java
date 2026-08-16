package Sorting;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                // comparing adjacent elements and swapping them in correct positions
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args){
        int[] arr = {6,3,1,2,5};
        int[] res = bubbleSort(arr);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
}

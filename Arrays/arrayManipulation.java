package Arrays;

public class arrayManipulation {
     static int[] revArr() {
        int[] arr = {2,4,6,8,9};
        // int[] revArr = new int[arr.length];
        // for(int i = arr.length-1;i>=0;i--){ // TC = O(n); SC = O(n);
        //     int j = arr.length - 1 - i;
        //     revArr[j] = arr[i];
        // }
        // return revArr;

        // or using two pointers
        int i = 0;
        int j = arr.length-1;
        while(i<=j) { // TC = O(n/2); SC = O(1)
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] =temp;
            i++;
            j--;
        }
        return arr;
    }

    // move array elements by 1 index
    static int[] moveElementsByIndex1() {
        int[] arr = {10,20,30,40};
        // int[] resArr = new int[arr.length];
        // int i = 0;
        // int temp = arr[arr.length-1];
        // while(i < arr.length-1) {
        //     resArr[i+1] = arr[i];
        //     i++;
        //     if(i == arr.length-1) {
        //         resArr[0] = temp;
        //     }
        // }
        // return resArr; 

        // or 
        int i = arr.length-1;
        int temp = arr[arr.length-1];
        while(i >= 0){
            arr[i] = arr[i-1];
            i--;
        }
            arr[0] = temp;
        return arr;
    }
     static void main(String[] args) {
        int[] resArr = moveElementsByIndex1();
        for(int i : resArr){
            System.out.print(i+" ");
        }
        // int revArr[] = revArr();
        // for(int i : revArr){
        //     System.out.print(i+" ");
        // }
    }
}

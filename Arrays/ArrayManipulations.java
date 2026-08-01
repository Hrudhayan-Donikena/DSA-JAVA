package Arrays;

public class ArrayManipulations {
     static int[] revArr() {
        int[] arr = {2,4,6,8,9};

        // using two pointers
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


    // Move array elements by 1 index
    static int[] moveElementsByIndex1() {
        int[] arr = {10,20,30,40};

        int i = arr.length-1;
        int temp = arr[arr.length-1];

        while(i >= 0){ // TC = O(n); SC = O(1);
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

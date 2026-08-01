package Arrays;

public class PrintExtremeElements {
    static void extremeEle() {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int i=0;
        int j = n-1;
        while(i<=j){ // TC = O(n/2), SC = O(1);
            if(i == j) {
                System.out.print(arr[i]+" ");
            } else {
                System.out.print(arr[i]+" "+arr[j]+" ");
            }
            i++;
            j--;
        }
    }

    static void main(String[] args) {
        extremeEle();
    } 
}

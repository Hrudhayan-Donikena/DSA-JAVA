package Arrays;

public class BeginnerLevel { 

    // muyltiply each element of an array by 10 
    public int[] mulArr() {
        int[] arr = {1,2,3,4,5};
         
        for(int i=0;i<arr.length;i++) { // TC = O(n); SC = O(1);
            arr[i] = arr[i] * 10;
        }
        return arr;
    }

    // search(Linear) for an element in a given array
    public void keySearch(int key){
        int[] ar = {5,2,8,3,0};
        int keyStatus = 0;
        for(int i=0;i<ar.length;i++){ // TC = O(n); SC = O(1);
            if(ar[i] == key){
                System.out.println("key found at index : "+i);
                keyStatus++;
            }
        }  
        if(keyStatus == 0){
            System.out.println("key not found in the array");
        }
    }

    // max element in an array
    public int maxEle() {
        int[] arr = {11,2,6,8,10};
        int max = arr[0];
        for(int i=1;i<arr.length;i++){ // TC = O(n); SC = O(1);
            max = Math.max(max, arr[i]); // Math.max(int a, int b) return max between a,b
        }
        return max;
    }

    // return sum of +ve nums and -ve nums in an array;
    public int[] sumOfPNnums() { // TC = O(n);
        int[] arr = {-1,2,3,-4,-5,0};
        int Psum = 0;
        int Nsum = 0;
        int[] arrOfSums = new int[2];
        for(int i=0;i<arr.length;i++){
          if(arr[i] >= 0){
            Psum += arr[i];
          } else 
            Nsum += arr[i];
        }
        arrOfSums[0] = Psum;
        arrOfSums[1] = Nsum;
        return arrOfSums;
        // System.out.println("Sum of +ve numbers : "+Psum);
        // System.out.println("Sum of -ve numbers : "+Nsum);
    }
    
    // counting no of 1's and 0's in the array
    public void oneZero() {
        int[] arr = {1,2,3,1,0,0,5,0};
        int count1 = 0;
        int count0 = 0;
        for(int i : arr){ // TC = O(n); SC = O(1);
            if(i == 1){
                count1++;
            } else if(i == 0)
                count0++;
        }
        System.out.println("No of Ones : "+count1);
        System.out.println("No of Zeros : "+count0);
    }

    // find an element in an unsorted array,
    // array is sorted , an element inside the array behaves unsorted
    public int unsortedEle(){
        int arr[] = {10,2,3,4,7,};
        for(int i=0;i<arr.length;i++){ // TC = O(n); SC = O(1);
            if(arr[i] > arr[i+1]){
               return arr[i];
            }
        }
        return 0; // return 0 if there is no such element in the array
    }

    // swap alternate Elements in array
    public int[] swapAlt(){
        int[] arr = {1,2,3,4,5,6};
        for(int i=0;i<arr.length;i+=2){ // TC = O(n); SC = O(n);
            int initialEle = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = initialEle;
        }
        return arr;
    }


    // print intersection of two arrays
    public void commEle() { // TC = O(n^2); SC = O(1);
      int[] arr1 = {1,2,3,4,5};
      int[] arr2 = {4,5,6,7,8};

      for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr2.length;j++){
            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i]+" ");
                break; // Once the match is found inner loop exits;
            }
        }
      }
    }

    
    // print alternate extremes of an array
    public void altExtEle() {
        int[] arr = {1,2,3,4,5,6,7};
           for(int i=0;i<arr.length>>1;i++){ // TC = O(n); SC = O(1);
                int j = arr.length-1-i;
                System.out.print(arr[i]+" ");
                System.out.print(arr[j]+" "); 
            }
            if(arr.length % 2 != 0){
                System.out.print(arr[arr.length>>1]); 
            }
       
    }
    

    public void main(String[] args) {
        
        altExtEle();
        // commEle();


        // int[] swappedArr = swapAlt();
        // for(int i : swappedArr){
        //     System.out.print(i+" ");
        // }


        // System.out.println(unsortedEle());
        // oneZero();

        // int[] arrOfSums = sumOfPNnums();
        // for(int i : arrOfSums){
        //     System.out.print(i+" ");
        // }

        // System.out.println("Max element in array is "+maxEle());

        // keySearch(10);

        // int[] newArr = mulArr();
        // for(int i : newArr) {
        //     System.out.print(i+" ");
        // }

        // int[] nums = {1,2,3,4,5,1,7};
        // avgOfArrElm(nums);

    }
}

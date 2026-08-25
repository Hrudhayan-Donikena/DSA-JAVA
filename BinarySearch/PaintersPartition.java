package BinarySearch;

public class PaintersPartition {
    public static boolean isValidMaxLength(int[] boards,int mid, int k){
        int lengthPainted = 0;
        int painterCount = 1;
        
        for(int i=0;i<boards.length;i++){
            if(lengthPainted + boards[i] <= mid){
                lengthPainted += boards[i];
            } else {
                painterCount++;
                if(boards[i] > mid || painterCount > k){
                    return false;
                } else {
                    lengthPainted = 0;
                    lengthPainted += boards[i];
                }
            }
        }
        return true;
    }

    public static int totalBoardsLength(int[] boards){
        int sum = 0;
        for(int i=0;i<boards.length;i++){
            sum += boards[i];
        }
        return sum;
    }

    public static int minTime(int[] boards,int k){
        int start = 0;
        int end = totalBoardsLength(boards);
        int resTime = 0;

        while(start<=end){
            int mid = start + (end -start)/2; // max length
            if(isValidMaxLength(boards,mid, k)){
                resTime = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return resTime;
    }


    public static void main(String[] args){
        int[] boards = {10,10,10,10};
        int minTime = minTime(boards, 3);
        System.out.println(minTime+"'s");
    }
}

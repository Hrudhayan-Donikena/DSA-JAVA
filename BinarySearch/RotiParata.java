package BinarySearch;

/*
Problem: codeHelp Q) 411.
Pattern: BinarySearch on Answer.
*/

public class RotiParata {
    public static boolean isValidAns(int[] cooks,int timeLimit, int p){
        int paratasCooked = 0;
        for(int i=0;i<cooks.length;i++){
            int currCookRank = cooks[i];
            int totalTimeConsumed = 0;
            int j = 1;

            while(totalTimeConsumed <= timeLimit){

                if(paratasCooked >= p){
                    return true;
                }

                if(totalTimeConsumed + (j* currCookRank) <= timeLimit){
                    paratasCooked++;
                    totalTimeConsumed += j * currCookRank;
                    j++;
                }
                else {
                    break;
                }
            }

        }

        return false;
    }
    public static int minTimeToCoolAllParatas(int[] cooks,int p){
        int maxRank = -1;

        for(int i=0;i<cooks.length;i++){
            if(cooks[i] > maxRank){
                maxRank = cooks[i];
            }
        }

        int start = 0;
        int end = maxRank * (p * (p+1)) / 2;
        int ans = -1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(isValidAns(cooks,mid,p)){
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

       

        return ans;
    }


    public static void main(String[] args){
        int[] cooks = {1,2,3,4};
        System.out.println(minTimeToCoolAllParatas(cooks, 10));
    }
}

package BinarySearch;

/*
Time complexity: O(n log m); n -> n operations performed for every
mid calculated , m -> mid
Space complexity: O(1);
*/

public class EkoSpoj {
    public static boolean isValidHeight(int[] tree,int maxHeight,int m){
        long woodCollected = 0;
        for(int i=0;i<tree.length;i++){
            if(tree[i] >= maxHeight){
                woodCollected += tree[i] - maxHeight;
            }
        }
        if(woodCollected >= m){
            return true;
        }
        return false;
    }
    public static int maxHeight(int[] tree,int m){
        int maxHeight = -1;
        int start = 0;
        int max = -1;

        for(int i=0;i<tree.length;i++){
            if(tree[i] > max){
                max = tree[i];
            }
        }
        int end = max;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(isValidHeight(tree,mid,m)){
                maxHeight = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return maxHeight;
    }
    public static void main(String[] args){
        int[] tree = {20,15,10,17};
        System.out.println(maxHeight(tree, 7));
    }
}

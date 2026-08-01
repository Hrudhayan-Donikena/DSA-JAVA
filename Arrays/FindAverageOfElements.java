package Arrays;

public class FindAverageOfElements {
    static void avgOfArrElm(int[] nums) { // find avg of elements in an array
        double sum = 0;
        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
        }
        double avg = (sum / nums.length);
        System.out.println(avg);
    }

    static void main(String[] args){
        int[] nums = {1,5,2,7};
        avgOfArrElm(nums);
    }

}

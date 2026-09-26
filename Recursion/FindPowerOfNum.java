package Recursion;

public class FindPowerOfNum {
    public static int findPowerOfNum(int num,int power){
        if(power == 1){
            return num;
        }

        return num * findPowerOfNum(num,power-1);
    }


    public static void main(String[] args) {
        System.out.println(findPowerOfNum(5,2));
    }
}

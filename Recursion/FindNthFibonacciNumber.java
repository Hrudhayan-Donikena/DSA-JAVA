package Recursion;

public class FindNthFibonacciNumber {
    public static int fibonacciNum(int n){
        if(n == 0){
            return 0; 
        }
        if(n == 1){
            return 1;
        }

        return n = fibonacciNum(n-1) + fibonacciNum(n-2);
    }


    public static void main(String[] args){
        System.out.println(fibonacciNum(9));
    }
}

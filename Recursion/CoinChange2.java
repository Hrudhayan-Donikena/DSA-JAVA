package Recursion;

/*
Problem: you are given few coins(elements in the array coins), find all 
possible unique ways to form the amount combining the given coins.

Time Complexity: O(2^n).
Space Complexity: O(n + amount). 
*/

public class CoinChange2 {
    public static int solve(int[] coins, int index, int amount){
        if(amount == 0){
            return 1;
        }
        if(amount < 0 || index >= coins.length){
            return 0;
        }

        int include = solve(coins, index, amount-coins[index]);
        int exclude = solve(coins, index+1, amount);

        return include + exclude;
    }

    public static int allPossibleWaysToFormTheAmount(int[] coins, int amount){
        int index = 0;
        int ans = solve(coins, index, amount);
        return ans;
    }
    public static void main(String[] args){
        int[] coins = {1,2,5};
        System.out.println("Ways : " + allPossibleWaysToFormTheAmount(coins, 3));
    }
}

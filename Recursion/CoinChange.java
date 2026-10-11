package Recursion;

/*
Problem: Find the fewest coins used to make up the amount.

Pattern: Recursion.

Time Complexity: O(2^amount + n).
Space Complexity: O(amount + n).
*/

public class CoinChange {
    public static int solve(int[] coins, int amount,int i){
        if(amount == 0){
            return 0;
        }
        if(amount < 0 || i >= coins.length){
            return Integer.MAX_VALUE;
        }

        int min = Integer.MAX_VALUE;

       int include = solve(coins,amount-coins[i],i);
       if(include != Integer.MAX_VALUE){
            int coinsUsed = 1 + include;
            min = Math.min(min,coinsUsed);
        }
       int exclude = solve(coins, amount, i + 1);
    
        return Math.min(min,exclude);
    }

    public static int findingAns(int[] coins,int amount){
        if(amount == 0){
            return 0;
        }
        int i = 0;
        int minSteps = solve(coins,amount,i);
        if(minSteps == Integer.MAX_VALUE){
            return -1;
        }
        return minSteps;
    }

    public static void main(String[] args){
        int[] coins = {1,2,5};
        System.out.println(findingAns(coins,11));
    }
}

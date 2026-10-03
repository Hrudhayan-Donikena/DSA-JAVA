package Recursion;

/*
Problem: You are given houses with the value, pick non adjacent houses 
such that all the combined value make up the most out of all possible 
picking combinations.

Time Complexity: O(2^n).
Space Complexity: O(n).
*/

public class HouseRobber {
    public static int solve(int[] houses, int i){
        if(i >= houses.length){
            return 0;
        }
        int robCurrHouse = houses[i] + solve(houses, i+2);
        int skipCurrHouse = solve(houses, i+1);

        int max = Math.max(robCurrHouse,skipCurrHouse);
        return max; 
    }
    public static int maxProfit(int[] houses){
        int i = 0;
        int ans = solve(houses, i);
        return ans;
    }
    public static void main(String[] args){
        int[] houses = {100,1,1,100};
        System.out.println("Max Profit : " + maxProfit(houses));
    }
}

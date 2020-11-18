package Leetcode;

import java.util.Arrays;
//https://leetcode.com/problems/coin-change/submissions/
public class Coin_Change {
    static int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }

        }
        return dp[amount] > amount ? -1 : dp[amount];        }
        public static void main(String args[]){
            int []coins = {1,2,5};
        System.out.println(coinChange(coins,11));//3
            coins =new int[] {2};
            System.out.println(coinChange(coins,3));//-1
            coins =new int[] {1};
            System.out.println(coinChange(coins,0));//0
            coins =new int[] {1};
            System.out.println(coinChange(coins,1));//1
            coins =new int[] {1};
            System.out.println(coinChange(coins,2));//2
            coins =new int[] {186,419,83,408}            ;
            System.out.println(coinChange(coins,6249));//20


        }
}

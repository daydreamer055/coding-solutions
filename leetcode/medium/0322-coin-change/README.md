# Coin Change

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `coins` representing coins of different denominations and an integer `amount` representing a total amount of money.

Return the  **fewest**  number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

You may assume that you have an infinite number of each kind of coin.

 

 **Example 1:** 

```
Input: coins = [1,2,5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1

```

 **Example 2:** 

```
Input: coins = [2], amount = 3
Output: -1

```

 **Example 3:** 

```
Input: coins = [1], amount = 0
Output: 0

```

 

 **Constraints:** 

- 1 <= coins.length <= 12
- 1 <= coins[i] <= 231 - 1
- 0 <= amount <= 104

## Solution

**Language:** Java  
**Runtime:** 44 ms (beats 5.84%)  
**Memory:** 48.2 MB (beats 5.22%)  
**Submitted:** 2026-10-26T17:42:35.531Z  

```java
class Solution {
    public long coin(int i,int[] coins, int amount,long[][] dp){
        if(i == coins.length){
            if(amount==0) return 0;
            else return Integer.MAX_VALUE;
        }
        if(dp[i][amount]!= -1) return dp[i][amount];
        long skip = coin(i+1,coins,amount,dp);
        if(amount-coins[i]<0) return dp[i][amount] = skip;
        long pick = 1+coin(i,coins,amount-coins[i],dp);
        return dp[i][amount] = Math.min(pick,skip);
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        long[][] dp = new long[n][amount+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        int ans= (int)coin(0,coins,amount,dp);
        if(ans == Integer.MAX_VALUE) return -1;
        return ans;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/coin-change/)
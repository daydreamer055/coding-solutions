# coin-change2448

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-22T15:33:27.384Z  

```java
class Solution {
    public int cn(int coins[], int sum,int n,int[][]dp){
        if(sum==0) return 1;
        if(n==0) return 0;
        if(dp[n][sum]!= -1){
            return dp[n][sum];
        }
        int coin = coins[n-1];
        if(coin<= sum){
            int include = cn(coins,sum-coin,n,dp);
            int exclude = cn(coins,sum,n-1,dp);
            dp[n][sum] = include+exclude;
        }
        else{
            int exclude = cn(coins,sum,n-1,dp);
            dp[n][sum] = exclude;
        }
        return dp[n][sum];
    }
    public int count(int coins[], int sum) {
        // code here.
        int n = coins.length;
        int[][] dp = new int[n+1][sum+1];
        for(int i=0; i<n+1; i++){
                   Arrays.fill(dp[i], -1);
               }
        return cn(coins,sum,n,dp);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/coin-change2448/1)
# Minimum Path Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a `m x n` `grid` filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.

 **Note:**  You can only move either down or right at any point in time.

 

 **Example 1:** 

```
Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
Output: 7
Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.

```

 **Example 2:** 

```
Input: grid = [[1,2,3],[4,5,6]]
Output: 12

```

 

 **Constraints:** 

- m == grid.length
- n == grid[i].length
- 1 <= m, n <= 200
- 0 <= grid[i][j] <= 200

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 22.91%)  
**Memory:** 49.6 MB (beats 96.73%)  
**Submitted:** 2026-10-14T17:15:41.228Z  

```java
class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0) dp[i][j] = grid[i][j];
                else if(i==0) dp[i][j] = grid[i][j]+dp[i][j-1];
                else if(j==0) dp[i][j] = grid[i][j]+dp[i-1][j];
               else dp[i][j] = grid[i][j] + Math.min(dp[i-1][j],dp[i][j-1]); 
            }
        }
        return dp[m-1][n-1];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-path-sum/)
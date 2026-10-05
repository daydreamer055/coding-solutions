# House Robber

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and  **it will automatically contact the police if two adjacent houses were broken into on the same night**.

Given an integer array `nums` representing the amount of money of each house, return  *the maximum amount of money you can rob tonight  **without alerting the police***.

 

 **Example 1:** 

```
Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.

```

 **Example 2:** 

```
Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.

```

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 0 <= nums[i] <= 400

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.9 MB (beats 19.74%)  
**Submitted:** 2026-10-05T15:40:23.319Z  

```java
class Solution {
   public int amount(int[] nums,int i,int[] dp) {
         if(i>= nums.length) return 0;
         if(dp[i]!= -1) return dp[i];
        int take =nums[i] + amount(nums,i+2,dp);
        int skip = amount(nums, i+1,dp);
        return dp[i]= Math.max(take,skip);
    }

    public int rob(int[] nums) {
        // 'i' varies from 0 to n-1
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return amount(nums,0,dp);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/house-robber/)
# House Robber II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are  **arranged in a circle.**  That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and  **it will automatically contact the police if two adjacent houses were broken into on the same night**.

Given an integer array `nums` representing the amount of money of each house, return  *the maximum amount of money you can rob tonight  **without alerting the police***.

 

 **Example 1:** 

```
Input: nums = [2,3,2]
Output: 3
Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.

```

 **Example 2:** 

```
Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.

```

 **Example 3:** 

```
Input: nums = [1,2,3]
Output: 3

```

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 0 <= nums[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43 MB (beats 22.75%)  
**Submitted:** 2026-10-06T16:45:12.427Z  

```java
class Solution {
    public int money(int[] nums,int i ,int end, int[] dp  ){
        if(i>end) return 0;
        if(dp[i]!=-1) return dp[i];
        int mx = nums[i] + money(nums,i+2,end,dp);
        int skip = money(nums,i+1,end,dp);
        dp[i] = Math.max(mx,skip);
        return dp[i];
    }
    public int fin(int[]nums,int start,int end){
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return money(nums,start,end,dp);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
       int first = fin(nums,0,n-2);
       int second = fin(nums,1,n-1);
       return Math.max(first,second);
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/house-robber-ii/)
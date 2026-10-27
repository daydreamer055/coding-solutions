# Target Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums` and an integer `target`.

You want to build an  **expression**  out of nums by adding one of the symbols `'+'` and `'-'` before each integer in nums and then concatenate all the integers.

- For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".

Return the number of different  **expressions**  that you can build, which evaluates to `target`.

 

 **Example 1:** 

```
Input: nums = [1,1,1,1,1], target = 3
Output: 5
Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
-1 + 1 + 1 + 1 + 1 = 3
+1 - 1 + 1 + 1 + 1 = 3
+1 + 1 - 1 + 1 + 1 = 3
+1 + 1 + 1 - 1 + 1 = 3
+1 + 1 + 1 + 1 - 1 = 3

```

 **Example 2:** 

```
Input: nums = [1], target = 1
Output: 1

```

 

 **Constraints:** 

- 1 <= nums.length <= 20
- 0 <= nums[i] <= 1000
- 0 <= sum(nums[i]) <= 1000
- -1000 <= target <= 1000

## Solution

**Language:** Java  
**Runtime:** 11 ms (beats 51.33%)  
**Memory:** 46.4 MB (beats 32.97%)  
**Submitted:** 2026-10-27T16:38:37.804Z  

```java
class Solution {
    static int sum;
    public int ways(int i,int[] arr,int s,int target,int[][] dp){
        if(i== arr.length){
            if(s == target) return 1;
            else return 0;
        }
        if(dp[i][s+sum] != -1) return dp[i][s+sum];
    int add = ways(i+1,arr,s+arr[i],target,dp);
    int sub = ways(i+1,arr,s-arr[i],target,dp);
    return dp[i][s+sum] = add+sub;
    }
    public int findTargetSumWays(int[] nums, int target) {
       sum=0;
       int n = nums.length; 
       for(int ele:nums) sum+=ele;
       int[][] dp = new int[n][2*sum+1];
       for(int i=0;i<dp.length;i++){
        for(int j=0;j<dp[0].length;j++){
            dp[i][j] = -1;
        }
       }
       return ways(0,nums,0,target,dp);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/target-sum/)
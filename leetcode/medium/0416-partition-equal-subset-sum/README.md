# Partition Equal Subset Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums`, return `true`  *if you can partition the array into two subsets such that the sum of the elements in both subsets is equal or* `false` *otherwise*.

 

 **Example 1:** 

```
Input: nums = [1,5,11,5]
Output: true
Explanation: The array can be partitioned as [1, 5, 5] and [11].

```

 **Example 2:** 

```
Input: nums = [1,2,3,5]
Output: false
Explanation: The array cannot be partitioned into equal sum subsets.

```

 

 **Constraints:** 

- 1 <= nums.length <= 200
- 1 <= nums[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 125 ms (beats 5.94%)  
**Memory:** 75.6 MB (beats 17.43%)  
**Submitted:** 2026-10-25T09:01:32.405Z  

```java
class Solution {
     boolean subset(int i,int[] arr,int target, int[][] dp){
        if(i==arr.length){
            if(target == 0) return true;
            else return false;
        }
        if(dp[i][target] != -1) return (dp[i][target]==1);
        boolean ans = false;
        boolean skip = subset(i+1,arr,target,dp);
        if(target-arr[i]<0) ans = skip;
        else{
            boolean pick = subset(i+1,arr,target-arr[i],dp);
            ans = pick || skip;
        }
        if(ans) dp[i][target] =1;
        else dp[i][target] =0;
        return ans;
    }
    public boolean canPartition(int[] nums) {
        int s=0;
        for(int ele : nums) s+= ele;
        if(s%2!=0) return false;
        int sum = s/2;
        int n = nums.length;
        int[][] dp = new int[n][sum+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return subset(0,nums,sum,dp);

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/partition-equal-subset-sum/)
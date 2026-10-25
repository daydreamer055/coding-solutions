# Subset Sum Problem

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of positive integers  **arr[]**  and a value  **sum**, find if there is a subset of arr[] with sum equal to given sum. 

 **Examples:** 

```
Input: arr[] = [3, 34, 4, 12, 5, 2], sum = 9
Output: true 
Explanation: Here there exists a subset with target sum = 9, 4+3+2 = 9.

```

```
Input: arr[] = [3, 34, 4, 12, 5, 2], sum = 30
Output: false
Explanation: There is no subset with target sum 30.
```

```
Input: arr[] = [1, 2, 3], sum = 6
Output: true
Explanation: The entire array can be taken as a subset, giving 1 + 2 + 3 = 6.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T08:55:56.922Z  

```java
class Solution {
    static boolean subset(int i,int[] arr,int target, int[][] dp){
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
    static boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n = arr.length;
        int[][] dp = new int[n][sum+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return subset(0,arr,sum,dp);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1)
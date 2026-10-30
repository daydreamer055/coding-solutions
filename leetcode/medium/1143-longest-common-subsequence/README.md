# Longest Common Subsequence

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings `text1` and `text2`, return  *the length of their longest  **common subsequence**.* If there is no  **common subsequence**, return `0`.

A  **subsequence**  of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

- For example, "ace" is a subsequence of "abcde".

A  **common subsequence**  of two strings is a subsequence that is common to both strings.

 

 **Example 1:** 

```
Input: text1 = "abcde", text2 = "ace" 
Output: 3  
Explanation: The longest common subsequence is "ace" and its length is 3.

```

 **Example 2:** 

```
Input: text1 = "abc", text2 = "abc"
Output: 3
Explanation: The longest common subsequence is "abc" and its length is 3.

```

 **Example 3:** 

```
Input: text1 = "abc", text2 = "def"
Output: 0
Explanation: There is no such common subsequence, so the result is 0.

```

 

 **Constraints:** 

- 1 <= text1.length, text2.length <= 1000
- text1 and text2 consist of only lowercase English characters.

## Solution

**Language:** Java  
**Runtime:** 35 ms (beats 6.20%)  
**Memory:** 55 MB (beats 5.67%)  
**Submitted:** 2026-10-30T18:17:13.958Z  

```java
class Solution {
    static int[][] dp;
    public int lcs(int i,int j,StringBuilder a, StringBuilder b) {
        
        int m = a.length();
        int n = b.length();
        if(i<0 || j<0 ) return 0;
        if(dp[i][j] != -1) return dp[i][j];

        if(a.charAt(i) == b.charAt(j)){
            return dp[i][j] = 1+lcs(i-1,j-1,a,b); 
        }else{
            return dp[i][j] = Math.max(lcs(i-1,j,a,b),lcs(i,j-1,a,b));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
       
        StringBuilder a = new StringBuilder(text1);
         StringBuilder b = new StringBuilder(text2);
          int m = a.length();
        int n = b.length();
        dp = new int[m][n];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        return lcs(m-1,n-1,a,b);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-common-subsequence/)
# Longest Palindromic Subsequence

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, find  *the longest palindromic  **subsequence** 's length in*  `s`.

A  **subsequence**  is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.

 

Original
Java
 **Example 1:** 

```
Input: s = "bbbab"
Output: 4
Explanation: One possible longest palindromic subsequence is "bbbb".

```

 **Example 2:** 

```
Input: s = "cbbd"
Output: 2
Explanation: One possible longest palindromic subsequence is "bb".

```

 

 **Constraints:** 

- 1 <= s.length <= 1000
- s consists only of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 60 ms (beats 25.75%)  
**Memory:** 88 MB (beats 5.75%)  
**Submitted:** 2026-11-19T16:36:42.991Z  

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
    public String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
       sb.reverse();
       s = sb.toString();
       return s;
    }
    public int longestPalindromeSubseq(String s) {
        return longestCommonSubsequence(s,reverse(s));
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-palindromic-subsequence/)
# Minimum Insertion Steps to Make a String Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given a string `s`. In one step you can insert any character at any index of the string.

Return  *the minimum number of steps*  to make `s` palindrome.

A  **Palindrome String**  is one that reads the same backward as well as forward.

 

Original
Java
 **Example 1:** 

```
Input: s = "zzazz"
Output: 0
Explanation: The string "zzazz" is already palindrome we do not need any insertions.

```

 **Example 2:** 

```
Input: s = "mbadm"
Output: 2
Explanation: String can be "mbdadbm" or "mdbabdm".

```

 **Example 3:** 

```
Input: s = "leetcode"
Output: 5
Explanation: Inserting 5 characters the string becomes "leetcodocteel".

```

 

 **Constraints:** 

- 1 <= s.length <= 500
- s consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 48 ms (beats 6.45%)  
**Memory:** 47.7 MB (beats 13.87%)  
**Submitted:** 2026-11-26T04:48:21.756Z  

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
    public int minInsertions(String s) {
        return s.length()-longestPalindromeSubseq(s);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/)
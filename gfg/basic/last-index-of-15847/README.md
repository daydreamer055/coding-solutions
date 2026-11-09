# Last Index of One

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s** consisting only of '0' and '1', find the last index at which '1' occurs. If '1' is not present in the string, return -1.

 **Examples:** 

```
Input: s = "01001"
Output: 4
Explanation: Last index of  1 in given string is 4.

```

```
Input: s = "0"
Output: -1
Explanation: Since, 1 is not present, so output is -1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-09T10:47:27.496Z  

```java
class Solution {
    public int lastIndex(String s) {
        // code here
        int ans = -1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ans = Math.max(ans,i);
            }
        }
        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/last-index-of-15847/1)
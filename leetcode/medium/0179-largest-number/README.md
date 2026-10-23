# Largest Number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a list of non-negative integers `nums`, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.

 

 **Example 1:** 

```
Input: nums = [10,2]
Output: "210"

```

 **Example 2:** 

```
Input: nums = [3,30,34,5,9]
Output: "9534330"

```

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 0 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 29.27%)  
**Memory:** 44.2 MB (beats 98.19%)  
**Submitted:** 2026-10-23T17:03:08.740Z  

```java
class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] temp = new String[n];
        int idx=0;
        for(int i: nums){
         temp[idx++] = ""+i;
        }
        Arrays.sort(temp,(a,b) ->(b+a).compareTo(a+b));
        if(temp[0].equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for(String s: temp){
            sb.append(s);
        }
        return sb.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/largest-number/)
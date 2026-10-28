# Two Repeated Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array  **arr**  of size  **n+2**. All elements of the array are in the range from 1 to  **n**. Also, all elements occur once except two numbers which occur twice. Find the two repeating numbers.
 **Note:** Return the numbers in their order of appearing twice. So, if  **x**  and  **y**  are repeating numbers, and  **x** 's second appearance comes before the second appearance of  **y**, then the order should be (**x**,  **y**).

 **Examples:** 

```
Input: n = 4, arr[] = [1, 2, 1, 3, 4, 3]
Output: [1, 3]
Explanation: In the given array, 1 and 3 are repeated two times, and as 1's second appearance occurs before 2's second appearance, so the output should be 1 3.
```

```
Input: n = 2, arr[] = [1, 2, 2, 1]
Output: [2, 1]
Explanation: In the given array, 1 and 2 are repeated two times and second occurence of 2 comes before 1. So the output is 2 1.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-28T14:55:55.254Z  

```java
import java.util.*;

class Solution {
    public int[] twoRepeated(int[] arr) {
        int[] ans = new int[2];
        HashSet<Integer> set = new HashSet<>();
        int idx = 0;

        for (int num : arr) {
            if (set.contains(num)) {
                ans[idx++] = num;
                if (idx == 2) {
                    break;
                }
            } else {
                set.add(num);
            }
        }

        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/two-repeated-elements-1587115621/1)
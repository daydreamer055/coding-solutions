# Maximize Adjacent Diff Sum in Circular

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[ ]**  of positive elements. Consider the array as a circular array, meaning the element after the last element is the first element of the array. The task is to find the maximum sum of the absolute differences between consecutive elements with shuffling of array elements allowed  *i.e*. shuffle the array elements and make [ **a1**.. **an** ] such order that   **|a1 – a2| + |a2 – a3| + …… + |an-1 – an| + |an – a1|** is maximized.

 **Examples:** 

```
Input: arr[] = [4, 2, 1, 8]
Output: 18
Explanation: After Shuffling, we get [1, 8, 2, 4]. Sum of absolute difference between consecutive elements after rearrangement = |1 - 8| + |8 - 2| + |2 - 4| + |4 - 1| = 7 + 6 + 2 + 3 = 18.
```

```
Input: arr[] = [10, 12]
Output: 4
Explanation: No need of rearrangement. Sum of absolute difference between consecutive elements = |10 - 12| + |12 - 10| = 2 + 2 = 4.
```

 **Constraints:** 
2 ≤ arr.size()≤ 105
1 <= arr[i] <= 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-08T15:43:57.976Z  

```java
class Solution {
    public long maxSum(Long[] arr) {
        // code here
        Arrays.sort(arr);
        int n =arr.length;
        ArrayList<Long> ans = new ArrayList<>();
        int i=0;
        int j= n-1;
        while(i<j){
            ans.add(arr[i]);
            ans.add(arr[j]);
            i++;
            j--;
        }
        long res =0;
        for(int k=0;k<ans.size()-1;k++){
            res = res+ Math.abs(ans.get(k)-ans.get(k+1));
        }
        res = res + Math.abs(ans.get(ans.size()-1)-ans.get(0));
        return res;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/swap-and-maximize5859/1)
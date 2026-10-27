# First Repeating Element

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[],**  find the first repeating element position. The element should occur more than once and the position (from left) of its first occurrence should be the smallest.

 **Note:** The position you return should be according to 1-based indexing. 

 **Examples:** 

```
Input: arr[] = [1, 5, 3, 4, 3, 5, 6]
Output: 2
Explanation: 5 appears twice and its first appearance is at position 2 which is less than 3 whose first the occurring position is 3.
```

```
Input: arr[] = [1, 2, 3, 4]
Output: -1
Explanation: All elements appear only once so answer is -1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T16:52:57.608Z  

```java
class Solution {
    public int firstRepeated(int[] arr) {
        // code here
        int ans =Integer.MAX_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                ans = Math.min(ans,map.get(arr[i]));
            }
            else{
                map.put(arr[i],i+1);
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/first-repeating-element4018/1)
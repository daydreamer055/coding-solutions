# elements-in-the-range2834

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-09T10:51:14.731Z  

```java
class Solution {
    public boolean checkElements(int start, int end, int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet();
        for(var v:arr){
            set.add(v);
        }
        for(int i= start;i<=end ; i++){
            if(!set.contains(i)){
                return false;
            }
        }
        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/elements-in-the-range2834/1)
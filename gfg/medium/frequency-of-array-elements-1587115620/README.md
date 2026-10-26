# frequency-of-array-elements-1587115620

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-26T14:47:56.665Z  

```java
class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        // code here
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=1;i<=n;i++){
            ans.add(map.getOrDefault(i,0));
        }
        return ans;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1)
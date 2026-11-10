# count-1s-in-binary-array-1587115620

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-10T15:32:03.570Z  

```java
class Solution {
    public int countOnes(int[] arr) {
        // code here
        int i=0;
        
        int j = arr.length-1;
        int count=0;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid]==1){
                count+=1+mid-i;
                i= mid+1;
            }
            if(arr[mid]==0){
                j= mid-1;
            }
        }
        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-1s-in-binary-array-1587115620/1)
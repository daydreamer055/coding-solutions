# find-transition-point-1587115620

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-31T17:13:17.166Z  

```java
class Solution {
    int transitionPoint(int arr[]) {
        // code here
        int i=0;
        int j= arr.length -1;
        int res = -1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid]==1 ){
                res=mid;
                j=mid-1;
            }
            else 
            i = mid+1;
        }
        return res;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-transition-point-1587115620/1)
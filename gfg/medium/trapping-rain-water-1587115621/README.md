# trapping-rain-water-1587115621

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-13T13:27:06.804Z  

```java
class Solution {
    public int maxWater(int arr[]) {
        // code here
        int l=0,r=arr.length-1,lm=0,rm=0,total=0;
        while(l<r){
            if(arr[l]<=arr[r]){
                if(arr[l]>= lm){
                    lm = arr[l];
                }
                else{
                    total+=lm-arr[l];
                }
                l++;
            }
            else{
                if(arr[r]>=rm){
                    rm = arr[r];
                }
                else{
                    total+=rm-arr[r];
                }
                 r--;
            }
           
        }
        return total;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1)
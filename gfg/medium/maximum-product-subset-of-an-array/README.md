# Max Product Subset

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[],**  find and return the maximum product possible with the subset of elements present in the array.

 **Note:** The maximum product can be of a single element also. Since the product can be large, return it modulo 109 + 7.

 **Examples:** 

```
Input: arr[] = [-1, 0, -2, 4, 3]
Output: 24
Explanation: Maximum product will be (-1  *-2*  4 * 3) = 24
```

```
Input: arr[] = [-1, 0]
Output: 0
Explanation: Maximum product will be (-1  *  0) = 0

```

```
Input: arr[] = [5]
Output: 5
Explanation: Maximum product will be 5.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T05:25:45.866Z  

```java
class Solution {
    public int findMaxProduct(int[] arr) {
        // code here
        int n = arr.length;
        if(n==1) return arr[0];
        long ans =1;
        int mod = (int)1e9 +7;
        int zc=0,nc=0;
        int maxNeg = Integer.MIN_VALUE , idxMaxNeg = -1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zc++;
            }
            else if(arr[i]<0){
                nc++;
                if(idxMaxNeg == -1 || arr[i]>maxNeg){
                    maxNeg = arr[i];
                    idxMaxNeg = i;
                }
            }
        }
        if(zc == n) return 0;
        if(nc == 1 && zc== n-1) return 0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) continue;
            if(nc%2 == 1 && i== idxMaxNeg) continue;
            ans = ((ans*arr[i])%mod + mod)%mod;
        }
        return (int)ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximum-product-subset-of-an-array/1)
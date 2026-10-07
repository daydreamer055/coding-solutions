# maximize-sum-after-k-negations1149

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T05:44:53.532Z  

```java
class Solution {
    public int maximizeSum(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int i=0;
       while(k>0 && i<n && arr[i]<0 ){
           
          arr[i] = arr[i]* -1;
           
           i++;
           k--;
       }
       Arrays.sort(arr);
       while(k>0){
           arr[0] = -arr[0];
           k--;
       }
       long ans =0;
       for(int j=0;j<n;j++){
           ans = ans + arr[j];
       }
       return (int)ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximize-sum-after-k-negations1149/1)
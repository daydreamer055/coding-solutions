# quick-sort

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T15:32:57.206Z  

```java
class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        // code
               if(low < high) {
                   int partitionIndex = partition(arr, low, high);
                   quickSort(arr, low, partitionIndex-1);
                   quickSort(arr, partitionIndex+1, high);
               }
        
    }

    private int partition(int[] arr, int low, int high) {
        // code here
        int i = low;
               int j = high;
               int pivot = arr[low];
               while(i < j) {
                   while(arr[i] <= pivot && i< high) {
                       i++;
                   }
                   while(arr[j] > pivot && j > low) {
                       j--;
                   }

                   if(i < j) {
                       int temp = arr[i];
                       arr[i] = arr[j];
                       arr[j] = temp;
                   }
               }
               int temp = arr[low];
               arr[low] = arr[j];
               arr[j] = temp;
               return j;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/quick-sort/1)
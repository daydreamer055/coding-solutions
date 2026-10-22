# Median in a Row-Wise Sorted Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a row-wise sorted matrix  **mat[][]**, where the number of rows and columns is always  **odd**. Return the  **median**  of the matrix.

 **Examples:** 

```
Input: mat[][] = [[1, 3, 5], [2, 6, 9], [3, 6, 9]]
Output: 5
Explanation: Sorting matrix elements gives us [1, 2, 3, 3, 5, 6, 6, 9, 9]. Hence, 5 is median.

```

```
Input: mat[][] = [[2, 4, 9], [3, 6, 7], [4, 7, 10]]
Output: 6
Explanation: Sorting matrix elements gives us [2, 3, 4, 4, 6, 7, 7, 9, 10]. Hence, 6 is median.
```

```
Input: mat = [[3], [4], [8]]
Output: 4
Explanation: Sorting matrix elements gives us [3, 4, 8]. Hence, 4 is median.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-22T16:52:40.949Z  

```java
class Solution {
    public int median(int[][] mat) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int m = mat.length;
        int n = mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans.add(mat[i][j]);
            }
        }
        Collections.sort(ans);
        int mid = ans.size()/2 ;
        return ans.get(mid);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1)
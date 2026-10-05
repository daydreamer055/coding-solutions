# Minimum Cost to cut a board into squares

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a board of dimensions  **n × m**  that needs to be divided into 1 × 1 squares. The cost of making cuts is given in two arrays:

- x[] represents costs of making different vertical cuts from 1 to m-1.
- y[] represents costs of making different horizontal cuts from 1 to n-1.
- The cost of a vertical cut is multiplied by the current number of horizontal segments.
- The cost of a horizontal cut is multiplied by the current number of vertical segments.

Find the minimum total cost required to divide the entire board into 1 × 1 squares.

**Examples:
**

```
Input: n = 3, m = 3, x[] = [2, 1], y[] = [4, 3]
Output: 16
Explanation:
 
So, the total cost = 4 + 3 + 6 + 3  = 16.
```

```
Input: n = 2, m = 3, x[] = [2, 1], y[] = [3]
Output: 9
Explanation:

So, the total cost = 3 + 3 + 3 = 9.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T10:17:25.296Z  

```java
class Solution {
    public int minCost(int n, int m, int[] x, int[] y) {
        // code here
        Arrays.sort(x);
        Arrays.sort(y);
        
        int i = x.length -1;
        int j = y.length -1;
        
        int vertical = 1;
        int horizontal =1;
        
        int cost =0;
        
        while(i>= 0 && j>=0 ){
            if(x[i] > y[j]){
                cost+= x[i]*horizontal;
                vertical++;
                i--;
            }
            else{
                cost+= y[j]*vertical;
                horizontal++;
                j--;
            }
        }
        while(i>=0){
            cost+= x[i]*horizontal;
            i--;
            
        }
        while(j >=0){
            cost += y[j]*vertical;
            j--;
        }
        return cost;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/minimum-cost-to-cut-a-board-into-squares/1)
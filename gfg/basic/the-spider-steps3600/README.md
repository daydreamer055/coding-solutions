# Spider Steps

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given three integers  **h**,  **u**, and  **d**, representing the height of a well, the distance a spider climbs in each step, and the distance it slips after each step, respectively.

- In every step, the spider first climbs u units.
- If the spider reaches or exceeds the top of the well after climbing, it escapes immediately and does not slip back.
- Otherwise, it slips down by d units.

Return the minimum number of steps required for the spider to escape. If it is impossible for the spider to escape, return  **-1**.

 **Examples:** 

```
Input: h = 200, u = 50, d = 1
Output: 5
Explanation: Step 1: 0 → 50 → 49
Step 2: 49 -> 99 -> 98
Step 3: 98 -> 148 -> 147
Step 4: 147 -> 197 -> 196
Step 5: 196 -> 246 (escapes)
```

```
Input: h = 100, u = 5, d = 3
Output: 49
Explanation: After each completed step, the spider makes a net gain of u − d = 2 units. After 48 steps, it is at height 96. On the 49th step, it climbs from 96 to 101, reaches the top of the well, and escapes without slipping back.

```

 **Constraints:** 
50 ≤ h ≤ 1000
0 ≤ d < u ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T16:58:35.987Z  

```java
class Solution {
    public int minStep(int h, int u, int d) {
        // code here
        int count =0;
        int n=0;
       while(n<h){
           n= n+u;
           count++;
           if(n>=h){
               return count;
           }
           n-=d;
       }
       return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/the-spider-steps3600/1)
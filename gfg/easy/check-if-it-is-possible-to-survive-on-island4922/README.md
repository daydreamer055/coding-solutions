# Check for Survival on Island

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Geekina got stuck on an island. There is only one shop on this island and it is open on all days of the week except for Sunday. Consider following constraints:

- N – The maximum unit of food you can buy each day.
- S – Number of days you are required to survive.
- M – Unit of food required each day to survive.

Currently, it’s Monday, and she needs to survive for the next S days, initially she has no food.
Find the **minimum** number of days on which you need to buy food from the shop so that she can survive the next  **S** days. If it is not possible to survive for S days then return -1.

 **Examples:** 

```
Input: S = 10, N = 16, M = 2
Output: 2
Explaination: One possible solution is to buy a box on the first day (Monday), it’s sufficient to eat from this box up to 8th day (Monday) inclusive. Now, on the 9th 
day (Tuesday), you buy another box and use the chocolates in it to survive the 9th and 10th day.
```

```
Input: S = 10, N = 9, M = 8
Output: -1
Explaination: Let's start by detailing the days of the week and the net number of food units available after purchasing and consuming them:
Monday - Net 1 food unit available.
Tuesday - Net 2 food units available.
Wednesday - Net 3 food units available.
Thursday - Net 4 food units available.
Friday - Net 5 food units available.
Saturday - Net 6 food units available.
Sunday - 6 food units available and that is not sufficient amount of food units to survive and you can't buy more on Sunday.
```

 **Constraints:** 
1 ≤ N, S ≤ 50
1 ≤ M ≤ 30

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T05:13:32.446Z  

```java
class Solution {
    public int minimumDays(int S, int N, int M) {
        // code here
        if(((N*6)< (M*7) && S>6 ) || M>N) return -1;
        else {
            int days = (M*S)/N;
            if((M*S)%N !=0) days++;
         return days;
        }
       
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-it-is-possible-to-survive-on-island4922/1)
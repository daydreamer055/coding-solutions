# Even Positioned Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given a  **String S**, you need to print its characters at even indices(index starts at 0).

 **Examples:** 

```
Input: s = "Geeks"
Output: Ges
Explanation: The even indices (0, 2 & 4) characters are printed.
```

```
Input: s = "DoctorPhenomenal"
Output: DcoPeoea
Explanation: The even indices characters are printed.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T17:12:24.656Z  

```java
class Solution {
    public static void utility(String s) {
        // code here
        char[] arr = s.toCharArray();
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.print(arr[i]);
                
            }
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/for-loop-2/1)
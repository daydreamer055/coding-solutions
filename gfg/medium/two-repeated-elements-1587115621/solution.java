import java.util.*;

class Solution {
    public int[] twoRepeated(int[] arr) {
        int[] ans = new int[2];
        HashSet<Integer> set = new HashSet<>();
        int idx = 0;

        for (int num : arr) {
            if (set.contains(num)) {
                ans[idx++] = num;
                if (idx == 2) {
                    break;
                }
            } else {
                set.add(num);
            }
        }

        return ans;
    }
}
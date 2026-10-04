class Solution {
    public int minRotations(String s) {
        int n = s.length();
        int ans = 0;
        int current =0;
        for(int i =0;i<n;i++){
            int next = s.charAt(i) - '0';
            int diff = Math.abs(current - next);
            
            ans = ans + Math.min(diff,10 - diff);
            current = next;
        }
        return ans;
    }
}
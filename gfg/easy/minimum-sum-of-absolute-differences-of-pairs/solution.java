class Solution {
    public int findMinSum(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        int n = a.length;
        int ans =0;
        for(int i=0;i<n;i++){
            ans = ans + Math.abs(a[i] - b[i]);
        }
        return ans;
    }
};
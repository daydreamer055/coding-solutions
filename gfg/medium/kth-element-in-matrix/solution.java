class Solution {
    public int kthSmallest(int[][] mat, int k) {
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
        return ans.get(k-1);
    }
}

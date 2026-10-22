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
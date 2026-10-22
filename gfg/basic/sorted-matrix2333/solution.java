class Solution {
    public int[][] sortedMatrix(int mat[][]) {
        // code here
        int m = mat.length;
        int n = mat[0].length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans.add(mat[i][j]);
            }
        }
        Collections.sort(ans);
        int k=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = ans.get(k);
                k++;
            }
        }
        return mat;
    }
}
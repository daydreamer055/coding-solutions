class Solution {
    public long maxSum(Long[] arr) {
        // code here
        Arrays.sort(arr);
        int n =arr.length;
        ArrayList<Long> ans = new ArrayList<>();
        int i=0;
        int j= n-1;
        while(i<j){
            ans.add(arr[i]);
            ans.add(arr[j]);
            i++;
            j--;
        }
        long res =0;
        for(int k=0;k<ans.size()-1;k++){
            res = res+ Math.abs(ans.get(k)-ans.get(k+1));
        }
        res = res + Math.abs(ans.get(ans.size()-1)-ans.get(0));
        return res;
    }
}

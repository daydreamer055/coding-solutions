class Solution {
    public int lastIndex(String s) {
        // code here
        int ans = -1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ans = Math.max(ans,i);
            }
        }
        return ans;
    }
}
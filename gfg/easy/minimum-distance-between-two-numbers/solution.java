class Solution {
    int minDist(int arr[], int x, int y) {
        // code here
        int ans = Integer.MAX_VALUE;
        int n = arr.length;
        HashMap<Integer,Integer>mp = new HashMap<>();
        for(int i=0;i<n;i++){
            if(arr[i]==x || arr[i]==y){
                mp.put(arr[i],i);
            }
            if(mp.containsKey(x) && mp.containsKey(y)){
                ans = Math.min(ans,Math.abs(mp.get(x)-mp.get(y)));
            }
        }
         return ans == Integer.MAX_VALUE ? -1 : ans;
        }
}
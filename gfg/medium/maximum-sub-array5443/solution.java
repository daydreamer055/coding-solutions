class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        // code here
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int maxsum=-1;
        int sum=0;
        int start=0;
        int end =-1;
        int tempstart=0;
        for(int i=0;i<n;i++){
            
            if(arr[i]>=0){
                sum+=arr[i];
                if(sum > maxsum || (sum== maxsum && (i-tempstart>end-start)) ){
                maxsum= sum;
                start = tempstart;
                end =i;
            }
            }
            else{
                    sum=0;
                     tempstart= i+1;
                 }
        }
        if(end == -1){
            ans.add(-1);
            return ans;
        }
        for(int i= start;i<=end;i++){
            ans.add(arr[i]);
        }
        return ans;
    }
}
class Solution {
    public int maxWater(int arr[]) {
        // code here
        int l=0,r=arr.length-1,lm=0,rm=0,total=0;
        while(l<r){
            if(arr[l]<=arr[r]){
                if(arr[l]>= lm){
                    lm = arr[l];
                }
                else{
                    total+=lm-arr[l];
                }
                l++;
            }
            else{
                if(arr[r]>=rm){
                    rm = arr[r];
                }
                else{
                    total+=rm-arr[r];
                }
                 r--;
            }
           
        }
        return total;
    }
}

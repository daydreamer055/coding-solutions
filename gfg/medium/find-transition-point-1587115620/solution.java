class Solution {
    int transitionPoint(int arr[]) {
        // code here
        int i=0;
        int j= arr.length -1;
        int res = -1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid]==1 ){
                res=mid;
                j=mid-1;
            }
            else 
            i = mid+1;
        }
        return res;
    }
}
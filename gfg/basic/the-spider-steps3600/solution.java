class Solution {
    public int minStep(int h, int u, int d) {
        // code here
        int count =0;
        int n=0;
       while(n<h){
           n= n+u;
           count++;
           if(n>=h){
               return count;
           }
           n-=d;
       }
       return count;
    }
}
class Solution {
    public int minCost(int n, int m, int[] x, int[] y) {
        // code here
        Arrays.sort(x);
        Arrays.sort(y);
        
        int i = x.length -1;
        int j = y.length -1;
        
        int vertical = 1;
        int horizontal =1;
        
        int cost =0;
        
        while(i>= 0 && j>=0 ){
            if(x[i] > y[j]){
                cost+= x[i]*horizontal;
                vertical++;
                i--;
            }
            else{
                cost+= y[j]*vertical;
                horizontal++;
                j--;
            }
        }
        while(i>=0){
            cost+= x[i]*horizontal;
            i--;
            
        }
        while(j >=0){
            cost += y[j]*vertical;
            j--;
        }
        return cost;
    }
}

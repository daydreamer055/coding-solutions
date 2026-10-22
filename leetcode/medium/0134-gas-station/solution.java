class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas =0,totalcost=0;
        for(int i=0;i<gas.length;i++){
            totalgas+=gas[i];
            totalcost+=cost[i];
        }
        if(totalgas<totalcost) return -1;
        int remaingas=0, start=0;
        for(int i=0;i<gas.length;i++){
            remaingas = remaingas +(gas[i]-cost[i]);
            if(remaingas <0){
                start = i+1;
                remaingas=0;
            }
        }
        return start;
    }
}
class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] temp = new String[n];
        int idx=0;
        for(int i: nums){
         temp[idx++] = ""+i;
        }
        Arrays.sort(temp,(a,b) ->(b+a).compareTo(a+b));
        if(temp[0].equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for(String s: temp){
            sb.append(s);
        }
        return sb.toString();
    }
}
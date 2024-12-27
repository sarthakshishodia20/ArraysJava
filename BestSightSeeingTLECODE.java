class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<values.length-1;i++){
            for(int j=i+1;j<values.length;j++){
                int sum=values[i]+values[j];
                max=Math.max(max,sum+i-j);
            }
        }
        return max;
    }
}

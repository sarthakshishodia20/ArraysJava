class Solution {
    // jahan jahan trip start or end ho rhi hai uss location pr capacity ko put kr dijie or end mein array ke andr check krenge agr capacity greater ho rhi hai required se tb toh false hi hai vrna toh capacity negative pr bhi ans false hi aaega 
    public boolean carPooling(int[][] trips, int capacity) {
        int[] m=new int[1001];
        for(int i=0;i<trips.length;i++){
            int cap=trips[i][0];
            int start=trips[i][1];
            int end=trips[i][2];
            m[start]+=cap;
            m[end]-=cap;
        }
        for(int i=0;i<m.length && capacity>=0;i++){
            capacity=capacity-m[i];
        }
        return capacity>=0;
    }
}

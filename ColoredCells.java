class Solution {
    public long coloredCells(int n) {
        long count=1;
        int xFactor=4;
        while(n-1>0){
            count+=xFactor;
            xFactor+=4;
            n--;
        }
        return count;
    }
}

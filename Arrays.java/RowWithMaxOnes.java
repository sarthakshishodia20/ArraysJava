class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxOnes=0;
        int maxIndex=0;
        int index=0;
        for(int[] row:mat){
            int countOnes=0;
            for(int i=0;i<row.length;i++){
                if(row[i]==1){
                    countOnes++;
                }
            }
            if(countOnes>maxOnes){
                maxOnes=countOnes;
                maxIndex=index;
            }
            index++;
        }
        return new int[]{maxIndex,maxOnes};
    }
}

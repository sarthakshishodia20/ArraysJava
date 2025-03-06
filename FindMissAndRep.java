class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }
        int[] res=new int[2];
        int n=grid.length;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int frequency=entry.getValue();
            if(frequency>1){
                res[0]=entry.getKey();
                break;
            }
        }
        for(int i=1;i<=n*n;i++){
            int value=i;
            if(!map.containsKey(value)){
                res[1]=i;
                break;
            }
        }
        return res;
    }
}

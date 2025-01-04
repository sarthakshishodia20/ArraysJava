class Solution {
    // Sbke indexes stored kie uske baad baari baari bottom se up aaye from left to right in column wise and element get krke stroe krte gye unke respective indexes pr 
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        int size=0;
        for(int row=nums.size()-1;row>=0;row--){
            for(int col=0;col<nums.get(row).size();col++){
                int index=row+col;
                if(map.containsKey(index)){
                    map.get(index).add(nums.get(row).get(col));
                }
                else{
                    List<Integer> list=new ArrayList<>();
                    list.add(nums.get(row).get(col));
                    map.put(index,list);
                }
                size++;
            }
        }
        int[] ans=new int[size];
        int current=0;
        int index=0;
        while(map.containsKey(current)){
            for(int ele:map.get(current)){
                ans[index++]=ele;
            }
            current++;
        }
        return ans;
    }
}

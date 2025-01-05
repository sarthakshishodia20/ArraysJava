class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                list.add(i);
            }
        }
        for(int i=1;i<list.size();i++){
            int current=list.get(i);
            int previous=list.get(i-1);
            if(Math.abs(current-previous)>k){
                continue;
            }
            else{
                return false;
            }
            
        }
        return true;
    }
}

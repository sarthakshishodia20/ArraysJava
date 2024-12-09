class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            int left=nums[i];
            int right=nums[i+1];
            if(left%2==0 && right%2==0){
                return false;
            }
            if(left%2!=0 && right%2!=0){
                return false;
            }
        }
        return true;
    }
}

class Solution {
    public int maxProduct(int[] nums) {
        int leftProduct=1;
        int ans=Integer.MIN_VALUE;
        int rightProduct=1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            leftProduct=leftProduct==0?1:leftProduct;
            rightProduct=rightProduct==0?1:rightProduct;

            leftProduct=leftProduct*nums[i];
            rightProduct=rightProduct*nums[n-i-1];
            ans=Math.max(ans,Math.max(leftProduct,rightProduct));
        }
        return ans;
    }
}

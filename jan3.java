class Solution {
    // Using Prefixes hrr baar prefixes mein add krte jao uske baad suffix ka calculate krne ke liye totalSum-prefix and count number of times if prefix is greater equal than suffixes...!
    public int waysToSplitArray(int[] nums) {
        int count=0;
        long prefix=0;
        long totalSum=0;
        for(int ele:nums){
            totalSum+=ele;
        }
        for(int i=0;i<nums.length-1;i++){
            prefix+=nums[i];
            long suffix=totalSum-prefix;
            if(prefix>=suffix){
                count++;
            }
        }
        return count;
    }
}

class Solution {
    // total sum nikala array ka
    // uske baad jo bhi elements remove honge vo ya toh sbse leftmost honge ya sbse rightmost
    // remaining beech ke jo bchenge = remaining element subarray 
    // total sum mein se x reduce kia remaining elements ka sum aa gya targetSum
    // array mein vo subarry dhundo jiska sum targetsum ke equal ho or maximum length ka o usko htaenge toh vhi elements bchenge jo reduce hone hai and vhi hmara ans hoga that is mnimum operation to reduce x...
    public int minOperations(int[] nums, int x) {
        int sum=0;
        for(int ele:nums){
            sum+=ele;
        }
        int targetSum=sum-x;
        int currSum=0;
        int i=0;
        int j=0;
        int n=nums.length;
        int maxLen=0;
        boolean found=false;
        while(j<n){
            currSum+=nums[j];
            while(i<=j && currSum>targetSum){
                currSum=currSum-nums[i];
                i++;
            }
            if(currSum==targetSum){
                maxLen=Math.max(maxLen,(j-i+1));
                found=true;
            }
            j++;
        }
        // remaining element sum-targetSum = numberofoperation to reduce x to zero
        return found?n-maxLen:-1;
    }
}

class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int index = nums[i];
            if (index == 0) {
                result[i] = nums[i];
            } else if (index > 0) {
                result[i] = getElementFromRight(index, nums, i, n);
            } else {
                result[i] = getElementFromLeft(Math.abs(index), nums, i, n);
            }
        }
        return result;
    }
    
    private int getElementFromRight(int steps, int[] nums, int start, int n) {
        int targetIndex = (start + steps) % n;
        return nums[targetIndex];
    }
    
    private int getElementFromLeft(int steps, int[] nums, int start, int n) {
        int targetIndex = (start - steps % n + n) % n;
        return nums[targetIndex];
    }
}

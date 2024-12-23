class Solution {
    public boolean findSubarrays(int[] nums) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (j < n) {
            int sum = 0;
            if ((j - i + 1) < 2) {
                j++;
            } 
            else if ((j - i + 1) == 2) {
                for (int k = i; k <= j; k++) {
                    sum += nums[k]; 
                }
                map.put(sum, map.getOrDefault(sum, 0) + 1);
                if (map.get(sum) == 2) {
                    return true; 
                }
                j++;
            }
            else {
                i++;  
            }
        }
        return false;  
    }
}

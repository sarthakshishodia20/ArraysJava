class Solution {
    // TreeMap method hai to get min and max element from sorted map at anytime is map.lastEntry().getKey() and map.firstEntry().getKey() should not be greater than 2 otherwise left se remove krte jao
    public long continuousSubarrays(int[] nums) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        long count = 0;
        while (j < n) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            while (map.lastEntry().getKey() - map.firstEntry().getKey() > 2) {
                map.put(nums[i], map.get(nums[i]) - 1);
                if (map.get(nums[i]) == 0) {
                    map.remove(nums[i]);
                }
                i++;
            }
            count += (j - i + 1);
            j++;
        }
        return count;
    }
}

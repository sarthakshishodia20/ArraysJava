class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> bannedSet = new HashSet<>();
        for (int ele : banned) {
            bannedSet.add(ele);
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (!bannedSet.contains(i) && (sum + i) <= maxSum) {
                sum += i;
                list.add(i);
            }
        }
        return list.size();
    }
}

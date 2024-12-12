class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int candy = 1;
        while (candies > 0) {
            for (int i = 0; i < ans.length; i++) {
                if (candies < candy) {
                    ans[i] += candies;
                    candies = 0;
                    break;
                } else {
                    ans[i] += candy;
                    candies -= candy;
                    candy++;
                }
            }
        }
        return ans;
    }
}

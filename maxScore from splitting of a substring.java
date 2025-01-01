class Solution {
    public int maxScore(String s) {
        int maxScore = 0;
        int n = s.length();
        for (int i = 1; i < n; i++) {
            String left = s.substring(0, i);
            String right = s.substring(i);
            int leftZeroes = 0;
            for (char c : left.toCharArray()) {
                if (c == '0') {
                    leftZeroes++;
                }
            }
            int rightOnes = 0;
            for (char c : right.toCharArray()) {
                if (c == '1') {
                    rightOnes++;
                }
            }
            int currentScore = leftZeroes + rightOnes;
            maxScore = Math.max(maxScore, currentScore);
        }
        return maxScore;
    }
}

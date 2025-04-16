import java.util.*;

public class Solution {
    public int uniquePathsWithObstacles(ArrayList<ArrayList<Integer>> A) {
        int[][] grid = new int[A.size()][A.get(0).size()];
        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < A.get(0).size(); j++) {
                grid[i][j] = A.get(i).get(j);
            }
        }

        int n = grid.length;
        int m = grid[0].length;
        if (grid[0][0] == 1 || grid[n - 1][m - 1] == 1) return 0;

        int[][] dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return helper(n - 1, m - 1, grid, dp);
    }

    public static int helper(int i, int j, int[][] grid, int[][] dp) {
        if (i < 0 || j < 0) return 0;
        if (grid[i][j] == 1) return 0;
        if (i == 0 && j == 0) return 1;

        if (dp[i][j] != -1) return dp[i][j];

        int up = helper(i - 1, j, grid, dp);
        int left = helper(i, j - 1, grid, dp);

        dp[i][j] = up + left;
        return dp[i][j];
    }
}

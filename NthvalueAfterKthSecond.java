class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int MOD = 1_000_000_007;
        int[] arr = new int[n];
        Arrays.fill(arr, 1); 
        while (k-- > 0) {
            int[] prefixSum = new int[n];
            prefixSum[0] = arr[0];
            for (int i = 1; i < n; i++) {
                prefixSum[i] = (prefixSum[i - 1] + arr[i]) % MOD;
            }
            arr = prefixSum;
        }
        return arr[n - 1]; 
    }
}

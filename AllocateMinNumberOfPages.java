class Solution {
    // Variation of  Binary Search Minimum number of allocationto books Striver Sheet Explaination 
    public int splitArray(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int ele : nums) {
            max = Math.max(max, ele);
            sum += ele;
        }
        int low = max;
        int high = sum;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isValid(nums, mid, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static boolean isValid(int[] arr, int pagesAllowed, int k) {
        int students = 1; 
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (totalSum + arr[i] > pagesAllowed) {
                students++;
                totalSum = arr[i];
                if (students > k) return false;
            } else {
                totalSum += arr[i];
            }
        }
        return students <= k;
    }
}
